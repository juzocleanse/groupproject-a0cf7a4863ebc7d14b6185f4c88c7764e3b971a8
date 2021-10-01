package menus;

import Utilities.UserInput;

public class ItemMenu {private final UserInput userInput = new UserInput();

    public static void ItemMenu(){
        System.out.print(
                "\n\n"
                        + "Items options menu:\n"
                        + "\n"
                        + "0. Return to Main Menu.\n"
                        + "1. Create an Items.\n"
                        + "2. Remove an Item :(\n"
                        + "3. Print all registered Item's.\n"
                        + "4. Hire am Item ;)\n"
                        + "5. Update an Item's name.\n"
                        + "6. Update a Items's price.\n"
                        + "\n"
        );

        String userInput = UserInput.readInput();
        switch (userInput){
            case "0":
                System.out.println("Going back to Main Menu... Please type in another from 0-3 option");
                MainMenu.printMainMenu();

            case "1":
                System.out.println("Here are your item options...");
                //insert item option menu here

                break;

            case "2":
                System.out.println("Here are your review options");
                //insert review options here
                break;

            case "3":
                System.out.println("Here are your Transaction History options");
                //insert Transaction History options
                break;

            default:
                System.out.println("Going back to Main Menu... Please type in another option from 0-3");
                MainMenu.printMainMenu();
                break;
        }
    }
}


