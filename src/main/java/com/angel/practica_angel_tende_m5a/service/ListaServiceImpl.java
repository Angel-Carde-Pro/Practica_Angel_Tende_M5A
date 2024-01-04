package com.angel.practica_angel_tende_m5a.service;

import com.angel.practica_angel_tende_m5a.Dao.IListaDao;
import com.angel.practica_angel_tende_m5a.entity.Lista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ListaServiceImpl implements IListaService {
    @Autowired
    private IListaDao listaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Lista> listAll() {
        return (List<Lista>) listaDao.findAll();
    }

    @Override
    @Transactional
    public Lista saveLista(Lista lista) {
        return listaDao.save(lista);
    }

    @Override
    @Transactional(readOnly = true)
    public Lista findListaById(Long idLista) {
        return listaDao.findById(idLista).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Lista findListaByName(String name) {
        return listaDao.findByname(name);
    }

    @Override
    public boolean existsByName(String name) {
        return listaDao.existsByname(name);
    }

    @Override
    @Transactional
    public void deleteLista(String name) {
        Lista listaToDelete = listaDao.findByname(name);
        if (listaToDelete != null) {
            listaDao.delete(listaToDelete);
        }
    }
}