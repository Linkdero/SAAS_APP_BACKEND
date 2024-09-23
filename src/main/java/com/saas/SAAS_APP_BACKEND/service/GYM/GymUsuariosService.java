package com.saas.SAAS_APP_BACKEND.service.GYM;

import com.saas.SAAS_APP_BACKEND.entity.GYM.GymUsuarios;
import com.saas.SAAS_APP_BACKEND.repository.GYM.GymUsuariosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor // Lombok crea un constructor con los atributos final
public class GymUsuariosService {
    private final GymUsuariosRepository gymUsuariosRepository;

    // Obtener todos los usuarios
    public List<GymUsuarios> getAllUsuarios() {
        return gymUsuariosRepository.findAll();
    }

    // Obtener un usuario por ID
    public Optional<GymUsuarios> getUsuarioById(Long id) {
        return gymUsuariosRepository.findById(id);
    }
} 