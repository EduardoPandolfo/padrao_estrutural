package br.kp.eduardo.criacional.factorymethod.model.factory;

import br.kp.eduardo.criacional.factorymethod.model.ICelular;
import br.kp.eduardo.criacional.factorymethod.model.Xiaomi;

public class XiaomiFactory extends IFactoryCelular {

    @Override
    public ICelular create() {
        return new Xiaomi();
    }

}
