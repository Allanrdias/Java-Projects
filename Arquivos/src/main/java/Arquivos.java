import javax.swing.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Arquivos {
    public static void main(String[] args) throws IOException {

        Path diretorio = Paths.get("C:/Users/Allan/Documents/Senai/Programação de Aplicativos/Desenvolvimento de Aplicativos");
        Path arquivo = Paths.get("C:/Users/Allan/Documents/Senai/Programação de Aplicativos/Desenvolvimento de Aplicativos/texto.txt");
        Path logoNova = Paths.get("C:/Users/Allan/Pictures/logoNova.jpg");
        Path logoAntiga = Paths.get("C:/Users/Allan/Pictures/logoAntiga.jpg");

        try {
            byte[] byteslogoNova = Files.readAllBytes(logoNova);
            Files.write(logoAntiga, byteslogoNova);
        } catch (Exception e) {
            System.out.println("ERROR");
        }

        /* Primeira forma, mais simples e didática utilização de for para List
        try {
            List<String> linhas = Files.readAllLines(arquivo);

            for (String linha : linhas) {
                System.out.println(linha);
            } catch (Exception e) {
            System.out.println("ERROR");
        }
         */

         /* Segunda forma, mais complexa e menos didatica utilização de forEach para List
         linhas.forEach(linha -> System.out.println(linha));

            /* Verificação de diretório e arquivo.
            if (Files.isDirectory(diretorio)) {
                System.out.println("Diretorio existe");
            } else {
                System.out.println("Diretorio não existe");
            }
            if (Files.exists(arquivo)) {
                System.out.println("arquivo existe");
            } else {
                System.out.println("arquivo não existe");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        */
    }
}



