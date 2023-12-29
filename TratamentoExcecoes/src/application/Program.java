package application;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

            System.out.println("******* Metodo 2 inicio *******");
            Scanner sc = new Scanner(System.in);

            /*
            O BLOCO TRY  e o que pode gerar uma execesao
             */

            try {
                // vetor de string      // split= baseiado no espaço em branco
                String[] vect = sc.nextLine().split(" ");
                int position = sc.nextInt();
            /*
            mostrar na tela o meu vetor mais a posição que informei
            ex: maria, bob e alex  quando eu digitar o numero 1
            vai informar quem esta no vetor 1 que e a maria


            porem se eu digitar os nomes normalmente mas na,
            posição eu informar uma letra ?
            VAI APRESENTAR UM ERRO, se nao tiver o tratamento de execessoes

            OUTRO TIPO DE EXCESSÃO
            outro tipo de erro e se eu informar uma posição
            que nao tem no meu vetor ex:  maria, bob e alex quando
            eu digitar a posição 5 vai aparecer um
            erro (que esta acessando o indice do array fora do limite)
             */
                System.out.println(vect[position]);

            /*
            CATCH = vou declarar a exceção

            com este bloco de execesao caso digitar uma posição
            que nao tenha no meu vetor ele vai apresentar a mensagem
            POSIÇÃO INVALIDA e vai seguir normalmnete ate imprimir a ultima
            mensagem do programa
             */
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid position!");
                /*
                ele vai imprimir na tela o rastreamento do stack

                ele vai mostrar toda chamada de metodo que acaretou
                naquela execessao
                 */
                e.printStackTrace();
                sc.next();
            /*
            essa execesao e no caso se digitar a letra no lugar no numero
             */
            } catch (InputMismatchException e) {
                System.out.println("Input error");
            }
            System.out.println("End of program");
            sc.close();
            System.out.println("******* Metodo 2 fim *******");

        }
    }