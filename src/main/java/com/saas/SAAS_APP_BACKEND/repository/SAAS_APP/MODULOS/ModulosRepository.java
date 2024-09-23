package com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.MODULOS;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.MODULOS.Modulos;

@Repository
public interface ModulosRepository extends JpaRepository<Modulos, Long>{
    //JpaRepository ya incluye métodos como findAll() y findById()
} 