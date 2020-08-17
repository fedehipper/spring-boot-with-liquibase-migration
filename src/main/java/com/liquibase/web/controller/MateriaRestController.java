package com.liquibase.web.controller;

import com.liquibase.business.service.MateriaService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MateriaRestController {
    
    private final MateriaService materiaService;
    
    public MateriaRestController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }
    
}
