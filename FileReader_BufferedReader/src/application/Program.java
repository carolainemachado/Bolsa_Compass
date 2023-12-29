package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Program {

    /*
    aula 215
    -> FileReader e BufferedReader = para ler
    strem em programação significa uma sequencia
    FileReader (stream de leitura de caracteres a partir de arquivos)

     BufferedReader (mais rápido)
    ele vai ser instanciado a partir do FileReader, e ele implementa algumas
    otimizações utilizando o buffer de memória.

     */
    public static void main(String[] args) {

        // neste modo e mostrando tudo manualmente

        String path = "D:\\temp\\in.txt";
        BufferedReader br = null;
        FileReader fr = null;

        /*
        criado bloco try para abrir e ler o arquivo
        */
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            /*
            para ler uma linha do meu arquivo, se o arquivo ja
            estiver no final o readLine, vai retornar nulo
            */
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}