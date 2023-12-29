import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        /*
        Sintaxe da estrutura condicional SIMPLES
        REGRA:
        V: executa o bloco de comandos
        F: pula o bloco de comandos
         */
        int x = 5;

        System.out.println("Bom dia");

        // se x for menor que zero, vai executar o boa tarde
        if (x < 0){
            System.out.println("Boa tarde");
        }
        System.out.println("Boa noite");

        /*
        Sintaxe da estrutura condicional COMPOSTA
        REGRA:
        V: executa somente o bloco do if
        F: executa somente o bloco do else
         */

        /*int hora;

        System.out.println("Quantas horas?");
        hora=teclado.nextInt();

        // se a hora for menor que 12 mensagem de retorno bom dia
        if (hora < 12){
            System.out.println("Bom dia");
        }
        else {
            System.out.println("Boa tarde");
        }

        teclado.close();*/

        /*
        Encadeamento de estruturas condicionais
         */

        /*int hora;

        System.out.println("Quantas horas?");
        hora=teclado.nextInt();

        // se a hora for menor que 12 mensagem de retorno bom dia
        if (hora <=12){
            System.out.println("Bom dia");
        }
        // hora e menor do que 18 ? se sim boa tarde
        else if (hora < 18){
                System.out.println("Boa tarde");
        }
        else {
                System.out.println("Boa noite");
        }

        teclado.close();*/

        // outro exercicio
        Locale.setDefault(Locale.US);

        int minutos = teclado.nextInt();
        double conta = 50.0;
        /*
        se minutos for maior que 100,
         conta rebcene o que ja etsva anela mais o valor do execende
         */
        if (minutos > 100){
            conta = conta + (minutos - 100) * 2.0;
            // conta += (minutos - 100) * 2.0; desta forma cai no mesmo ressultado
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        teclado.close();
    }
}