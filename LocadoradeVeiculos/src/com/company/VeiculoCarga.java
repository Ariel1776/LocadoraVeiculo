package com.company;

public class VeiculoCarga extends Veiculo{ //SUB CLASSE
    double valorVenda;
    String dtCadastro;
    String tipodeCarga;
    int km;

    public float calculaValorVenda(){
        float pcCusto = precoCusto * 1.45f;
        return pcCusto;
    }
}

