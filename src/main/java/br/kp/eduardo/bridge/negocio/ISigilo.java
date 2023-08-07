package br.kp.eduardo.bridge.negocio;

import br.kp.eduardo.bridge.modelo.base.Profissional;
import br.kp.eduardo.bridge.modelo.base.Sigilo;
import br.kp.eduardo.bridge.modelo.base.Unidade;
import br.kp.eduardo.bridge.modelo.base.Especialidade;

import java.util.List;

public interface ISigilo {

    public Sigilo getSigilo();
    public Profissional getProfissional();
    public List<Unidade> getUnidades();
    public List<Especialidade> getEspecialidades();
}
