package com.company;

public class VeiculoPasseio extends Veiculo{ //SUB CLASSE
    double valorVenda;
    String dtCadastro;
    int km;

    public float calculaValorVenda(){
        float pcCusto = precoCusto * 1.35f;
        return pcCusto;
    }
}
