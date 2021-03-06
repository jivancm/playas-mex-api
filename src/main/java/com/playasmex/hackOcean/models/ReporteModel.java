package com.playasmex.hackOcean.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.playasmex.hackOcean.repositories.PlayaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "reporte")
public class ReporteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reporte", nullable = false)
    private Integer id;

    @Column(name = "asunto", nullable = false)
    private String asunto;

    @Column(name = "`descripción`", nullable = false)
    private String descripción;

    @Column(name = "fecha_hora", nullable = false)
    private Instant fechaHora;

    @Column(name = "foto")
    private String foto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_playa", nullable = false)
    @JsonBackReference
    private PlayaModel idPlaya;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "correo")
    private String correo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Instant getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Instant fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public PlayaModel getIdPlaya() {
        return idPlaya;
    }

    public void setIdPlaya(PlayaModel idPlaya) {
        this.idPlaya = idPlaya;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}