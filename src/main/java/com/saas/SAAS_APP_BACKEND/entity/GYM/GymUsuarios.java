package com.saas.SAAS_APP_BACKEND.entity.GYM;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gym_usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GymUsuarios {
    @Id
    @GeneratedValue
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "id_persona")
    private Long idPersona;

    @Column(name = "usuario")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "roll")
    private String role;

}