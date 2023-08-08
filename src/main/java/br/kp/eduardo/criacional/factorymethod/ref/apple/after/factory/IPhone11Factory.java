package br.kp.eduardo.criacional.factorymethod.ref.apple.after.factory;

import br.kp.eduardo.criacional.factorymethod.ref.apple.after.model.IPhone;
import br.kp.eduardo.criacional.factorymethod.ref.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
