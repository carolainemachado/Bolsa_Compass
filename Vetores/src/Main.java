import entities.Alugar;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner (System.in);

        /*
        exemplo 1 de vetores
         */

        /*int n = teclado.nextInt();
        /*
        criação do vetor iniciando um vetor de n posiçoes
        double = pq o vetor vai ser de double
        [] = indic que eu estou declarando um vetor
        vect = nome da variavel
        new double [n] = variavel vai receber a instanciação do vetor
         */
        /*double[] vect = new double[n];*/

        /*
        como fazer para guardar os numeros dentro do vetor
         */

        /*
        variavel i iniciando com zero, variavel i menor do que n(esse for
        vai repetir enquanto i for menor que n) e cada vez que
        voltar neste laço inclementa o valor da variavel i
         */
        /*for (int i=0; i<n; i++){
            /*
            vect na posição zero, recebendo o que o usuario digitar
             */
            //vect[i] = teclado.nextDouble();
        //}*

        /*double soma = 0.0;
        for (int i=0; i<n; i++){
            soma += vect[i];
        }*/
        // AVG = a variavel que tem a media
        /*double avg = soma / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);*/


        /*
        exemplo 2 de vetores
         */

        /*
        ao inves de criar uma variavel n(quantidade de elementos do vetor)
        poderia usar a varial do vetor mesmo que seria vect.length(que tambem e a
        quantidades de elementos do vetor)
         */
        /*int n = teclado.nextInt();

        // vetor de n produtos
        Product[] vect = new Product[n];

        /*
        esse for vai percorer todas as posiçoes do vetor
        ate chegar no n e sair fora
         */
        /*for (int i=0; i<vect.length; i++) {
            teclado.nextLine();
            String name = teclado.nextLine();

            double price = teclado.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            /*
            estou acesando o vetor na posição i e estou pegando
            somento o preço
             */
            /*sum += vect[i].getPrice();
        }

        //media dos preços
        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        teclado.close();*/


        // Exercício de fixação

        /*Alugar [] vect = new Alugar[10];

        System.out.println("Quantos quartos serao alugados?");
        int n = teclado.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Alugar #" + i + ":");
            System.out.print("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.print("Email: ");
            String email = teclado.nextLine();
            System.out.print("Quarto: ");
            int quarto = teclado.nextInt();
            vect[quarto] = new Alugar(nome, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }*/

        //exercicio dos negativos

        /*System.out.println("Quantos numeros voce vai digitar? ");
        int n = teclado.nextInt();

        int[] vet = new int[n];

        /*
        variavel i iniciando com zero, variavel i menor do que n(esse for
        vai repetir enquanto i for menor que n) e cada vez que
        voltar neste laço inclementa o valor da variavel i
         */
        /*for (int i=0; i<n; i++){
            System.out.println("Digite um numero:");
            vet [i] = teclado.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i=0; i<n; i++){
            if (vet [i] < 0){
                System.out.println(vet[i]);
            }
        }
        teclado.close();*/


        //EXERCICO ALTURAS

        /*System.out.println("Quantos pessoas serão digitadas? ");
        int n = teclado.nextInt();

        // vetor para guardar os dados
        String [] nomes = new String[n];
        int [] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++){
            System.out.println("Dados da " + (i+1) + "pessoa:");
            System.out.println("Nome: ");
            nomes[i] = teclado.next();
            System.out.println("Idade: ");
            idades[i] = teclado.nextInt();
            System.out.println("Altura: ");
            alturas[i] = teclado.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma = soma + alturas[i];
        }
        double mediaAlturas = soma / n;

        System.out.println();
        System.out.printf("Altura media: %.2f%n", mediaAlturas);

        //para achar a porcentagem

        int cont = 0;
        for (int i=0; i<n; i++){
            if (idades[i] < 16){
                cont = cont + 1;
            }
        }

        double percent = cont * 100.0 / n;
        /*
        usado dois % para ele aparece no resultado e mais
        um para dar a quebra de linha
         */
       // System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        // para imprimir nome das pessoas
        /*for (int i=0; i<n; i++){
            // se idades na posiçao i for menor que 16, imprime o nome da pessoa
            if (idades[i] < 16){
                System.out.println(nomes[i]);
            }*/
        //}

        /*
        Laço "for each"
        Sintaxe opcional e simplificada para percorrer coleções
         */

        /*
        veotor ja instanciado com alguns valores
         */
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        /*
         variavel i iniciando com zero, variavel i menor do que n(esse for
        vai repetir enquanto i for menor que n) e cada vez que
        voltar neste laço inclementa o valor da variavel i
         */
        for (int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }

        /*
        obtendo o mesmo ressultado de cima porem, usando o
        for each
         */

        /*
        string = tipo de elemento dos vetores
        obj= apelido para cada elemento do vetor
        vect = nome da minha coeleção

        este for percorre todos os elementos do vetor vect
        chamando cada um dos elementos de obj
         */
        System.out.println("----------------------");
        /*
        como se le este for, PARA CADA OBJETO OBJ
        CONTIDO NO VETOR VECT FAÇA
         */
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}