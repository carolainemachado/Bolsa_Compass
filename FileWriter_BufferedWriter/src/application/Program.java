package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
aula 217
->FileWriter e BufferedWriter = para escrever
 */
public class Program {
    public static void main(String[] args) {

        /*
        vetor de strings, já instanciado com valores
        */
       /* String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

        /*para criar o arquivo e guardar os dados no arquivo*/
        //String path = "D:\\temp\\out.txt";
       // try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {

            /*for (String line : lines) {
                // este write por padrão não tem a quebra de linha
                bw.write(line);
                // para dar a quebra de linha por o newLine
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        /*
        aula 218
        ->Manipulando pastas com File

        /*
        para testar digitar  c:\temp
         */

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        /*
        esta função isDirectory especifica para mim, que e para
        listar somente quem for diretório ou pasta
        */
        /*File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        /*
        para listar a listinha de arquivos
        */
        /*File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        /*
        para criar uma sub pasta
        */
        /*boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);
        sc.close();*/

        /*
        ->aula 219 Informações do caminho do arquivo
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        /*suponha que eu queira acessar somente o caminho completo*/
        System.out.println("getPath: " + path.getPath());

        /*suponha que eu queira acessar somente o caminho sem o nome do arquivo*/
        System.out.println("getParent: " + path.getParent());

        /*suponha que eu queira acessar somente o nome do arquivo e não o caminho completo*/
        System.out.println("getName: " + path.getName());
        sc.close();
    }
}

