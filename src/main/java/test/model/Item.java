package test.model;

public class Item {

    private String name;
    private int cost;
    private Category category;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Item(String name, int cost, Category category) {
        this.name = name;
        this.cost = cost;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
