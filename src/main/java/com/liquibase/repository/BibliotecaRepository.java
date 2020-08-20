package com.liquibase.repository;

import com.liquibase.domain.Biblioteca;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
    
    Optional<Biblioteca> findByCodigo(String codigo);
    
}
