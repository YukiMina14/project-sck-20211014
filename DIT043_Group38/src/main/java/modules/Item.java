package modules;

import controllers.ItemController;

public class Item {
    private final ItemController itemController= getItemController();
    private final String itemID;
    private String name;
    private double price;

    public Item(String itemID, String name, double price) {
        this.itemID = itemID;
        this.name = name;
        this.price = price;
    }

    public String getItemID() {
        return itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {

        return null;
    }

    public ItemController getItemController() {
        return itemController;
    }
}

