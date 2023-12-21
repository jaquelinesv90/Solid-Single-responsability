package org.example;

public class CalculadoraBonificacao {

    public double calculaBonificacao(Colaborador colaborador){
        final var cargo = colaborador.cargo();
        final var salarioBase = colaborador.salario();

        return cargo.calculaBonificacao(salarioBase);
    }
}
