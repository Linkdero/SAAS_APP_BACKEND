package com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.RRHH;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhFicha;

@Repository
public interface RrhhFichaRepository extends JpaRepository<RrhhFicha, Integer> {
    RrhhFicha findByIdPersona(Integer idPersona);
}
