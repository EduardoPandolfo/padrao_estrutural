package br.kp.eduardo.bridge.util;

import br.kp.eduardo.bridge.negocio.EntityId;

import java.util.Collection;
import java.util.List;

public class CollectionsUtil {

    public static boolean isNullOrEmpty(Collection list) {
        return list == null || list.size() == 0;
    }

    /**
     * ao menos um elemento da lista deve estar contido na referencia, caso ambos nulos ou vazios retorna true
     * @param list
     * @param reference
     * @return
     */
    public static <T extends EntityId> boolean temCompatibilidade(List<T> list, List<T> reference) {
        if(isNullOrEmpty(list) && isNullOrEmpty(reference)) {
            return true;
        }

        if(isNullOrEmpty(list)) {
            return false;
        }

        if(isNullOrEmpty(reference)) {
            return true;
        }

        return list.stream().anyMatch(listId -> reference.stream().anyMatch(referenceId -> referenceId.getId().equals(listId.getId())));

    }

}
