package br.kp.eduardo.bridge.factory;

import br.kp.eduardo.bridge.modelo.base.Especialidade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EspecialidadeFactory {

    public static List<Especialidade> createListEspecialidade(int qtd) {
        List<Especialidade> retorno = new ArrayList<>();
        for (long index = 1; index <= qtd; index++) {
            retorno.add(new Especialidade(index, String.format("Nome Especialidade %s", index)));
        }

        return retorno;
    }


    /**
     * Especialidade 1,2
     */
    public static List<Especialidade> listForProfissional1() {
        return createListEspecialidade(5).stream().filter(uni -> uni.getId() <= 2).collect(Collectors.toList());
    }

    /**
     * Especialidade 3,4,5
     */
    public static List<Especialidade> listForProfissional2() {
        return createListEspecialidade(5).stream().filter(uni -> uni.getId() > 2).collect(Collectors.toList());
    }
}
