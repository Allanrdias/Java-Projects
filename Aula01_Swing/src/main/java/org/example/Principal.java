package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Texto da mensagem");

        JFrame janela = new JFrame("Minha primeira janela");
        janela.setBounds(0, 0, 500, 300);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //janela.setVisible(true);

        FlowLayout flow = new FlowLayout();
        Container caixa = janela.getContentPane();
        caixa.setLayout(flow);
        for(int i = 0; i < 9; i++) {
            JButton botao = new JButton(" ");
            botao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //JOptionPane.showMessageDialog(null, "Oi"); //Abrir uma janela com mensagem
                    //System.exit(0); //Fechar o programa
                }
            });
            caixa.add(botao);
        }

        janela.setVisible(true);
    }
}