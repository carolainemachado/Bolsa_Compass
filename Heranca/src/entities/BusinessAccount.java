package entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    /*
    testando no if se o valor que
    eu estou querendo emprestar e menor ou igual
    ao meu limite de emprestimo,
    nao posso emprestar um valor acima do limite
     */
    public void loan(double amount) {
        if (amount <= loanLimit) {
            /*
            saldo da conta vai receber ele mesmo
            mais a quantia e menos e  10.0 que e a taxa
             */
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        /*
        descontando do saldo o valor de 2
         */
        balance -= 2.0;
    }
}
