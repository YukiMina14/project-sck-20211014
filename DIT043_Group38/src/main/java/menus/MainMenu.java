package menus;

import controllers.ItemController;
import utilities.UserInput;

public class MainMenu {

    public static final String EOL = System.lineSeparator();
    private final ItemController itemController= getItemController();
    public void mainMenu() {
        System.out.print (
            "Main Menu: Please choose among the options below." + EOL +
            EOL +
            "0. Close system."                                  + EOL +
            "1. Open Item options."                             + EOL +
            "2. Open Review options."                           + EOL +
            "3. Open Transaction History options."              + EOL +
            "4. Open Employee options."                         + EOL +
            EOL +
            "Type an option number: " );

        String userInput = new UserInput().readString();
        switch (userInput){                                                        //break; stops the switch statement from checking the other cases bellow
            case "0": System.exit(404);                                                break;

            case "1": new ItemMenu().itemMenu();                                            break;

            case "2": new ReviewMenu().reviewMenu();                                        break;

            case "3": new TransactionHistoryOptions().transactionsHistoryOptions();         break;

            default:
                System.out.println("Invalid option... Please type in another option from 0-4");
                new MainMenu().mainMenu();
        }
    }


    public ItemController getItemController() {
        return itemController;
    }
}

//Items menu


