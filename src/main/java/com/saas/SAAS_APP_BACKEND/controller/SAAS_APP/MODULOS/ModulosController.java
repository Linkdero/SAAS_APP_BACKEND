package com.saas.SAAS_APP_BACKEND.controller.SAAS_APP.MODULOS;

import java.util.List; // Importación correcta

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saas.SAAS_APP_BACKEND.controller.SAAS_APP.MODULOS.ModulosController;
import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.MODULOS.Modulos;
import com.saas.SAAS_APP_BACKEND.service.SAAS_APP.MODULOS.ModulosService;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/modulos")
@RequiredArgsConstructor
public class ModulosController {
    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(ModulosController.class);

    @Autowired
    ModulosService modulosService;

    @GetMapping("") 
    public List<Modulos> getModulosSAAS() {
        LOGGER.info("Obteniendo todos los modulos");
        return modulosService.getAllModulos();
    }
}
