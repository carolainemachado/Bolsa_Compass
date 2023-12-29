package entities;

public class SavingsAccountPlus extends SavingsAccount {

    /*
    sobreposição novamento do metodo de saque
     */
    @Override
    public void withdraw(double amount) {
        balance -= amount + 2.0;
    }
}
