package com.example.bibliotecaduocS4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bibliotecaduocS4.model.Libro;

@Repository
public class LibroRepository {
    private List<Libro> listalibros=new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listalibros;
    }

    public Libro guardarLibro(Libro libro) {
    listalibros.add(libro);
    return libro;
    }
}
