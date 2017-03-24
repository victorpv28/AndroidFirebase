package br.com.app.paulo.firebase.model;

/**
 * Created by pvnluz on 23/03/2017.
 */

public class Tarefa {

    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
