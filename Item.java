public class Item {
    private String name;
    private int cost;
    private int savingGoal;
    private int amountSaved;

    public Item(String name, int cost, int savingGoal, int amountSaved) {
        this.name = name;
        this.cost = cost;
        this.savingGoal = savingGoal;
        this.amountSaved = amountSaved;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getSavingGoal() {
        return savingGoal;
    }

    public int getAmountSaved() {
        return amountSaved;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setCost(int newCost) {
        cost = newCost;
    }

    public void setSavingGoal(int newGoal) {
        savingGoal = newGoal;
    }

    public void setAmountSaved(int amount) {
        amountSaved = amount;
    }

    public double costPerMonth() {
        return (cost / 12);
    }
}
