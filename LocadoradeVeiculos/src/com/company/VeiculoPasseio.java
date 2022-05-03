package com.company;

public class VeiculoPasseio extends Veiculo{ //SUB CLASSE
    static float taxa = 1.35f;

    @Override
    public float calculaValorVenda(){
        return precoCusto * VeiculoPasseio.taxa;
    }
}
