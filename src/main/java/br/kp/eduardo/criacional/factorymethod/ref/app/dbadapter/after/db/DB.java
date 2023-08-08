package br.kp.eduardo.criacional.factorymethod.ref.app.dbadapter.after.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
