package controllers;

import menus.MainMenu;

public class MainController {

    public MainController() {
        run();

    }
    public void run () {
        new MainMenu().mainMenu();
    }
}

