package com.liquibase.business.service;

import com.liquibase.DemoLiquibaseMigrationApplicationTests;
import com.liquibase.domain.Materia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.liquibase.repository.MateriaRepository;
import com.liquibase.vo.MateriaVo;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class MateriaServiceTest extends DemoLiquibaseMigrationApplicationTests {

    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private MateriaService materiaService;

    @Test
    public void altaMateria_materiaNoExiste_retornaMateriaCreada() {
        String nombre = "matematica discreta";
        String codigo = "080-K9921";
        MateriaVo materiaVo = crearMateriaVo("matematica discreta", "080-K9921");

        assertThat(materiaRepository.count()).isEqualTo(0);

        Materia materiaCreada = materiaService.crear(materiaVo);

        assertThat(materiaCreada.getCodigo()).isEqualTo(codigo);
        assertThat(materiaCreada.getNombre()).isEqualTo(nombre);
        assertThat(materiaRepository.count()).isEqualTo(1);
    }

    private MateriaVo crearMateriaVo(String nombre, String codigo) {
        MateriaVo materiaVo = new MateriaVo();
        materiaVo.setCodigo(codigo);
        materiaVo.setNombre(nombre);
        return materiaVo;
    }

}
