public class Item {
    private String name;
    private int cost;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setCost(int newCost) {
        cost = newCost;
    }

    public double costPerMonth() {
        return (cost / 12);
    }
}
