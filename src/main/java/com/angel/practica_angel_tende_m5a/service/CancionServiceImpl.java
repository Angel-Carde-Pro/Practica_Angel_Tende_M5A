package com.angel.practica_angel_tende_m5a.service;

import java.util.List;

import com.angel.practica_angel_tende_m5a.Dao.ICancionDao;
import com.angel.practica_angel_tende_m5a.entity.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CancionServiceImpl implements ICancionService {
    @Autowired
    private ICancionDao cancionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cancion> listAll() {

        return (List<Cancion>) cancionDao.findAll();
    }

    @Override
    @Transactional
    public Cancion saveCancion(Cancion cancion) {
        return cancionDao.save(cancion);
    }

    @Override
    @Transactional(readOnly = true)
    public Cancion findCancionByIdCancion(Long id_song) {
        return cancionDao.findById(id_song).orElse(null);
    }

    @Override

    public Cancion findByCancion(String name) {
        return cancionDao.findBytitle(name);
    }


    @Override
    public boolean existByCancion(String name) {
        return cancionDao.existsBytitle(name);
    }

    @Override
    @Transactional
    public void deleteByCancion(String name) {
        Cancion cancionToDelete = cancionDao.findBytitle(name);
        if (cancionToDelete != null) {
            cancionDao.delete(cancionToDelete);
        }
    }
}
