package com.company;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class CadastroVeiculo2 {

    public static void main(String[] args) {
        Veiculo v = new Veiculo();
        JOptionPane.showMessageDialog(null, "Clique em OK para cadastrar o seu veículo");
         v.id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do deu cadastro"));
         v.ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do seu carro"));
         v.marca = JOptionPane.showInputDialog(null, "Digite o marca do seu carro");
         v.modelo = JOptionPane.showInputDialog(null, "Digite o modelo do seu carro");
         v.cor = JOptionPane.showInputDialog(null, "Digite a cor do seu carro");
         v.chassi = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o chassi do seu carro -LONG-"));
         v.precoCusto = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço custo do seu carro -float-"));

        String op = JOptionPane.showInputDialog(null, "Escolha qual veículo irá comprar :\n " +
                "1.Veículo Carga \n " +
                "2.Veículo Passeio \n" +
                "0. Para fechar o programa");
        int opInt = Integer.parseInt(op);
        do{
            switch (opInt){
                case 1: //Veículo Carga
                    int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do deu cadastro"));
                    if (id == v.id) {
                        VeiculoCarga vc = new VeiculoCarga();
                        vc.valorVenda = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Venda"));
                        vc.dtCadastro = JOptionPane.showInputDialog(null, "Digite qual a Data de Cadastro");
                        vc.tipodeCarga = JOptionPane.showInputDialog(null, "Digite qual o tipo da carga");
                        vc.km = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a Kilometragem"));

                        JOptionPane.showMessageDialog(null, v.id + "\n" + v.ano + "\n" + v.marca + "\n" +
                                v.modelo + "\n" + v.cor + "\n" + v.chassi + "\n" + v.precoCusto); //Veículo == ID

                        JOptionPane.showMessageDialog(null, vc.valorVenda + "\n" + vc.dtCadastro + "\n" +
                                vc.tipodeCarga + "\n" + vc.km); //Dato inputados
                        break;
                        //NÃO VOLTA PARA A RELA INICIAL DEPOIS DISSO :(
                    }else{
                       JOptionPane.showInputDialog(null, "Digite um ID valido");
                    }
                case 2: //Veículo Passeio
                    VeiculoPasseio vp = new VeiculoPasseio();
                    vp.valorVenda = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Venda"));
                    vp.dtCadastro = JOptionPane.showInputDialog(null, "Digite qual a Data de Cadastro");
                    vp.km = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a Kilometragem"));
                    JOptionPane.showMessageDialog(null, vp.valorVenda + "\n" + vp.dtCadastro + "\n" + vp.km);
                    break;
            }
            //aaJOptionPane.showMessageDialog(null, "Agradecemos os seus dados");
        }while(opInt == 0);
        return;

    }
}
