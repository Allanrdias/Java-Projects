package com.senai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Arquivo {
    public static void main(String[] args) throws Exception {
        limparTela();
        //criarArquivo("arquivo.txt");
        //mostrarInfoArquivo("arquivo.txt");
        //escreverEmArquivo("arquivo.txt");
        lerDeArquivo("arquivo.txt");
    }

    public static void limparTela() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void criarArquivo(String caminho) {
        File arquivo = new File(caminho);
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso.");
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo");
            e.printStackTrace();
        }
    }

    public static String traduzir(boolean valor) {
        if (valor)
            return "sim";
        else
            return "não";
    }

    public static void mostrarInfoArquivo(String caminho) {
        File arquivo = new File(caminho);
        System.out.printf("Pode ser lido: %s\n", traduzir(arquivo.canRead()));
        System.out.printf("Pode ser escrito: %s\n", traduzir(arquivo.canWrite()));
        System.out.printf("Pode ser executado: %s\n", traduzir(arquivo.canExecute()));
        System.out.printf("É um arquivo: %s\n", traduzir(arquivo.isFile()));
        System.out.printf("é um diretório: %s\n", traduzir(arquivo.isDirectory()));
        System.out.printf("Criado com caminho absoluto: %s\n", traduzir(arquivo.isAbsolute()));
        System.out.printf("Nome: %s\n", arquivo.getName());
        System.out.printf("Caminho absoluto: %s\n", arquivo.getAbsolutePath());
    }

    public static void escreverEmArquivo(String caminho) {
        try {
            FileWriter escritor = new FileWriter(caminho);
            escritor.write("Linha 01\n");
            escritor.write("Linha 02\n");
            escritor.write("Linha 03\n");
            escritor.write("Linha 04\n");
            escritor.write("Linha 05\n");
            escritor.close();
            System.out.println("Dados escritos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever em arquivo:");
            e.printStackTrace();
        }
    }

    public static void lerDeArquivo(String caminho) {
        try {
            File arquivo = new File(caminho);
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            leitor.close();
            System.out.println("Dados lidos com sucesso.");
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler de :");
            e.printStackTrace();
        }
    }
}
