package application;

        import entities.Account;
        import entities.BusinessAccount;
        import entities.SavingsAccount;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        /*
        Classes abstratas
        • São classes que não podem ser instanciadas
        • É uma forma de garantir herança total: somente subclasses não
        abstratas podem ser instanciadas, mas nunca a superclasse abstrata
         */

        /*Account acc1 = new Account(1001,"Alex",1000.0);*/
        Account acc2 = new SavingsAccount(1002,"Maria",1000.0,0.01);
        Account acc3 = new BusinessAccount(1003,"Bob",1000.0,500.0);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001,"Alex",500.0,0.01));
        list.add(new BusinessAccount(1002,"Maria",1000.0,400.0));
        list.add(new SavingsAccount(1003,"Bob",300.0,0.01));
        list.add(new BusinessAccount(1004,"Anna",500.0,500.0));

        Locale.setDefault(Locale.US);

        double soma = 0.0;
        /*
        para cada conta acc, na minha lista chamada list
         */
        for (Account acc : list){
            soma += acc.getBalance();  //para ter a soma de todos os saldos
        }

        System.out.printf("Total balance: %.2f%n", soma);

        /*
        para depositar o valoe de 10.0 em cada conta
         */

        for (Account acc : list){
            acc.deposit(10.0);
        }
        for (Account acc :list){
            System.out.printf("Saldo atualizado da conta %d: %.2f%n", acc.getNumber() ,acc.getBalance());
        }
    }
}