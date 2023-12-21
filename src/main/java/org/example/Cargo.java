package org.example;


public enum Cargo {
     ANALISTA {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.05;
        }
       },

    DESENVOLVEDOR{
            @Override
            public double calculaBonificacao(double salarioBase){
                return salarioBase * 0.05;
            }
     },
    GERENTE{
        @Override
        public double calculaBonificacao(double salarioBase){
            return salarioBase * 0.05;
        }
    },
    ESTAGIARIO;

    public  double calculaBonificacao(double salarioBase){
        return 0;
    }
}
