package br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.factory;

import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db.DB;
import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
