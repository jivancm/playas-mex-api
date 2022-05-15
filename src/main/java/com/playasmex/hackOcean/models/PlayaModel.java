package com.playasmex.hackOcean.models;

import javax.persistence.*;

@Entity
@Table(name = "playa")
public class PlayaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_playa", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_municipio")
    private MunicipioModel idMunicipio;

    @Column(name = "nombre_playa", nullable = false)
    private String nombrePlaya;

    @Column(name = "latitud", nullable = false)
    private Double latitud;

    @Column(name = "longitud", nullable = false)
    private Double longitud;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MunicipioModel getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(MunicipioModel idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombrePlaya() {
        return nombrePlaya;
    }

    public void setNombrePlaya(String nombrePlaya) {
        this.nombrePlaya = nombrePlaya;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

}