package com.liquibase.business.service;

import com.liquibase.DemoLiquibaseMigrationApplicationTests;
import com.liquibase.domain.Biblioteca;
import com.liquibase.repository.BibliotecaRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BibliotecaServiceTest extends DemoLiquibaseMigrationApplicationTests {

    @Autowired
    private BibliotecaService bibliotecaService;

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    @Test
    public void buscarPorCodigo_bibliotecasExisten_restornaBibliotecaConCodigoBuscado() {
        var unaBiblioteca = new Biblioteca();
        var codigo = "codigo";
        unaBiblioteca.setCodigo(codigo);
        unaBiblioteca.setDescripcion("descripcion");
        bibliotecaRepository.save(unaBiblioteca);

        var bibliotecaBuscada = bibliotecaService.buscarPorCodigo(codigo);

        assertThat(bibliotecaBuscada).isEqualToComparingFieldByField(unaBiblioteca);

    }

}
