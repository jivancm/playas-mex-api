package com.playasmex.hackOcean.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "municipio")
public class MunicipioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_municipio", nullable = false)
    private Integer id;

    @Column(name = "nombre_municipio", nullable = false)
    private String nombreMunicipio;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "id_estado")
    private EstadoModel idEstado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public EstadoModel getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(EstadoModel idEstado) {
        this.idEstado = idEstado;
    }

}