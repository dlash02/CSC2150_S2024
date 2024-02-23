package HW2;

public class Item {
   private int id;
   private String name;
   private int count;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public int getReorderMinCt() {
        return reorderMinCt;
    }

    private double cost;
    private String type;
   private int reorderMinCt;

    public Item(int id, String name, int count, double cost, String type, int reorderMinCt) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.cost = cost;
        this.type = type;
        this.reorderMinCt = reorderMinCt;
    }
    public double getTotalCost(){
        return cost*count;
    }
    public boolean reorderItem(){
        if( count < reorderMinCt){
            return true;
        }
        return false;
    }
}
