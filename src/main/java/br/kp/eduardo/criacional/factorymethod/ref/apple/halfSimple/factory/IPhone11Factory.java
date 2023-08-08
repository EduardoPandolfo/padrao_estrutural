package br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.factory;

import br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.model.IPhone;
import br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.model.IPhone11;
import br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11();
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		} else return null;
	}

}
