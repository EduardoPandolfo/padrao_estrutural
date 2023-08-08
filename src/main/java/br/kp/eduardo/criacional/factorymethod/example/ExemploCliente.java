package br.kp.eduardo.criacional.factorymethod.example;

import br.kp.eduardo.criacional.factorymethod.model.ICelular;
import br.kp.eduardo.criacional.factorymethod.model.IPhone;
import br.kp.eduardo.criacional.factorymethod.model.Xiaomi;
import br.kp.eduardo.criacional.factorymethod.model.factory.IPhoneFactory;
import br.kp.eduardo.criacional.factorymethod.model.factory.XiaomiFactory;
import br.kp.eduardo.criacional.factorymethod.model.simplefactory.SimpleFactoryCelular;

public class ExemploCliente {

    //exemplo basico de criação antes de utilizar o factory
    public ICelular orderProduct() {
        ICelular iCelular = null;

        iCelular = new IPhone("Iphone 14", "14.1");

        iCelular = new Xiaomi("Xiami 8", "Pro 2.1");

        return iCelular;
    }


    public ICelular orderProduct2() {
        ICelular iCelular = null;
        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        XiaomiFactory xiaomiFactory = new XiaomiFactory();

        iCelular = iPhoneFactory.order();

        iCelular = xiaomiFactory.order();

        return iCelular;
    }

    public ICelular orderProduct3() {
        ICelular iCelular = null;

        iCelular = SimpleFactoryCelular.create("XIAOMI");

        iCelular = SimpleFactoryCelular.create("IPHONE");

        //iCelular = SimpleFactoryCelular.create("Samsung"); // vai retornar exception

        return iCelular;
    }

}
