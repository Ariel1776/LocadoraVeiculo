package com.company;

public class VeiculoCarga extends Veiculo{ //SUB CLASSE
    String tipoDeCarga;

    @Override
    public float calculaValorVenda(){
        return precoCusto * 1.45f;
    }
}

