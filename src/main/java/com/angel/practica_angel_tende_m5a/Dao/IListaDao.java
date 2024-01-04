package com.angel.practica_angel_tende_m5a.Dao;

import com.angel.practica_angel_tende_m5a.entity.Lista;
import org.springframework.data.repository.CrudRepository;

public interface IListaDao extends CrudRepository<Lista,Long>{
	Lista findByname(String name);
	boolean existsByname(String name);

}

