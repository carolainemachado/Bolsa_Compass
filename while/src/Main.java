import java.util.Locale;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        /*
        • Estrutura repetitiva "enquanto"
        • Recomendada quando não se sabe previamente a quantidade de
        repetições
        Regra:
        V: executa e volta
        F: pula fora
         */

        /*int x = teclado.nextInt();
        int soma = 0;
        /*
        enquanto x for diferente de zero seguira executando
         */
        /*while (x !=0){
            soma = soma + x;
            x = teclado.nextInt();
        }
        System.out.println(soma);*/

        /*
        estrutura repetiva FOR = PARA
        Quando usar: quando se sabe
        previamente a quantidade de
        repetições, ou o intervalo de
        valores.
         */

        /*int N = teclado.nextInt();
        int soma = 0;
        /*
        int i=0 = INICIO  i<N = CONDIÇÃO i++ ou i=i+1 = INCREMENTO
         */
        /*for (int i=0; i<N; i++){
            int x = teclado.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);*/

        /*
        Perceba que a estrutura "para" é ótima para se fazer uma repetição
        baseada em uma CONTAGEM:
         */

        // i menor que 5
        /*for (int i=0; i<5; i++) {
            System.out.println("Valor de i: " + i);
        }
        /*
        Contagem regressiva
         */

        // i maior igual a zero
        /*for (int i=4; i>=0; i--) {
            System.out.println("Valor de i: " + i);
        }*/

        /*
        do while = faça enquanto
        O bloco de comandos executa pelo menos uma vez, pois a condição é
        verificada no final.
         */

        char resp;

        do {
            System.out.println("Digite a temperatura em celsius:");
            double c = teclado.nextDouble();
            double f = 9.0 * c/5.0 + 32.0;
            System.out.printf("enquanto em fahrenheit: %.1f%n", f);

            System.out.print("deseja repetir (s/n)?");
            resp = teclado.next().charAt(0);
        } while (resp != 'n');
    }
}