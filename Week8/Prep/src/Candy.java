public class Candy {
    // Row:id,candy_name,sales,price,cost
    // Row:1,Chocolate Bar,50,1.50,1.00
    private String name;
    private int sales;
    private double price;
    private double cost;

    public Candy(String name, int sales, double price, double cost) {
        this.name = name;
        this.sales = sales;
        this.price = price;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getSales() {
        return sales;
    }

    public double getPrice() {
        return price;
    }

    public double getCost() {
        return cost;
    }
}
