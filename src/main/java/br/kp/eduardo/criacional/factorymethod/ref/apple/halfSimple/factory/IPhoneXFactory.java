package br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.factory;

import br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.model.IPhone;
import br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.model.IPhoneX;
import br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
