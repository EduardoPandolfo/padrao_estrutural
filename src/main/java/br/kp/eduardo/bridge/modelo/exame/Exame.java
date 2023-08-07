package br.kp.eduardo.bridge.modelo.exame;

import br.kp.eduardo.bridge.modelo.base.Sigilo;
import br.kp.eduardo.bridge.modelo.base.Unidade;
import br.kp.eduardo.bridge.modelo.base.Especialidade;
import br.kp.eduardo.bridge.modelo.base.Profissional;
import br.kp.eduardo.bridge.negocio.EntityId;
import br.kp.eduardo.bridge.negocio.ISigilo;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Exame implements ISigilo, EntityId {
    private Long id;
    private Profissional profissional;
    private Sigilo sigilo;
    private LocalDate data;

    @Override
    public List<Unidade> getUnidades() {
        return null;
    }

    @Override
    public List<Especialidade> getEspecialidades() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exame exame = (Exame) o;
        return Objects.equals(id, exame.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Exame{" +
                "id=" + id +
                ", profissional=" + profissional.getId() +
                ", sigilo=" + sigilo +
                '}';
    }
}
