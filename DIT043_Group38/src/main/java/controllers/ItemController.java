package controllers;

import modules.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemController {
    private final List<Item> items = new ArrayList<>();

    public List<Item> getItems() { //getter method
        return items;
    }

    // get items from arraylist items and print them out one by one, print value instead of object reference, format correctly
    public String createItem(String itemID, String itemName, double unitPrice) {
        // Will check to see if the item ID is empty or the item name is empty or the price is <= 0
        if (itemID.isEmpty() || itemName.isEmpty() || unitPrice <= 0) {
            return "Invalid data for item.";
        } else {
            /* If that's all clear, loops through all the items in the arraylist to see if the item ID is the same
               as the ID you inputted into your method
            */
            for (Item item : items) {
                if (item.getItemID().equals(itemID)) {
                    return "Two items cannot have the same ID!";
                }
            }
        }
        // Otherwise, create a new item and add to the ItemController arraylist.
        Item item = new Item(itemID, itemName, unitPrice);
        items.add(item);
        return "Item " + itemID + " was registered successfully";
    }

    //
    public String RemoveItem(String itemID){
        if(itemID.isEmpty()) {
            return "Invalid data for item.";
        }else {
            for (Item i : items) { //for every Item index in our array of items
                if (i.getItemID().equals(itemID)) {
                    items.remove(i);
                    return "Item "+ itemID +" was successfully removed.";
                }
            }
            return "Item " + itemID + " could not be removed.";
        }
    }

    public String printItem() {

        StringBuilder result;
        result = new StringBuilder();
        for(Item item: items) {
            result.append(item.toString());
        }
        return result.toString();

    }
}
