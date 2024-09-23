package com.saas.SAAS_APP_BACKEND.service.SAAS_APP.MODULOS;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.MODULOS.Modulos;
import com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.MODULOS.ModulosRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // Lombok crea un constructor con los atributos final
public class ModulosService {
    private final ModulosRepository modulosRepository;

    public List<Modulos> getAllModulos() {
        return modulosRepository.findAll();
    }

    public Optional<Modulos> getModuloById(Long id) {
        return modulosRepository.findById(id);
    }
}