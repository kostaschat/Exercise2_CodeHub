import Exercise1.Account;
import Exercise1.StoreAccount;
import Exercise2.IStore;
import Exercise2.InventoryRetailStore;
import Exercise2.Product;
import Exercise2.SimpleRetailStore;

public class Main {
    public static void main(String[] args) {

        testAccount();
        testStoreAccount();
        test();
        lastTest();

    }


    //test class Account
    private static void testAccount() {
        Account account = new Account("Kostas", 1000.0, 1);
        // return all values from one user with the method to String
        System.out.println(account);
        account.deposit(100.0);
        System.out.println("the new balance is " + account.getBalance() + " and the number of transactions is " + account.getNumberOfTransactions());
        //try to draw more money from balance on account
        account.withdraw(11100000.0);
        System.out.println("the new balance is " + account.getBalance() + " and the number of transactions is " + account.getNumberOfTransactions());
        //try to draw money from account
        account.withdraw(100.0);
        System.out.println("the new balance is " + account.getBalance() + " and the number of transactions is " + account.getNumberOfTransactions());
    }

    //test class StoreAccount
    private static void testStoreAccount() {
        StoreAccount storeAccount = new StoreAccount("Peter", 1500.0, 3, "House of shoes", "mid");
        // return all values from one user with the method to String
        System.out.println(storeAccount);

        //try to change  with wrong category
        storeAccount.changeCategory("very well");
        //try to change with a right category
        storeAccount.changeCategory("extra");
        //try to enter empty category
        storeAccount.changeCategory("");

    }
    //method to test exercise 2
    private static void test() {
        System.out.println();
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);
        IStore simple = new SimpleRetailStore();
        simple.buy(x1);
        simple.buy(x4);
        simple.sell(x1);
        System.out.println(simple.getRevenue());
    }
    //method to test exercise 2
    private static void lastTest() {
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);

        IStore invStore = new InventoryRetailStore();
        invStore.buy(x1);
        invStore.buy(x4);
        invStore.sell(x1);
        System.out.println(invStore.getRevenue());
        invStore.sell(x2);
        invStore.getInventory();

    }
}
