package com.senai;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Minha primeira janela");
        janela.setBounds(0,0,200,200);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        Container caixa = janela.getContentPane();
        caixa.setLayout(flow);
        for(int i = 0; i < 9; i++){
            caixa.add(new JButton("N" + i));
        }
        janela.setVisible(true);
    }
}
