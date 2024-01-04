package com.angel.practica_angel_tende_m5a.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "lista")
public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lista")
    private Long id;
    @Column(unique = true)
    private String name;
    private String descripcion;
    @OneToMany
    @JoinColumn(name = "id_lista", referencedColumnName = "id_lista")
    private List<Cancion> listacanciones;
}