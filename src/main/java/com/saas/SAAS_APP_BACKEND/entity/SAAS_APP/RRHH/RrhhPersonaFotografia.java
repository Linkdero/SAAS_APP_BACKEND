package com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rrhh_persona_fotografia")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RrhhPersonaFotografia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fotografia", nullable = false)
    private Long idFotografia;

    @Column(name = "id_persona", nullable = false)
    private Long idPersona;

    @Column(name = "id_tipo_fotografia", nullable = false)
    private Long idTipoFotografia;

    @Column(name = "fotografia_principal")
    private Boolean fotografiaPrincipal;

    @Column(name = "fotografia")
    private byte[] fotografia;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "id_auditoria", nullable = false)
    private Long idAuditoria;
}