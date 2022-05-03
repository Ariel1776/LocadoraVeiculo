package com.company;

public class Veiculo { //SUPER CLASSE
    static int count = 0;
    int id;
    int ano;
    String marca;
    String modelo;
    String cor;
    long chassi;
    float precoCusto;
    int km;
    double valorVenda;
    String dtCadastro;

    //constructor
    public Veiculo(){
        Veiculo.count++;
        this.id = count;
    }

    public Veiculo(int ano, String marca, String modelo, String cor, long chassi, float precoCusto, int km, String dtCadastro) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.precoCusto = precoCusto;
        this.valorVenda = this.calculaValorVenda();
        this.km = km;
        this.dtCadastro = dtCadastro;
    }

    public float calculaPrecoCusto(){
        return precoCusto * 1.05f;
    }

    public float calculaValorVenda(){
        return precoCusto * 1.20f;
    }

    static class Builder {
        int ano;
        String marca;
        String modelo;
        String cor;
        long chassi;
        float precoCusto;
        int km;
        String dtCadastro;

        public Builder setAno(int ano) {
            this.ano = ano;
            return this;
        }

        public Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder setCor(String cor) {
            this.cor = cor;
            return this;
        }

        public Builder setChassi(long chassi) {
            this.chassi = chassi;
            return this;
        }

        public Builder setPrecoCusto(float precoCusto) {
            this.precoCusto = precoCusto;
            return this;
        }

        public Builder setKm(int km) {
            this.km = km;
            return this;
        }


        public Builder setDtCadastro(String dtCadastro) {
            this.dtCadastro = dtCadastro;
            return this;
        }

        public Veiculo build(){
            return new Veiculo(this.ano, this.marca, this.modelo, this.cor, this.chassi, this.precoCusto, this.km, this.dtCadastro);
        }

    }

}
