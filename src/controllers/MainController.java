package controllers;

import menus.MainMenu;

public class MainController {
    private final MainMenu mainMenu = new MainMenu();

    public MainController() {
        run();

    }
    public void run () {
        mainMenu.printMainMenu();
    }
}
