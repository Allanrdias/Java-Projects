import javax.swing.*;

public class JFrame02 {

    private JFrame tela;

    public JFrame02(){
        tela = new JFrame();
        tela.setSize(800,600);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setVisible(true);

    }
    public static void main(String[] args) {
        new JFrame02();
    }
}

import javax.swing.*;

public class tela{
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI(){
        JFrame meuFrame = new JFrame();
        meuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        meuFrame.getContentPane().add(label);

        meuFrame.setVisible(true);
    }
}