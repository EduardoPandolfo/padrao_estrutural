package br.kp.eduardo.bridge.factory;

import br.kp.eduardo.bridge.modelo.atendimento.Atendimento;
import br.kp.eduardo.bridge.modelo.base.Sigilo;

public class AtendimentoFactory {

    /**
     * profissional 1 e 2 devem ter acesso
     */
    public static Atendimento getAtendimento1() {
        return Atendimento.builder()
                .id(1L)
                .profissional(ProfissionalFactory.getProfissional1())
                .sigilo(Sigilo.SIGILOSO)
                .especialidades(EspecialidadeFactory.listForProfissional2())
                .unidades(UnidadeFactory.listForProfissional2())
                .build();
    }

    /**
     * profissional 1 e 2 devem ter acesso
     */
    public static Atendimento getAtendimento2() {
        return Atendimento.builder()
                .id(2L)
                .profissional(ProfissionalFactory.getProfissional1())
                .sigilo(Sigilo.NAO_SIGILOSO)
                .especialidades(EspecialidadeFactory.listForProfissional1())
                .unidades(UnidadeFactory.listForProfissional1())
                .build();
    }

    /**
     * profissional 1 deve ter acesso
     */
    public static Atendimento getAtendimento3() {
        return Atendimento.builder()
                .id(3L)
                .profissional(ProfissionalFactory.getProfissional1())
                .sigilo(Sigilo.SIGILOSO)
                .especialidades(EspecialidadeFactory.listForProfissional1())
                .unidades(UnidadeFactory.listForProfissional1())
                .build();
    }
}
