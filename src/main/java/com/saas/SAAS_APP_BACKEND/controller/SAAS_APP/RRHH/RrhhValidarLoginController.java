package com.saas.SAAS_APP_BACKEND.controller.SAAS_APP.RRHH;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhUsuarios;
import com.saas.SAAS_APP_BACKEND.service.SAAS_APP.RRHH.RrhhUsuariosService;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/validarLogin")
public class RrhhValidarLoginController {
    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(RrhhValidarLoginController.class);

    @Autowired
    private RrhhUsuariosService rrhhUsuariosService;

    @GetMapping("")
    public ResponseEntity<Map<String, Object>> validarLogin(@RequestParam String username,
            @RequestParam String password) {
        LOGGER.info("Validando login para el usuario: {}", username);

        RrhhUsuarios usuario = rrhhUsuariosService.findByUsername(username);

        if (usuario == null) {
            LOGGER.warn("Usuario no encontrado: {}", username);
            return ResponseEntity.status(401).body(Collections.singletonMap("error", "Usuario no encontrado"));
        }

        // Validar la contraseña usando BCrypt
        boolean passwordMatches = rrhhUsuariosService.validarPassword(password, usuario.getPassword());
        if (!passwordMatches) {
            LOGGER.warn("Contraseña incorrecta para el usuario: {}", username);
            return ResponseEntity.status(401).body(Collections.singletonMap("error", "Contraseña incorrecta"));
        }

        // Validar si el usuario está activo
        if (usuario.getEstado() == null || !usuario.getEstado().equals(1)) {
            LOGGER.warn("Usuario inactivo: {}", username);
            return ResponseEntity.status(403)
                    .body(Collections.singletonMap("error", "Usted ya no pertenece a la Institución"));
        }

        LOGGER.info("Login exitoso para el usuario: {}", username);

        // Retornar el mensaje y el id_persona en la respuesta
        Integer idPersona = usuario.getPersona().getIdPersona();
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Login exitoso para el usuario: " + username);
        response.put("idPersona", idPersona);
        return ResponseEntity.ok(response);
    }
}