package Controller;

import java.util.Scanner;

import Model.DTO.*;

public class Controller {
    public static Scanner sc = new Scanner(System.in);

    public static Vase createVaseList() {
        Vase list = new Vase();
        list.setInfo(sc);
        return list;
    }

    public static Statue createStatueList() {
        Statue list = new Statue();
        list.setInfo(sc);
        return list;
    }

    public static Painting createPaintingList() {
        Painting list = new Painting();
        list.setInfo(sc);
        return list;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
