package com.example.tarea2;

import java.util.ArrayList;

public class menuCreator {
    MenuSelector selectorMenu;
    public menuCreator(MenuSelector selectorMenu) {
        this.selectorMenu = selectorMenu;
    }
    public ArrayList<String> getMenuOptionA() {
        return selectorMenu.getMenuOptionA();
}
    public ArrayList<String> getMenuOptionB() {
        return selectorMenu.getMenuOptionB();
    }
    public ArrayList<String> getMenuOptionC() {
        return selectorMenu.getMenuOptionC();
    }
    public ArrayList<String> getMenuOptionD() {
        return selectorMenu.getMenuOptionD();
    }
    }
