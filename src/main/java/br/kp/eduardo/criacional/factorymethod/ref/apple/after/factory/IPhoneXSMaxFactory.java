package br.kp.eduardo.criacional.factorymethod.ref.apple.after.factory;


import br.kp.eduardo.criacional.factorymethod.ref.apple.after.model.IPhone;
import br.kp.eduardo.criacional.factorymethod.ref.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
