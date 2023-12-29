import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        /*
        para mostrar a data do dia de hoje
         */
        LocalDate d01 = LocalDate.now();
        System.out.println("d01 = " + d01);

        /*
        para mostrar a hora do dia de hoje
         */
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02 = " + d02);

        /*
        data e hora global
         */
        Instant d03 = Instant.now();
        System.out.println("d03 = " + d03);
    }
}