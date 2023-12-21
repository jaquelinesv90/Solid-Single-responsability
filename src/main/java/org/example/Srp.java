package org.example;

import java.util.List;

public class Srp {
    public static void main(String[] args){
        final Srp srp = new Srp();
        srp.executar();
    }

    private void executar(){
        final List<Colaborador> colaboradores = List.of(
                new Colaborador("Zequinha",Cargo.DESENVOLVEDOR,500),
                new Colaborador("Zezinho",Cargo.ANALISTA,1000),
                new Colaborador("Carlinhos",Cargo.GERENTE,2000),
                new Colaborador("Luizinho",Cargo.ESTAGIARIO,250)
        );

        final CalculadoraBonificacao calculadora = new CalculadoraBonificacao();

        colaboradores.forEach(colaborador ->{
            System.out.printf("O colaborador %s tem bonificacao de %f%n",
                    colaborador.nome(), calculadora.calculaBonificacao(colaborador)).println();
        });
    }
}
