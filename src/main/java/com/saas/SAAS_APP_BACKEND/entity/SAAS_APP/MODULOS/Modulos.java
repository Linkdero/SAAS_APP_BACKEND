package com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.MODULOS;

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
@Table(name = "modulo_encabezado")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Modulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modulo_id")
    private Long idModulo;

    @Column(name = "modulo_nombre")
    private String nombreModulo;

    @Column(name = "modulo_descripcion")
    private String descripcionModulo;

    @Column(name = "modulo_icon")
    private String iconModulo;
}