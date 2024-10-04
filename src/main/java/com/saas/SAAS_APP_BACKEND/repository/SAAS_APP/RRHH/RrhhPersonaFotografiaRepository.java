package com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.RRHH;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhPersonaFotografia;

@Repository
public interface RrhhPersonaFotografiaRepository extends JpaRepository<RrhhPersonaFotografia, Long> {

    // Método personalizado para buscar por idPersona
    List<RrhhPersonaFotografia> findByIdPersona(Long idPersona);

    Optional<RrhhPersonaFotografia> findByIdPersonaAndFotografiaPrincipalTrue(Long idPersona);
}
