package entities;
    /*
    pq acrescentar a palavra FINAL
    Classe: evita que a classe seja herdada
    Método: evita que o método sob seja sobreposto

    ex: public final class SavingsAccount extends Account

     */
public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    /*
    sobrescrevendo o metodo da classe Account
     */

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}