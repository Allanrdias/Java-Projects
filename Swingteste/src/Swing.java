import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Swing extends JFrame {

    private JTextField txtName;
    private JButton btnBotao;
    private JLabel lblName;
    private JPanel PanelMain;
    private JTextField txtData;

    public Swing() {
        btnBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = txtName.getText();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    String textoDate = txtData.getText();
                    Date date = sdf.parse(textoDate);
                    txtName.setText(nome + " " + date);
                } catch(ParseException pe) {
                    System.err.printf("Data inválida");
                }
                    //Float num = Float.parseFloat(nome);
                    //txtResultado.setText(Float.toString(num));
                    //JOptionPane.showMessageDialog(btnBotao, "Olá " + nome.replace(".", ",") + ", Welcome");
                //} catch (Exception ec) {
                    //JOptionPane.showMessageDialog(PanelMain, "ERRO", "Error", JOptionPane.ERROR_MESSAGE);
                //}
                //btnBotao.setEnabled(false);
                //txtName.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        Swing s = new Swing();
        s.getContentPane().add(s.PanelMain);
        s.setTitle("Start");
        s.setBounds(600, 200, 200, 200);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.pack();
    }
}
