
class Account {

    private long account_Number;
    private String account_Holder;
    private double balance;

    public void setaccount_Number(long account_Number) {
        this.account_Number = account_Number;
    }

    public long getaccount_Number() {
        return account_Number;
    }

    public void setaccount_Holder(String account_Holder) {
        this.account_Holder = account_Holder;
    }

    public String getaccount_Holder() {
        return account_Holder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

@SuppressWarnings("unused")
class Bank_Account {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setaccount_Number(1001);
        acc.setaccount_Holder("Charan");

        System.out.println("Account holder: " + acc.getaccount_Holder());
        acc.deposit(5000);
        acc.withdraw(900);
        System.out.println("Account balance: " + acc.getBalance());
        System.out.println("----------------------------------");
        acc.setaccount_Number(1002);
        acc.setaccount_Holder("Ram");
        //acc.deposit(5000);
        acc.withdraw(4000);
        System.out.println("Account balance: " + acc.getBalance());
        // System.out.println("-----");

        // acc.withdraw(120);
        // System.out.println("Account balance: "+acc.getBalance());
    }
}
