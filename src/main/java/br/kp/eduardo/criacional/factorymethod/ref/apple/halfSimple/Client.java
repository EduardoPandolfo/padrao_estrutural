package br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple;

import br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.factory.IPhone11Factory;
import br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.factory.IPhoneFactory;
import br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.factory.IPhoneXFactory;
import br.kp.eduardo.criacional.factorymethod.ref.apple.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
