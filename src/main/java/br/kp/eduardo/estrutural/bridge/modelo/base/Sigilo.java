package br.kp.eduardo.estrutural.bridge.modelo.base;

public enum Sigilo {
    SIGILOSO("Sigiloso"),
    NAO_SIGILOSO("Não sigiloso");

    public String descricao;

    Sigilo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
