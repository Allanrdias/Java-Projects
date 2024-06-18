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