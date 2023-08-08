package br.kp.eduardo.criacional.factorymethod.model.simplefactory;

import br.kp.eduardo.criacional.factorymethod.model.ICelular;
import br.kp.eduardo.criacional.factorymethod.model.IPhone;
import br.kp.eduardo.criacional.factorymethod.model.Xiaomi;

public class SimpleFactoryCelular {

    //a proposta é utilizar paramatros que indiquem qual o objeto será retornado - nesse caso o ideal seria um enum
    public static ICelular create(String marca) throws RuntimeException{
        if("XIAOMI".equalsIgnoreCase(marca)) {
            return new Xiaomi();
        }

        if("IPHONE".equalsIgnoreCase(marca)) {
            return new IPhone();
        }

        throw new RuntimeException("Marca não reconhecida: " + marca);
    }
}
