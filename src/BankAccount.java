public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
    }

    public void withdraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ошибка", amount);
        } else {
            amount -= sum;
        }

    }


}
