package com.exercicio2.model;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoalResponsavel;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getPessoalResponsavel() {
        return pessoalResponsavel;
    }

    public void setPessoalResponsavel(String pessoalResponsavel) {
        this.pessoalResponsavel = pessoalResponsavel;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                ", pessoalResponsavel='" + pessoalResponsavel + '\'' +
                '}';
    }
}
