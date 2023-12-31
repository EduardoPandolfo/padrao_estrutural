package br.kp.eduardo.estrutural.bridge.negocio.impl;

import br.kp.eduardo.estrutural.bridge.modelo.base.Profissional;
import br.kp.eduardo.estrutural.bridge.modelo.base.Sigilo;
import br.kp.eduardo.estrutural.bridge.negocio.ControleSigilo;
import br.kp.eduardo.estrutural.bridge.negocio.ISigilo;

public class ControleSigiloExameReadImpl extends ControleSigilo {

    private Profissional profissional;

    public ControleSigiloExameReadImpl(ISigilo iSigilo) {
        super(iSigilo);
    }

    @Override
    public boolean temAcesso(Profissional profissional) {
        this.profissional = profissional;

        return isNotSigiloso() || isProfissional();
    }

    private boolean isNotSigiloso() {
        return !isSigiloso();
    }

    private boolean isSigiloso() {
        return Sigilo.SIGILOSO.equals(this.iSigilo.getSigilo());
    }

    private boolean isProfissional() {
        return profissional.equals(this.iSigilo.getProfissional());
    }

}
