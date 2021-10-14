package menus;

import utilities.UserInput;

public class EmployeeMenu {
    public static final String EOL = System.lineSeparator();

    public void printEmployeeMenu() {
        System.out.print(
            "Menu: Please choose among the options below."      + EOL +
            EOL +
            "0. Return to Main Menu"                            + EOL +
            "1. Create an employee (Regular Employee)"          + EOL +
            "2. Create an employee (Manager)"                   + EOL +
            "3. Create an employee (Director)."                 + EOL +
            "4. Create an employee (Intern)."                   + EOL +
            "5. Remove an employee."                            + EOL +
            "6. Print specific employee."                       + EOL +
            "7. Print all registered employees."                + EOL +
            "8. Print the total expenses with net salary."      + EOL +
            "9. Print all employees sorted by gross salary."    + EOL +
            EOL +
            "Type an option number: "
        );

        String userInput = new UserInput().readString();
        switch (userInput){
            case "0": new MainMenu().mainMenu();                 break; //stops the switch statement from checking the other cases bellow

            default:
                System.out.println("Invalid option, going back to Main Menu... Please type in another option from 0-6");
                new menus.MainMenu().mainMenu();
                break;
        }
    }


}

