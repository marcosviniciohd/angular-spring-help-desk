package br.com.marcosvinicio.helpdesk.domain.enums.model;

import br.com.marcosvinicio.helpdesk.domain.enums.Perfil;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {

    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
