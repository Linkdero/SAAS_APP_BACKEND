package com.saas.SAAS_APP_BACKEND.service.SAAS_APP.RRHH;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhPersonaFotografia;
import com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.RRHH.RrhhPersonaFotografiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RrhhPersonaFotografiaService {

    @Autowired
    private RrhhPersonaFotografiaRepository rrhhPersonaFotografiaRepository;

    // Obtener todas las fotografías
    public List<RrhhPersonaFotografia> getAllFotografias() {
        return rrhhPersonaFotografiaRepository.findAll();
    }

    // Obtener una fotografía por ID
    public Optional<RrhhPersonaFotografia> getFotografiaById(Long idFotografia) {
        return rrhhPersonaFotografiaRepository.findById(idFotografia);
    }

    // Obtener fotografías por idPersona
    public List<RrhhPersonaFotografia> getFotografiasByIdPersona(Long idPersona) {
        return rrhhPersonaFotografiaRepository.findByIdPersona(idPersona);
    }

    // Crear o actualizar una fotografía
    public RrhhPersonaFotografia saveOrUpdateFotografia(RrhhPersonaFotografia fotografia) {
        return rrhhPersonaFotografiaRepository.save(fotografia);
    }

    // Eliminar una fotografía
    public void deleteFotografia(Long idFotografia) {
        rrhhPersonaFotografiaRepository.deleteById(idFotografia);
    }

    // Obtener la fotografía principal por idPersona
    public Optional<RrhhPersonaFotografia> getFotografiaPrincipalByIdPersona(Long idPersona) {
        return rrhhPersonaFotografiaRepository.findByIdPersonaAndFotografiaPrincipalTrue(idPersona);
    }
}
