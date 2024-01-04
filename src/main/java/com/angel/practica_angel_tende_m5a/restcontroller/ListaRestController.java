package com.angel.practica_angel_tende_m5a.restcontroller;

import java.util.List;

import com.angel.practica_angel_tende_m5a.entity.*;
import com.angel.practica_angel_tende_m5a.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/listas")
public class ListaRestController {

    private final IListaService listaService;

    @Autowired
    public ListaRestController(IListaService listaService) {
        this.listaService = listaService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Lista>> listarListas() {
        List<Lista> listas = listaService.listAll();
        return new ResponseEntity<>(listas, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Lista> guardarLista(@RequestBody Lista lista) {
        Lista nuevaLista = listaService.saveLista(lista);
        return new ResponseEntity<>(nuevaLista, HttpStatus.CREATED);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Lista> buscarListaPorId(@PathVariable("id") Long idLista) {
        Lista lista = listaService.findListaById(idLista);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/buscarNombre/{nombre}")
    public ResponseEntity<Lista> buscarListaPorNombre(@PathVariable("nombre") String name) {
        Lista lista = listaService.findListaByName(name);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{nombre}")
    public ResponseEntity<Void> eliminarLista(@PathVariable("nombre") String name) {
        listaService.deleteLista(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}