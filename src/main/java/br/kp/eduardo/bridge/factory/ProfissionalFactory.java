package br.kp.eduardo.bridge.factory;

import br.kp.eduardo.bridge.modelo.base.Profissional;

public class ProfissionalFactory {

    public static Profissional getProfissional1() {
        return Profissional.builder()
                .id(1L)
                .nome("Profissional 1")
                .especialidades(EspecialidadeFactory.listForProfissional1())
                .unidades(UnidadeFactory.listForProfissional1())
                .isAdmin(false)
                .build();
    }

    public static Profissional getProfissional2() {
        return Profissional.builder()
                .id(2L)
                .nome("Profissional 2")
                .especialidades(EspecialidadeFactory.listForProfissional2())
                .unidades(UnidadeFactory.listForProfissional2())
                .isAdmin(false)
                .build();
    }
}
