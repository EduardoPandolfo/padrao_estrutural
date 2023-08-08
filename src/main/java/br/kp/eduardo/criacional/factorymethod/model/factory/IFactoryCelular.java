package br.kp.eduardo.criacional.factorymethod.model.factory;

import br.kp.eduardo.criacional.factorymethod.model.ICelular;

public abstract class IFactoryCelular {

    public ICelular order() {
        ICelular celular = create();

        celular.desligar();

        return celular;
    }

    public abstract ICelular create();
}
