package com.saas.SAAS_APP_BACKEND.controller.GYM;

import java.util.List; // Importación correcta

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saas.SAAS_APP_BACKEND.entity.GYM.GymUsuarios;
import com.saas.SAAS_APP_BACKEND.service.GYM.GymUsuariosService;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/gym")
@RequiredArgsConstructor
public class GymUsuariosController {
    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(GymUsuariosController.class);

    @Autowired
    GymUsuariosService gymUsuariosService;

    @GetMapping("/usuarios")
    public List<GymUsuarios> getUsuariosGym() {
        LOGGER.info("Obteniendo todos los usuarios");
        return gymUsuariosService.getAllUsuarios();
    }

    @GetMapping("/home")
    public String home() {
        return "Public Home";
    }
}