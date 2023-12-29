package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* aula 216
É um bloco try que declara um ou mais recursos, e garante que esses
recursos serão fechados ao final do bloco
-> Bloco try-with-resources = forma mais inteligente
*/
public class Program {
    public static void main(String[] args) {
        String path = "D:\\temp\\ini.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}