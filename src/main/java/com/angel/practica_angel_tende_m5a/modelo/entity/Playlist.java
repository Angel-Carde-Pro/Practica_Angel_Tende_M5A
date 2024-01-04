package com.angel.practica_angel_tende_m5a.modelo.entity;

import lombok.Data;

import java.util.List;
@Data
public class Playlist {
    private String name;
    private String description;
    private List<Song> songs;


}
