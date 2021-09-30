package menus;

import Utilities.UserInput;

import javax.swing.text.Utilities;

public class MainMenu {

    private final UserInput userInput = new UserInput();

    public static void printMainMenu(){
        System.out.println ("Main Menu: Please choose among the options below.\n" +
        "\n" +
        "0. Close system.\n" +
        "1. Open Item options.\n" +
        "2. Open Review options.\n" +
        "3. Open Transaction History options. \n" +
        "\n" +
        "Type an option number: \n" );

        String userInput = UserInput.readInput();
        switch (userInput){
            case "0":
                System.exit(404);
                break; //stops the switch statement from checking the other cases bellow

            case "1":
                System.out.println("Here are your item options...");
                ItemMenu.ItemMenu();

                break;

            case "2":
                System.out.println("Here are your review options");
                ReviewMenu.Reviewmenu();
                break;

            case "3":
                System.out.println("Here are your Transaction History options");
                //insert Transaction History options
                break;

            default:
                System.out.println("Going back to Main Menu... Please type in another from 0-3 option");
                printMainMenu();
                break;
        }
    }
}

//Items menu

