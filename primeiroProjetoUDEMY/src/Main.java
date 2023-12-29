import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        double x = 10.35784;

        System.out.println(x);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);*/

        /*
         para quando imprimir numeros com vircula quando
        precisar ser ponto precisa fazer esta importação
         */
        /*Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);*/

        /*
        Para concatenar vários elementos em um
        mesmo comando de escrita
         */
       /* System.out.println("RESULTADO = " + x + " METROS");
        System.out.println();

        System.out.println("EXERCICIO 01");
        System.out.println();
        //INICIANDO AS VERIAVEIS
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%s which price is R$ %.2f %n", product1, price1);
        System.out.printf("%s which price is R$ %.2f %n", product2, price2);

        // nao entendi esta parte %c%n
        System.out.printf("Record: %d years old, code %d and agendar %c%n", age, code,gender);

        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

        System.out.println();
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        System.out.println();*/

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        /*
        Para ler um caractere
         */
        /*String x;
        int y;
        double z;

        x = teclado.next();
        y = teclado.nextInt();
        z = teclado.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        teclado.close();
        /* saida do exercicio, usuario que digita essas informaçoes
        maria 30 4.5
        Dados digitados:
        maria
        30
        4.5
         */

        String s1, s2, s3;
        int x;
        /*
        nextLine le uma linha inteira de uma frase diferente do next que
        le apenas uma palavra
         */
        x = teclado.nextInt();
        s1 = teclado.nextLine();
        s2 = teclado.nextLine();
        s3 = teclado.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        teclado.close();

    }
}