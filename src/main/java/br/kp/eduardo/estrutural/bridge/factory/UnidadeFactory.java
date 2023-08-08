package br.kp.eduardo.estrutural.bridge.factory;

import br.kp.eduardo.estrutural.bridge.modelo.base.Unidade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnidadeFactory {

    public static List<Unidade> createListUnidade(int qtd) {
        List<Unidade> retorno = new ArrayList<>();
        for (long index = 1; index <= qtd; index++) {
            retorno.add(new Unidade(index, String.format("Nome Unidade %s", index)));
        }

        return retorno;
    }


    /**
     * Unidade 1,2
     */
    public static List<Unidade> listForProfissional1() {
        return createListUnidade(5).stream().filter(uni -> uni.getId() <= 2).collect(Collectors.toList());
    }

    /**
     * Unidade 3,4,5
     */
    public static List<Unidade> listForProfissional2() {
        return createListUnidade(5).stream().filter(uni -> uni.getId() > 2).collect(Collectors.toList());
    }
}
