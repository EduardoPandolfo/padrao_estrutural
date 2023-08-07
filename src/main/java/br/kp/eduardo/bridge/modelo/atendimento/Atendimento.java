package br.kp.eduardo.bridge.modelo.atendimento;

import br.kp.eduardo.bridge.modelo.base.Unidade;
import br.kp.eduardo.bridge.modelo.base.Especialidade;
import br.kp.eduardo.bridge.modelo.base.Profissional;
import br.kp.eduardo.bridge.modelo.base.Sigilo;
import br.kp.eduardo.bridge.negocio.EntityId;
import br.kp.eduardo.bridge.negocio.ISigilo;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Atendimento implements ISigilo, EntityId {
    private Long id;
    private Sigilo sigilo;
    private Profissional profissional;
    private List<Unidade> unidades;
    private List<Especialidade> especialidades;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atendimento that = (Atendimento) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Atendimento{" +
                "id=" + id +
                ", sigilo=" + sigilo +
                ", profissional=" + profissional.getId() +
                ", unidades=" + unidades +
                ", especialidades=" + especialidades +
                '}';
    }
}
