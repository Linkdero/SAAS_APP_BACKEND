package com.saas.SAAS_APP_BACKEND.controller.SAAS_APP.RRHH;

import java.util.List; // Importación correcta

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhUsuarios;
import com.saas.SAAS_APP_BACKEND.service.SAAS_APP.RRHH.RrhhUsuariosService;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/rrhh")
@RequiredArgsConstructor
public class RrhhUsuariosController {
    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(RrhhUsuariosController.class);

    @Autowired
    RrhhUsuariosService rrhhUsuariosService;

    @GetMapping("/usuarios")
    public List<RrhhUsuarios> getUsuariosRrhh() {
        LOGGER.info("Obteniendo todos los usuarios");
        return rrhhUsuariosService.getAllUsuarios();
    }

    @GetMapping("/home")
    public String home() {
        return "Public Home";
    }
}