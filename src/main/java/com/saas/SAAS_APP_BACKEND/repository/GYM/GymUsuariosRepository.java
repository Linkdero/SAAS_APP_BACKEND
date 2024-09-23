package com.saas.SAAS_APP_BACKEND.repository.GYM;

import com.saas.SAAS_APP_BACKEND.entity.GYM.GymUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymUsuariosRepository extends JpaRepository<GymUsuarios, Long> {
    // JpaRepository ya incluye métodos como findAll() y findById()
}