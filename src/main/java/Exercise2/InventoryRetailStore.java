package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements IStore {
    List<Product> productList = new ArrayList<>();
    private double sum = 0;

    //add a item to list
    @Override
    public void buy(Product product) {
        productList.add(product);
        sum -= product.getPriceWhenBuy();
    }
    // check if first bought the item and after sell it and calculate the sum
    @Override
    public void sell(Product product) {
        boolean checkIfBought = productList.contains(product);
        if (!checkIfBought)
            buy(product);
        productList.remove(product);
        sum += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return sum;
    }


    @Override
    public void getInventory() {
        for (Product product : productList)
            System.out.println("Id is: " + product.getId() + "\n" + "Name is: " + product.getName()
                    + "\n" + "Buy is: " + product.getPriceWhenBuy() + "\n" + "Sell is: " + product.getPriceWhenSell() + "\n");

    }

    public void reset() {
        productList.clear();
    }

}
