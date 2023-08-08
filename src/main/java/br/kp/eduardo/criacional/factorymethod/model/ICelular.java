package br.kp.eduardo.criacional.factorymethod.model;


import java.time.LocalDate;

public interface ICelular {
    String getNome();
    void setNome(String nome);
    String getModelo();
    void setModelo(String modelo);
    boolean isDesligado();
    void ligar();
    void desligar();
}
