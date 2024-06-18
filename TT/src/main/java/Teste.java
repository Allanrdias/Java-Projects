import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {

    // Configuração dos Arquivos CSVs
    private final String ARQUIVO_ALUNOS = "alunos.csv";
    private final String ARQUIVO_CURSOS = "cursos.csv";
    private final String DELIMITADOR = ",";
    private final boolean TEM_CABECALHO = true;

    /**
     * Creates new form Principal
     */
    public Principal() {

        List<String> listaStatus = new ArrayList<String>();
        /*listaStatus.add("Aguardando");
        listaStatus.add("Em processamento");
        listaStatus.add("Em entrega");
        listaStatus.add("Concluído");*/

        try {
            BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_ALUNOS));
            String linha;

            if (TEM_CABECALHO)
                reader.readLine();

            BufferedWriter writer = new BufferedWriter(new FileWriter("new" + ARQUIVO_ALUNOS));

            while((linha = reader.readLine()) != null) {
                String[] colunas = linha.split(DELIMITADOR);
                colunas[1] = colunas[1].trim().replace("\"", "");

                writer.write(linha);
                writer.newLine();
                

                Aluno aluno = new Aluno();
                aluno.setID(Integer.parseInt(colunas[0]));
                aluno.setNome(colunas[1]);
                aluno.setEmail(colunas[2]);
                listaAlunos.add(aluno);


                listaStatus.add(colunas[1]);
            }

            writer.close();

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }

        ComboBoxModel model = new DefaultComboBoxModel(listaStatus.toArray());
        cmbStatus.setModel(model);

        DefaultListModel modelList = new DefaultListModel();
        for (String item : listaStatus)
            modelList.addElement(item);
        lstStatus.setModel(modelList);
    }