import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        /*
        estou dizendo para adicionar na posição 2 o marco
         */
        list.add(2,"Marco");

        /*
        para saber o tamanho da lista
         */
        System.out.println(list.size());

        /*
        para remover elemento da lista
         */
        list.remove("Anna");

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------------------");
        //para remover os nomes que cujo caracter se iniciava com M maiusculo
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        // para encontrar a posição de um elemento
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}