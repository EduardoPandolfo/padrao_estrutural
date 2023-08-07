package br.kp.eduardo.bridge.negocio.impl;

import br.kp.eduardo.bridge.modelo.base.Profissional;
import br.kp.eduardo.bridge.modelo.base.Sigilo;
import br.kp.eduardo.bridge.negocio.ControleSigilo;
import br.kp.eduardo.bridge.negocio.ISigilo;
import br.kp.eduardo.bridge.util.CollectionsUtil;

public class ControleSigiloAtendimentoReadImpl extends ControleSigilo{

    private Profissional profissional;

    public ControleSigiloAtendimentoReadImpl(ISigilo iSigilo) {
        super(iSigilo);
    }

    @Override
    public boolean temAcesso(Profissional profissional) {
        this.profissional = profissional;

        return isProfissional() || isNotSigiloso() || (hasEspecialidade() && hasUnidade());
    }

    private boolean isNotSigiloso() {
        return !isSigiloso();
    }

    private boolean isSigiloso() {
        return Sigilo.SIGILOSO.equals(this.iSigilo.getSigilo());
    }

    private boolean isProfissional() {
        return this.profissional.equals(this.iSigilo.getProfissional());
    }

    private boolean hasEspecialidade() {
        return CollectionsUtil.temCompatibilidade(this.profissional.getEspecialidades(), this.iSigilo.getEspecialidades());
    }

    private boolean hasUnidade() {
        return CollectionsUtil.temCompatibilidade(profissional.getUnidades(), this.iSigilo.getUnidades());
    }

}
