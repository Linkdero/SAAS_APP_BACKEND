package com.saas.SAAS_APP_BACKEND.repository.GYM;

import com.saas.SAAS_APP_BACKEND.entity.GYM.GymUsuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymSecurityUsuariosRepository extends CrudRepository<GymUsuarios, Long> {
    GymUsuarios findByUsername(String username);
}