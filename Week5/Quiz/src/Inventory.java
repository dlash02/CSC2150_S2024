public class Inventory {
    String item;
    double weight;
    int count;

    public Inventory(String item, double weight, int count) {
        this.item = item;
        this.weight = weight;
        this.count = count;
    }
    boolean shouldOrder( ){
        boolean reorder = false;

        if ( weight > 10 ){
            double percent = .25;
        }
        return false;
    }
}
