package Exercise2;

public class Product {
    private int id;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;

    //constructor class
    public Product(int id, String name, double priceWhenBuy, double priceWhenSell) {
        this.id = id;
        this.name = name;
        this.priceWhenBuy = priceWhenBuy;
        this.priceWhenSell = priceWhenSell;
    }

    public double getPriceWhenBuy() {
        return priceWhenBuy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPriceWhenSell() {
        return priceWhenSell;
    }


}
