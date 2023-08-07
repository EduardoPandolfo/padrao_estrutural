package br.kp.eduardo.bridge.negocio;

import br.kp.eduardo.bridge.modelo.base.Profissional;

public interface IControleSigilo {
    boolean temAcesso(Profissional profissional);
}
