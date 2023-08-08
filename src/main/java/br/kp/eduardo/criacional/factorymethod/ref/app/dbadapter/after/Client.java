package br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after;

import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db.DB;
import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.factory.OracleFactory;

public class Client {

	public static void main(String[] args) {
//		DB db = new PostgresFactory().getDatabase();
		DB db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
