package com.saas.SAAS_APP_BACKEND.service.SAAS_APP.RRHH;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhUsuarios;
import com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.RRHH.RrhhUsuariosRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RrhhUsuariosService {
    private final RrhhUsuariosRepository rrhhUsuariosRepository;
    private final PasswordEncoder passwordEncoder; // Inyección del PasswordEncoder

    // Obtener todos los usuarios
    public List<RrhhUsuarios> getAllUsuarios() {
        return rrhhUsuariosRepository.findAll();
    }

    // Obtener un usuario por ID
    public Optional<RrhhUsuarios> getUsuarioById(Long id) {
        return rrhhUsuariosRepository.findById(id);
    }

    // Obtener un usuario por nombre de usuario
    public RrhhUsuarios findByUsername(String username) {
        return rrhhUsuariosRepository.findByUsername(username);
    }

    // Validar contraseña encriptada
    public boolean validarPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword); // Comparar contraseñas
    }
}
