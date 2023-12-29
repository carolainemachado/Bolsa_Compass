package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //aula 214
        /*
        criação do objeto do tipo FILE, ele vai encapsular todo o processo
        de acessar o arquivo e também o caminho deste arquivo
        / = precisa por o barra porque ele é prefixo de caracteres especiais
        como por exemplo /n , /t ...
        //= para indicar que você quer a barrinha invertida mesmo você tem que
        colocar duas barras
        */
        File file = new File("D:\\temp\\in.txt");
        Scanner sc = null;
        try {
            /* instanciando o scanner a partir deste arquivo
            a partir deste momento, o programa vai tentar abrir este arquivo
            e neste momento, pode ser gerada uma exceção
            */
            sc = new Scanner(file);
            /* hasNextLine= e para testar se ainda existe uma nova linha no arquivo
            se existir essa nova linha vou mandar imprimir
            */
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        /*
        bloco finally= para fechar o scanner
        independente se deu certo o try ou não
        */
        finally {
            /*
            pode ser que tenha dado algum erro na hora de instanciar o scanner,
            entao precisa for o if para ver se sc e diferente de nulo
            */
            if (sc != null) {
                sc.close();
            }
        }
    }
}