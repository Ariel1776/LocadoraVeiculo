package com.company;

public class VeiculoPasseio extends Veiculo{ //SUB CLASSE
    @Override
    public float calculaValorVenda(){
        float pcCusto = precoCusto * 1.35f;
        return pcCusto;
    }
}
