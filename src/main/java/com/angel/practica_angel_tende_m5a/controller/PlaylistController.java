package com.angel.practica_angel_tende_m5a.controller;

import com.angel.practica_angel_tende_m5a.modelo.entity.Playlist;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class PlaylistController {

    @PostMapping("/crear")
    public ResponseEntity<?> crearListaReproduccion(@RequestBody Playlist playlist) {
        // Implementa la lógica para añadir una nueva lista de reproducción
        // Retorna ResponseEntity con el código de estado correspondiente
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Playlist>> verTodasListasReproduccion() {
        // Implementa la lógica para obtener todas las listas de reproducción
        // Retorna ResponseEntity con el código de estado correspondiente y la lista de reproducción
        return null;
    }

    @GetMapping("/{listName}")
    public ResponseEntity<?> verListaReproduccion(@PathVariable String listName) {
        // Implementa la lógica para obtener una lista de reproducción específica
        // Retorna ResponseEntity con el código de estado correspondiente y la lista de reproducción o un mensaje de error
        return null;
    }

    @PutMapping("/{actualizar}")
    public ResponseEntity<?> actualizarListaReproduccion(@PathVariable String actualizar, @RequestBody Playlist playlist) {
        // Implementa la lógica para modificar el contenido de una lista de reproducción
        // Retorna ResponseEntity con el código de estado correspondiente
        return null;
    }

    @DeleteMapping("/{listName}")
    public ResponseEntity<?> borrarListaReproduccion(@PathVariable String listName) {
        // Implementa la lógica para borrar una lista de reproducción
        // Retorna ResponseEntity con el código de estado correspondiente
        return null;
    }
}
