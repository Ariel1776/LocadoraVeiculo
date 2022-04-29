package com.company;

public class Veiculo { //SUPER CLASSE
    int id;
    int ano;
    String marca;
    String modelo;
    String cor;
    long chassi;
    float precoCusto;

    public float calcuraPrecoCusto(){
        float pcCusto = precoCusto * 1.05f;
        return pcCusto;
    }

    public float calculaValorVenda(){
        float pcCusto = precoCusto * 1.2f;
        return pcCusto;
    }

}
