package com.saas.SAAS_APP_BACKEND.controller.SAAS_APP.RRHH;

import java.util.List; // Importación correcta
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhFicha;
import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhPersonaFotografia;
import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhUsuarios;
import com.saas.SAAS_APP_BACKEND.service.SAAS_APP.RRHH.RrhhFichaService;
import com.saas.SAAS_APP_BACKEND.service.SAAS_APP.RRHH.RrhhPersonaFotografiaService;
import com.saas.SAAS_APP_BACKEND.service.SAAS_APP.RRHH.RrhhUsuariosService;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/rrhh")
@RequiredArgsConstructor
public class RrhhUsuariosController {
    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(RrhhUsuariosController.class);

    @Autowired
    RrhhPersonaFotografiaService rrhhPersonaFotografiaService;

    @Autowired
    RrhhFichaService rrhhFichaService;

    @Autowired
    RrhhUsuariosService rrhhUsuariosService;

    @GetMapping("/usuarios")
    public List<RrhhUsuarios> getUsuariosRrhh() {
        LOGGER.info("Obteniendo todos los usuarios");
        return rrhhUsuariosService.getAllUsuarios();
    }

    @GetMapping("ficha/{idPersona}")
    public RrhhFicha mostrarFicha(@PathVariable Integer idPersona) {
        LOGGER.info("Obteniendo la ficha de la persona con ID: " + idPersona);
        return rrhhFichaService.getFichaPersona(idPersona); // Devuelve los datos como JSON
    }

    // Obtener fotografías por idPersona
    @GetMapping("/fotografia/{idPersona}") 
    public ResponseEntity<RrhhPersonaFotografia> getFotografiaPrincipalByIdPersona(@PathVariable Long idPersona) {
        Optional<RrhhPersonaFotografia> fotografia = rrhhPersonaFotografiaService
                .getFotografiaPrincipalByIdPersona(idPersona);

        return fotografia
                .map(foto -> new ResponseEntity<>(foto, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}