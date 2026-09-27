class Account {
    double balance;
    Account() {
        balance = 0;
    }
    Account(double b, double x) {
        balance = b;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount) {
        balance = balance - amount;
    }
    public static void main(String[] args) {
        Account a = new Account(1000, 0);
        a.deposit(500);
        a.withdraw(200);
        System.out.println("Balance = " + a.balance);
    }
}
