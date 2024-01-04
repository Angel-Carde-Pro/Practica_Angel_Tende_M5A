package com.angel.practica_angel_tende_m5a.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cancion")
public class Cancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_song")
    private Long id;
    @Column(unique = true)
    private String title;
    private String artis;
    private String album;
    private int year;

}
