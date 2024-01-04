package com.angel.practica_angel_tende_m5a.restcontroller;

import com.angel.practica_angel_tende_m5a.entity.*;
import com.angel.practica_angel_tende_m5a.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/canciones")
public class CancionRestController {

    private CancionServiceImpl cancionService;

    @Autowired
    public CancionRestController(CancionServiceImpl cancionService) {
        this.cancionService = cancionService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Cancion>> listarCanciones() {
        List<Cancion> canciones = cancionService.listAll();
        return new ResponseEntity<>(canciones, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Cancion> guardarCancion(@RequestBody Cancion cancion) {
        Cancion nuevaCancion = cancionService.saveCancion(cancion);
        return new ResponseEntity<>(nuevaCancion, HttpStatus.CREATED);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Cancion> buscarCancionPorId(@PathVariable("id") Long id_song) {
        Cancion cancion = cancionService.findCancionByIdCancion(id_song);
        return new ResponseEntity<>(cancion, HttpStatus.OK);
    }

    @GetMapping("/buscarNombre/{nombre}")
    public ResponseEntity<Cancion> buscarCancionPorNombre(@PathVariable("nombre") String name) {
        Cancion cancion = cancionService.findByCancion(name);
        return new ResponseEntity<>(cancion, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{nombre}")
    public ResponseEntity<Void> eliminarCancion(@PathVariable("nombre") String name) {
        cancionService.deleteByCancion(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
