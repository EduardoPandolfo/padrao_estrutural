package br.kp.eduardo.estrutural.bridge.modelo.base;

import br.kp.eduardo.estrutural.bridge.negocio.EntityId;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Profissional implements EntityId {
    private Long id;
    private String nome;
    private List<Especialidade> especialidades;
    private List<Unidade> unidades;
    private boolean isAdmin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profissional that = (Profissional) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Profissional{" +
                "id=" + id +
                ", especialidades=" + especialidades +
                ", unidades=" + unidades +
                '}';
    }
}
