package Exercise2;

import java.util.List;

public interface IStore {

    void buy(Product product);

    void sell(Product product);

    double getRevenue();

    void getInventory();
}
