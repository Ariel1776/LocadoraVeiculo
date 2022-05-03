package com.company;

public class VeiculoCarga extends Veiculo{ //SUB CLASSE
    static float taxa = 1.45f;
    String tipoDeCarga;

    @Override
    public float calculaValorVenda(){
        return precoCusto * VeiculoCarga.taxa;
    }
}

