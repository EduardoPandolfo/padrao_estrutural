package br.kp.eduardo.bridge.negocio;

public abstract class ControleSigilo implements IControleSigilo {
    public ISigilo iSigilo;

    public ControleSigilo(ISigilo iSigilo) {
        this.iSigilo = iSigilo;
    }

    public void setISigilo(ISigilo iSigilo) {
        this.iSigilo = iSigilo;
    }

}
