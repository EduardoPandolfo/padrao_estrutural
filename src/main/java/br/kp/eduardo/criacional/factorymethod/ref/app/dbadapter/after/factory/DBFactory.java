package br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.factory;


import br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
