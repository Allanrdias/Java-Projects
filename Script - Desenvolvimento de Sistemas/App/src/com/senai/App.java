package com.senai;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton btn;
    private JPanel panelMain;
    private JCheckBox cbx;
    private JTextField txtf;
    private JPasswordField pswf;
    private JTextArea txta;
    private JLabel lbl;
    private JRadioButton rbtn;
    private JRadioButton rbtn1;

    public App() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame("App");
        janela.setContentPane(new App().panelMain);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }
}
