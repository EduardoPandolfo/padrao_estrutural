package br.kp.eduardo.criacional.factorymethod.model.factory;

import br.kp.eduardo.criacional.factorymethod.model.ICelular;
import br.kp.eduardo.criacional.factorymethod.model.IPhone;

public class IPhoneFactory extends IFactoryCelular {

    @Override
    public ICelular create() {
        return new IPhone();
    }
}
