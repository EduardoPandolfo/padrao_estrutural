package br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.before;

import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db.DB;
import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db.OracleDB;
import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db.PostgresDB;

public class Client {

	public static void main(String[] args) {
//		OracleDB db = new OracleDB();
//		db.query("SELECT * FROM users");
//		db.update("INSERT INTO users VALUES ('User', 25)");
		
		//What happen if you have to change for a postgres database?

		DB dataBase = new OracleDB();

		dataBase.query("select * from users");

		dataBase = new PostgresDB();

		dataBase.query("select * from public.users");


		//



	}
}
