package org.example;

public record Colaborador(String nome,Cargo cargo,double salario) {

    public Colaborador(String nome,Cargo cargo,double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
}
