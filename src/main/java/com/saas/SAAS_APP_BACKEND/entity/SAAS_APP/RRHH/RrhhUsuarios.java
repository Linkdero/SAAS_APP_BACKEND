package com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "rrhh_persona_usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.ALWAYS)
public class RrhhUsuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @OneToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona", nullable = false)
    private RrhhPersona persona;

    @Column(name = "persona_user", length = 50, nullable = false)
    private String username;

    @Column(name = "persona_pass", length = 300, nullable = false)
    private String passwordMD5;

    @Column(name = "persona_salt", length = 300, nullable = false)
    private String salt;

    @Column(name = "status", nullable = false)
    private Integer estado;

    @Column(name = "creado_por", nullable = false)
    private Integer creadoPor;

    @CreationTimestamp
    @Column(name = "creado_en", nullable = false, updatable = false, columnDefinition = "datetime2(0)")
    private LocalDateTime creadoEn;

    @Column(name = "mostrar_nombre", nullable = false)
    private Integer mostrarNombre;

    @Column(name = "valida_ldap", nullable = false)
    private Integer validaLdap;

    @Column(name = "valida_web")
    private Integer validaWeb;
    
    @Column(name = "password_bcrypt", nullable = false)
    private String password;

    @Column(name = "roll", nullable = false)
    private String role;
} 