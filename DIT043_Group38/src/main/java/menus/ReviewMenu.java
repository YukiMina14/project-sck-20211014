package menus;

import utilities.UserInput;

public class ReviewMenu {

    public static final String EOL = System.lineSeparator();

    public void reviewMenu(){
        System.out.print(
            EOL +
            "0. Return to Main Menu"                            + EOL +
            "1.Create review for an Item."                      + EOL +
            "2. Print a specific review of an Item."            + EOL +
            "3. Print all reviews of an Item."                  + EOL +
            "4. Print mean grade of an Item."                   + EOL +
            "5. Print all comments of an Item."                 + EOL +
            "6. Print all registered reviews."                  + EOL +
            "7. Print item(s) with most reviews."               + EOL +
            "8. Print item(s) with least reviews."              + EOL +
            "9. Print item(s) with best mean review grade."     + EOL +
            "10. Print item(s) with worst mean review grade."   + EOL +
          EOL +
            "Type an option number: "
        );

        String userInput = new UserInput().readString();
        switch (userInput){
            case "0":
                System.out.println("0. Returning to main menu...");
                new MainMenu().mainMenu();

                break;
            case "1":
                System.out.println("1. Create a review for selected item");
                break;
            case "2":
                System.out.println("2.Print a specific review of an Item");
                break;
            case "3":
                System.out.println("3. Print all reviews of an Item.");
                break;
            case "4":
                System.out.println("4. Print mean grade of an Item");
                break;
            case "5":
                System.out.println("5. Print all comments of an Item.");
                break;
            case "6":
                System.out.println("6. Print all registered reviews.");
                break;
            case "7":
                System.out.println("7. Print item(s) with most reviews.");
                break;
            case "8":
                System.out.println("8. Print item(s) with least reviews.");
                break;
            case "9":
                System.out.println("9. Print item(s) with best mean review grade.");
                break;
            case "10":
                System.out.println("10. Print item(s) with worst mean review grade.");
                break;


            default:
                System.out.println("Invalid option. Going back to Main Menu... Please type in a valid option from 0-10.");
                new MainMenu().mainMenu();
                break;
        }
    }


    public static void ReviewMenu() {
    }
}



