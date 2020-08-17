package com.liquibase.business.service;

import com.liquibase.domain.Materia;
import com.liquibase.repository.MateriaRepository;
import com.liquibase.vo.MateriaVo;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {

    private final MateriaRepository materiaRepository;

    public MateriaService(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    public Materia crear(MateriaVo materiaVo) {
        return materiaRepository.save(transformarAMateria(materiaVo));
    }

    private Materia transformarAMateria(MateriaVo materiaVo) {
        var materia = new Materia();
        materia.setCodigo(materiaVo.getCodigo());
        materia.setNombre(materiaVo.getNombre());
        return materia;
    }

}
