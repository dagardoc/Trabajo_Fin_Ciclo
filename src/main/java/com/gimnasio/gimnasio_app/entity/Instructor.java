package com.gimnasio.gimnasio_app.entity;

import jakarta.persistence.*;

@Entity
public class Instructor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String especialidad;
    private String biografia;

    // Relación con Usuario (opcional al inicio, pero la dejamos para después)
    // @OneToOne
    // @JoinColumn(name = "usuario_id")
    // private Usuario usuario;

    public Instructor() {}

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}