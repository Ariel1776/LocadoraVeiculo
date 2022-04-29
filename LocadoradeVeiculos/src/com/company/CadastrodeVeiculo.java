package com.company;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class CadastrodeVeiculo {

    public static void main(String[] args) {

        String op = JOptionPane.showInputDialog(null, "Escolha qual veículo irá comprar :\n " +
                "1.Veículo Carga \n " +
                "2.Veículo Passeio \n" +
                "0. Para fechar o programa");

        int opInt = Integer.parseInt(op);

        do{
            switch (opInt){
                case 1: //Veículo Carga
                VeiculoCarga vc = new VeiculoCarga();
                vc.valorVenda = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Venda"));
                vc.dtCadastro = JOptionPane.showInputDialog(null, "Digite qual a Data de Cadastro");
                vc.tipodeCarga = JOptionPane.showInputDialog(null, "Digite qual o tipo da carga");
                vc.km = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a Kilometragem"));

                JOptionPane.showMessageDialog(null, vc.valorVenda + "\n" + vc.dtCadastro + "\n" + vc.tipodeCarga + "\n" + vc.km);
                break;

                case 2: //Veículo Passeio
                VeiculoPasseio vp = new VeiculoPasseio();
                vp.valorVenda = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Venda"));
                vp.dtCadastro = JOptionPane.showInputDialog(null, "Digite qual a Data de Cadastro");
                vp.km = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a Kilometragem"));
                JOptionPane.showMessageDialog(null, vp.valorVenda + "\n" + vp.dtCadastro + "\n" + vp.km);
                break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Agradecemos os seus dados");
                break;
            }
        }while(opInt != 0);
    }
}
