package br.kp.eduardo.bridge.negocio.impl;

import br.kp.eduardo.bridge.modelo.base.Profissional;
import br.kp.eduardo.bridge.negocio.ControleSigilo;
import br.kp.eduardo.bridge.negocio.ISigilo;

public class ControleSigiloUpdateImpl extends ControleSigilo {

    private Profissional profissional;

    public ControleSigiloUpdateImpl(ISigilo iSigilo) {
        super(iSigilo);
    }

    @Override
    public boolean temAcesso(Profissional profissional) {
        this.profissional = profissional;
        return isProfissional();
    }

    private boolean isProfissional() {
        return this.profissional.equals(this.iSigilo.getProfissional());
    }

}

