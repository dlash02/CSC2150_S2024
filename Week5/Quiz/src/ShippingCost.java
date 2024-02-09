public class ShippingCost {
    private int zip;
    private int distance;
    private double packageWeight;

    public ShippingCost(int zip, int distance, double packageWeight) {
        this.zip = zip;
        this.distance = distance;
        this.packageWeight = packageWeight;
    }

    public double getShippingCost( ){
        double multiplier = 1;
        if ( distance > 25 ){
            multiplier = 1.5;
        } else if ( distance > 50 ) {
            multiplier = 2.0;
        }
        return this.getBaseCost() * multiplier;
    }
    private double getBaseCost() {
        double base = 10;
        if (packageWeight > 5.0) {
            base += 5;
        } else if (packageWeight > 10.0) {
            base += 10;
        } else {
            base += 2;
        }
        return base;
    }
}
