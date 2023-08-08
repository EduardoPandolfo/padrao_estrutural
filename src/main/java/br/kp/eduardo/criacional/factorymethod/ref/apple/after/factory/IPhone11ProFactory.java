package br.kp.eduardo.criacional.factorymethod.ref.apple.after.factory;

import br.kp.eduardo.criacional.factorymethod.ref.apple.after.model.IPhone;
import br.kp.eduardo.criacional.factorymethod.ref.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
