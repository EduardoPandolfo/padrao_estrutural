package br.kp.eduardo.bridge.factory;

import br.kp.eduardo.bridge.modelo.base.Sigilo;
import br.kp.eduardo.bridge.modelo.exame.Exame;

import java.time.LocalDate;

public class ExameFactory {

    /**
     * Ambos podem ter acesso
     */
    public static Exame getExame1() {
        return Exame.builder()
                .id(1L)
                .profissional(ProfissionalFactory.getProfissional1())
                .sigilo(Sigilo.NAO_SIGILOSO)
                .data(LocalDate.now())
                .build();
    }

    /**
     * Apenas profissional2 pode ler
     */
    public static Exame getExame2() {
        return Exame.builder()
                .id(2L)
                .profissional(ProfissionalFactory.getProfissional2())
                .sigilo(Sigilo.SIGILOSO)
                .data(LocalDate.now())
                .build();
    }
}
