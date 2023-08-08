package br.kp.eduardo.estrutural.bridge.negocio;

import br.kp.eduardo.estrutural.bridge.modelo.base.Profissional;

public interface IControleSigilo {
    boolean temAcesso(Profissional profissional);
}
