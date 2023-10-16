public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(15000);

        while (true){

            try {
                bankAccount.withdraw(6000);
            } catch (LimitException e) {

                System.out.println(e.getMessage());
                System.out.println(e.getRemainingAmount() - bankAccount.getAmount());
                break;
            }

        }


    }

}