package com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.RRHH;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhUsuarios;

@Repository
public interface RrhhUsuariosRepository extends JpaRepository<RrhhUsuarios, Long>{
    //JpaRepository ya incluye métodos como findAll() y findById()
} 