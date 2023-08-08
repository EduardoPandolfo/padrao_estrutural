package br.kp.eduardo.criacional.factorymethod.model;

public class IPhone implements ICelular {

    private String nome;
    private String modelo;
    private boolean desligado;

    public IPhone() {

    }

    public IPhone(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
        this.desligado = true;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean isDesligado() {
        return desligado;
    }

    @Override
    public void ligar() {
        desligado = false;
    }

    @Override
    public void desligar() {
        desligado = true;
    }
}
