package InClass;
//id,candy_name,sales,price,cost
public class Candy {
    private int id;
    private String candyName;
    private int sales;
    private double price;
    private double cost;

    public Candy(int id, String candyName, int sales, double price, double cost) {
        this.id = id;
        this.candyName = candyName;
        this.sales = sales;
        this.price = price;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getCandyName() {
        return candyName;
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
