package com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH;

import java.time.LocalDate;
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
@Table(name = "xxx_rrhh_Ficha")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.ALWAYS)
public class RrhhFicha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona", nullable = false)
    private Integer idPersona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private String estado;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "tercer_nombre")
    private String tercerNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "tercer_apellido")
    private String tercerApellido;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "id_empleado")
    private Integer idEmpleado;

    @Column(name = "id_sueldo_plaza")
    private Integer idSueldoPlaza;

    @Column(name = "fecha_ingreso")
    private LocalDateTime fechaIngreso;

    @Column(name = "NISP")
    private String nisp;

    @Column(name = "afiliacion_IGSS")
    private String afiliacionIGSS;

    @Column(name = "nit")
    private String nit;

    @Column(name = "id_tipo")
    private Integer idTipo;

    @Column(name = "cod_plaza")
    private String codPlaza;

    @Column(name = "id_plaza")
    private Integer idPlaza;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "partida_presupuestaria")
    private String partidaPresupuestaria;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "id_pfuncional")
    private Integer idPfuncional;

    @Column(name = "p_funcional")
    private String pFuncional;

    @Column(name = "id_pnominal")
    private Integer idPnominal;

    @Column(name = "p_nominal")
    private String pNominal;

    @Column(name = "id_pcontrato")
    private Integer idPcontrato;

    @Column(name = "p_contrato")
    private String pContrato;

    @Column(name = "id_papoyo")
    private Integer idPapoyo;

    @Column(name = "p_apoyo")
    private String pApoyo;

    @Column(name = "id_Sangre")
    private Integer idSangre;

    @Column(name = "tsangre")
    private String tsangre;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "id_ecivil")
    private Integer idEcivil;

    @Column(name = "ecivil")
    private String ecivil;

    @Column(name = "id_genero")
    private Integer idGenero;

    @Column(name = "genero")
    private String genero;

    @Column(name = "dpi")
    private String dpi;

    @Column(name = "dpi_ven")
    private LocalDateTime dpiVen;

    @Column(name = "nro_cuenta")
    private String nroCuenta;

    @Column(name = "id_asignao")
    private Integer idAsignao;

    @Column(name = "id_grupo")
    private Integer idGrupo;

    @Column(name = "grupo")
    private String grupo;

    @Column(name = "dir_nominal")
    private String dirNominal;

    @Column(name = "id_dirf")
    private Integer idDirf;

    @Column(name = "id_subdireccion_funcional")
    private Integer idSubdireccionFuncional;

    @Column(name = "id_dirs")
    private Integer idDirs;

    @Column(name = "id_dirp")
    private Integer idDirp;

    @Column(name = "dir_funcional")
    private String dirFuncional;

    @Column(name = "id_dirapy")
    private Integer idDirapy;

    @Column(name = "dir_apoyo")
    private String dirApoyo;

    @Column(name = "dir_general")
    private String dirGeneral;

    @Column(name = "id_dirg")
    private Integer idDirg;

    @Column(name = "id_dirfn")
    private Integer idDirfn;

    @Column(name = "id_secre")
    private Integer idSecre;

    @Column(name = "id_subsecre")
    private Integer idSubsecre;

    @Column(name = "id_direc")
    private Integer idDirec;

    @Column(name = "id_secrep")
    private Integer idSecrep;

    @Column(name = "id_subsecrep")
    private Integer idSubsecrep;

    @Column(name = "id_direcp")
    private Integer idDirecp;

    @Column(name = "id_subdirecp")
    private Integer idSubdirecp;

    @Column(name = "telfam")
    private String telfam;

    @Column(name = "telper")
    private String telper;

    @Column(name = "teltra")
    private String teltra;

    @Column(name = "telemp")
    private String telemp;

    @Column(name = "profesion")
    private String profesion;

    @Column(name = "nro_colegiado")
    private String nroColegiado;

    @Column(name = "id_depto_funcional")
    private Integer idDeptoFuncional;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "fecha_finalizacion")
    private LocalDateTime fechaFinalizacion;

    @Column(name = "estado_empleado")
    private String estadoEmpleado;

    @Column(name = "dir_funcional_corta")
    private String dirFuncionalCorta;
}