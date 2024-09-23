package com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.RRHH;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhUsuarios;

@Repository
public interface RrhhSecurityUsuariosRepository extends CrudRepository<RrhhUsuarios, Long> {
    RrhhUsuarios findByUsername(String username);
}