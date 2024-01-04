package com.angel.practica_angel_tende_m5a.service;

import com.angel.practica_angel_tende_m5a.entity.Cancion;

import java.util.List;


public interface ICancionService {
    List<Cancion> listAll();

    Cancion saveCancion(Cancion cancion);

    Cancion findCancionByIdCancion(Long id_song);

    Cancion findByCancion(String name);

    boolean existByCancion(String name);

    void deleteByCancion(String name);


}


