package com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

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
@Table(name = "rrhh_persona")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.ALWAYS)
public class RrhhPersona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona", nullable = false)
    private Integer idPersona;

    @Column(name = "tipo_persona")
    private Integer tipoPersona;

    @Column(name = "fecha_ingreso")
    private LocalDateTime fechaIngreso;

    @Column(name = "fecha_modificacion")
    private LocalDateTime fechaModificacion;

    @Column(name = "id_status")
    private Integer idStatus;

    @Column(name = "NISP", length = 15)
    private String nisp;

    @Column(name = "nit", length = 25)
    private String nit;

    @Column(name = "afiliacion_IGSS", length = 25)
    private String afiliacionIGSS;

    @Column(name = "primer_nombre", length = 50)
    private String primerNombre;

    @Column(name = "segundo_nombre", length = 50)
    private String segundoNombre;

    @Column(name = "tercer_nombre", length = 50)
    private String tercerNombre;

    @Column(name = "primer_apellido", length = 50)
    private String primerApellido;

    @Column(name = "segundo_apellido", length = 50)
    private String segundoApellido;

    @Column(name = "tercer_apellido", length = 50)
    private String tercerApellido;

    @Column(name = "correo_electronico", length = 250)
    private String correoElectronico;

    @Column(name = "id_estado_civil")
    private Integer idEstadoCivil;

    @Column(name = "id_profesion")
    private Integer idProfesion;

    @Column(name = "observaciones", columnDefinition = "TEXT")
    private String observaciones;

    @Column(name = "id_tipo_servicio")
    private Integer idTipoServicio;

    @Column(name = "id_genero")
    private Integer idGenero;

    @Column(name = "id_procedencia")
    private Integer idProcedencia;

    @Column(name = "id_auditoria")
    private Integer idAuditoria;

    @Column(name = "id_tipo_aspirante")
    private Integer idTipoAspirante;
}