package com.company;

import javax.swing.*;

public class CadastrodeVeiculo {

    public static void main(String[] args) {
        int opInt;
        do{
            String op = JOptionPane.showInputDialog(null, "Escolha qual veículo irá comprar :\n " +
                    "1.Veículo Carga \n " +
                    "2.Veículo Passeio \n" +
                    "0. Para fechar o programa");

            opInt = Integer.parseInt(op);

            switch (opInt){
                case 1: //Veículo Carga
                    VeiculoCarga veiculoCarga = (VeiculoCarga) new VeiculoCarga.Builder()
                            .setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do seu carro")))
                            .setCor(JOptionPane.showInputDialog(null, "Digite a cor do seu carro"))
                            .setChassi(Long.parseLong(JOptionPane.showInputDialog(null, "Digite o chassi do seu carro -LONG-")))
                            .setMarca(JOptionPane.showInputDialog(null, "Digite o marca do seu carro"))
                            .setModelo(JOptionPane.showInputDialog(null, "Digite o modelo do seu carro"))
                            .setPrecoCusto(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço custo do seu carro -float-")))
                            .setKm(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a Kilometragem")))
                            .setDtCadastro(JOptionPane.showInputDialog(null, "Digite qual a Data de Cadastro - (DD/MM/AAAA)"))
                            .setValorVenda(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Venda")))
                            .build();
                    veiculoCarga.tipoDeCarga = JOptionPane.showInputDialog(null, "Digite qual o tipo da carga");

                    JOptionPane.showMessageDialog(null, veiculoCarga.valorVenda + "\n" + veiculoCarga.dtCadastro + "\n" + veiculoCarga.tipoDeCarga + "\n" + veiculoCarga.km);
                break;

                case 2: //Veículo Passeio
                    VeiculoPasseio veiculoPasseio = (VeiculoPasseio) new VeiculoPasseio.Builder()
                            .setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do seu carro")))
                            .setCor(JOptionPane.showInputDialog(null, "Digite a cor do seu carro"))
                            .setChassi(Long.parseLong(JOptionPane.showInputDialog(null, "Digite o chassi do seu carro -LONG-")))
                            .setMarca(JOptionPane.showInputDialog(null, "Digite o marca do seu carro"))
                            .setModelo(JOptionPane.showInputDialog(null, "Digite o modelo do seu carro"))
                            .setPrecoCusto(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço custo do seu carro -float-")))
                            .setKm(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a Kilometragem")))
                            .setDtCadastro(JOptionPane.showInputDialog(null, "Digite qual a Data de Cadastro - (DD/MM/AAAA)"))
                            .setValorVenda(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Venda")))
                            .build();

                    JOptionPane.showMessageDialog(null, veiculoPasseio.valorVenda + "\n" + veiculoPasseio.dtCadastro + "\n" + veiculoPasseio.km);
                break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Agradecemos os seus dados");
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Favor escolher uma opção válida");
                break;
            }
        } while(opInt != 0);
    }
}
