package com.playasmex.hackOcean.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clasificacion")
public class ClasificacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clasificacion", nullable = false)
    private Integer id;

    @Column(name = "nombre_clasificacion", nullable = false, length = 200)
    private String nombreClasificacion;

    @Column(name = "npm")
    private Integer npm;

    @Column(name = "fecha_actualizada", nullable = false)
    private LocalDate fechaActualizada;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_playa", nullable = false)
    @JsonBackReference
    private PlayaModel idPlaya;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreClasificacion() {
        return nombreClasificacion;
    }

    public void setNombreClasificacion(String nombreClasificacion) {
        this.nombreClasificacion = nombreClasificacion;
    }

    public Integer getNpm() {
        return npm;
    }

    public void setNpm(Integer npm) {
        this.npm = npm;
    }

    public LocalDate getFechaActualizada() {
        return fechaActualizada;
    }

    public void setFechaActualizada(LocalDate fechaActualizada) {
        this.fechaActualizada = fechaActualizada;
    }

    public PlayaModel getIdPlaya() {
        return idPlaya;
    }

    public void setIdPlaya(PlayaModel idPlaya) {
        this.idPlaya = idPlaya;
    }

}