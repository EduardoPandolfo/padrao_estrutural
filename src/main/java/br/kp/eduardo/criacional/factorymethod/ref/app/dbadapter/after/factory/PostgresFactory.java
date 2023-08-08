package br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.factory;

import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db.DB;
import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
