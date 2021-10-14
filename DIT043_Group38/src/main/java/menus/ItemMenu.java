package menus;

import controllers.ItemController;
import utilities.UserInput;

public class ItemMenu {

    public static final String EOL = System.lineSeparator();
    private final ItemController itemController= getItemController();
    public void itemMenu(){

        System.out.print(
            EOL +
            "Items options menu: "           + EOL +
            "0. Return to Main Menu."        + EOL +
            "1. Create an Item."             + EOL +
            "2. Remove an Item."             + EOL +
            "3. Print all registered Items." + EOL +
            "4. Buy an Item."                + EOL +
            "5. Update an Item's name."      + EOL +
            "6. Update an Item's price."     + EOL +
            EOL +
            "Type an option number: "
        );

        boolean exit = false;
        while(!exit) {

            String userInput;
            userInput = new UserInput().readString();
            switch (userInput) {
                case "0": exit = true;                  break; //looks better as 1 line

                case "1": CreateItem();                 break; //created a method to this further down (line 67). looks cleaner when everything is not clustered.

                case "2": RemoveItem();                 break; //Removes an item

                case "3":
                    System.out.println("3. Print all registered Items.");
                    System.out.println(new ItemController().printItem());

                    break;
                case "4":
                    System.out.println("4. Hire an Item");
                    break;
                case "5":
                    System.out.println("5.Update an Item's name.");
                    break;
                case "6":
                    System.out.println("6. Update an Item's price.");
                    break;

                default:
                    System.out.println("Going back to Main Menu... Please type in another option from 0-3");
                    new MainMenu().mainMenu();
                    break;
            }
        }
    }


    /*****************METHODS*******************/

    ///Create an Item///--
    private void CreateItem(){
        System.out.println("1. Creating an item:\n"
                + "Input item ID, name and price:");

        UserInput input = new UserInput(); //creating an object called input, so we can reuse it in other methods.
        String itemID = input.readString(); //scanner reads the user input.
        String itemName = input.readString();
        double unitPrice = input.readDouble();

        System.out.println(new ItemController().createItem(itemID, itemName, unitPrice));

        //insert item option menu here

    }

    ///Remove an Item///--
    private void RemoveItem(){

        //Not needed -> UserInput input = new UserInput();
        System.out.print("2.Remove an item" + EOL +
                        "Enter an ID: ");
        String itemID  = new UserInput().readString();  //Don't need to create a named object called input as in "private void CreateItem", -->
                                                        //-> because we only use method once. Only need to remove an ID to remove the item.
        System.out.println(new ItemController().RemoveItem(itemID));
    }


    public ItemController getItemController() {
        return itemController;
    }
}