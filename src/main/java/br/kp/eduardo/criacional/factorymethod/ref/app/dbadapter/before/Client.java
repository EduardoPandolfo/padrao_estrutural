package br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.before;

import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db.OracleDB;

public class Client {

	public static void main(String[] args) {
		OracleDB db = new OracleDB();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
		
		//What happen if you have to change for a postgres database?
	}
}
