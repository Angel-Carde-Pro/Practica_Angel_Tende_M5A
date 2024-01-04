package com.angel.practica_angel_tende_m5a.Dao;

import com.angel.practica_angel_tende_m5a.entity.Cancion;
import org.springframework.data.repository.CrudRepository;

public interface  ICancionDao extends CrudRepository<Cancion, Long> {
   Cancion  findBytitle(String title);
   boolean existsBytitle(String title);
}
