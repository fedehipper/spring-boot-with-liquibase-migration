package com.liquibase.repository;

import com.liquibase.domain.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
    
}
