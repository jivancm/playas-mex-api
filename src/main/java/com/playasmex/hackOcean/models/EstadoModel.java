package com.playasmex.hackOcean.models;

import javax.persistence.*;

@Entity
@Table(name="estado")
public class EstadoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado", nullable = false)
    private Integer id;
    private String nombre;

    public Integer getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

}
