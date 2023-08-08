package br.kp.eduardo.estrutural.bridge;

import br.kp.eduardo.estrutural.bridge.factory.AtendimentoFactory;
import br.kp.eduardo.estrutural.bridge.factory.ExameFactory;
import br.kp.eduardo.estrutural.bridge.factory.ProfissionalFactory;
import br.kp.eduardo.estrutural.bridge.modelo.atendimento.Atendimento;
import br.kp.eduardo.estrutural.bridge.modelo.base.Profissional;
import br.kp.eduardo.estrutural.bridge.modelo.exame.Exame;
import br.kp.eduardo.estrutural.bridge.negocio.impl.ControleSigiloAtendimentoReadImpl;
import br.kp.eduardo.estrutural.bridge.negocio.impl.ControleSigiloExameReadImpl;
import br.kp.eduardo.estrutural.bridge.negocio.impl.ControleSigiloUpdateImpl;

import java.util.Arrays;
import java.util.List;

public class VerificaAcesso {

    public static void main(String[] args) {
        List<Profissional> profissionais = Arrays.asList(ProfissionalFactory.getProfissional1(), ProfissionalFactory.getProfissional2());
        List<Exame> exames = Arrays.asList(ExameFactory.getExame1(), ExameFactory.getExame2());
        List<Atendimento> atendimentos = Arrays.asList(AtendimentoFactory.getAtendimento1(), AtendimentoFactory.getAtendimento2(), AtendimentoFactory.getAtendimento3());

        for (Profissional profissional : profissionais) {
            System.out.println(profissional);


            ControleSigiloUpdateImpl controleSigiloUpdate = new ControleSigiloUpdateImpl(null);

            for (Exame exame : exames) {
                System.out.println("\t" + exame);

                ControleSigiloExameReadImpl controleSigiloRead = new ControleSigiloExameReadImpl(exame);
                controleSigiloUpdate.setISigilo(exame);

                boolean temAcessoRead = controleSigiloRead.temAcesso(profissional);
                boolean temAcessoUpdate = controleSigiloUpdate.temAcesso(profissional);

                System.out.println("\t AcessoRead: " + temAcessoRead);
                System.out.println("\t AcessoUpdate: " + temAcessoUpdate);

                System.out.println("\t ------------------------------------------");
            }

            for (Atendimento atendimento : atendimentos) {
                System.out.println("\t" + atendimento);

                ControleSigiloAtendimentoReadImpl controleSigiloRead = new ControleSigiloAtendimentoReadImpl(atendimento);
                controleSigiloUpdate.setISigilo(atendimento);

                boolean temAcessoRead = controleSigiloRead.temAcesso(profissional);
                boolean temAcessoUpdate = controleSigiloUpdate.temAcesso(profissional);

                System.out.println("\t AcessoRead: " + temAcessoRead);
                System.out.println("\t AcessoUpdate: " + temAcessoUpdate);

                System.out.println("\t ------------------------------------------");
            }
        }
    }
}
