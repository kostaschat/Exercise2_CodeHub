package Exercise1;

public class StoreAccount extends Account {

    private String storeName;
    private String accountCategory;

    //    constructor of StoreAccount
    public StoreAccount(String owner, Double balance, int numberOfTransactions, String storeName, String accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public void changeCategory(String newCategory) {
        if ((newCategory.toLowerCase().equals("basic")) || (newCategory.toLowerCase().equals("mid")) || (newCategory.toLowerCase().equals("extra")) || (newCategory.toLowerCase().equals("premium")))
        {
            accountCategory = newCategory;
            System.out.println("The new category is: " +accountCategory);
        }
        else if (newCategory.isEmpty())
            System.out.println("You did not give a category");
        else
            System.out.println("You gave  a wrong category");
    }

    public String getAccountCategory() {

        return accountCategory;
    }

    @Override
    public String toString() {
        return "\n" + "The name of account is: " + super.getOwner() + "\n" +
                "The balance is: " + super.getBalance() + "\n" +
                "The number of transactions is: " + super.getNumberOfTransactions() + "\n" +
                "the store name is: " + storeName + "\n" +
                "Category is: " + accountCategory + "\n";
    }

}
