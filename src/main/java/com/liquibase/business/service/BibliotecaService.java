package com.liquibase.business.service;

import com.liquibase.domain.Biblioteca;
import com.liquibase.repository.BibliotecaRepository;
import org.springframework.stereotype.Service;

@Service
public class BibliotecaService {

    private final BibliotecaRepository bibliotecaRepository;

    public BibliotecaService(BibliotecaRepository bibliotecaRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
    }

    public Biblioteca buscarPorCodigo(String codigo) {
        return bibliotecaRepository
                .findByCodigo(codigo)
                .get();
    }

}
