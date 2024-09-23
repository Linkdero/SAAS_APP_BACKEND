package com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rrhh_persona_usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RrhhUsuarios {
    @Id
    @Column(name = "id_persona")
    private Long idPersona;

    @Column(name = "persona_user")
    private String username;

    @Column(name = "password_bcrypt")
    private String password;

    @Column(name = "roll")
    private String role;
}