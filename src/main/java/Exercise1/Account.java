package Exercise1;

public class Account {
    private String owner;
    private Double balance;
    private int numberOfTransactions;

    //constructor of class
    public Account(String owner, Double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }
    @Override
    public String toString() {
        return "The name of account is " + owner  +
                " and the balance is " + balance +
                " and the number of transactions is " + numberOfTransactions;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }
    public void deposit(double money){
        numberOfTransactions++;
        balance += money;
    }
    public void withdraw (double money){
        if (money>balance)
        {
            System.out.println("You can not withdraw this money from account.");
        }else {
            numberOfTransactions++;
            balance -= money;
        }
    }

}
