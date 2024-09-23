package com.saas.SAAS_APP_BACKEND.service.SAAS_APP.RRHH;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhUsuarios;
import com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.RRHH.RrhhUsuariosRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor // Lombok crea un constructor con los atributos final
public class RrhhUsuariosService {
    private final RrhhUsuariosRepository rrhhUsuariosRepository;

    // Obtener todos los usuarios
    public List<RrhhUsuarios> getAllUsuarios() {
        return rrhhUsuariosRepository.findAll();
    }

    // Obtener un usuario por ID
    public Optional<RrhhUsuarios> getUsuarioById(Long id) {
        return rrhhUsuariosRepository.findById(id);
    }
}