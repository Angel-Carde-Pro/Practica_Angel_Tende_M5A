package com.angel.practica_angel_tende_m5a.service;

import com.angel.practica_angel_tende_m5a.entity.Lista;

import java.util.List;

public interface IListaService {
    List<Lista> listAll();
    Lista saveLista(Lista lista);
    Lista findListaById(Long idLista);
    Lista findListaByName(String name);
    boolean existsByName(String name);
    void deleteLista(String name);
}
