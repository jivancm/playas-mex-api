package com.playasmex.hackOcean.models;

import javax.persistence.*;

@Entity
@Table(name="municipio")
public class MunicipioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_municipio", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estado", nullable = false)
    private EstadoModel idEstado;
    private String nombre;

    public Integer getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

}
