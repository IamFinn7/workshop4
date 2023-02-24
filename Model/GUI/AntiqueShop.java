package Model.GUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.DTO.*;
import Controller.*;

public class AntiqueShop {
    public static List<Vase> vaseList = new ArrayList<Vase>();
    public static List<Statue> statueList = new ArrayList<Statue>();
    public static List<Painting> paintingList = new ArrayList<Painting>();

    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.println("Input a choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    item = new Vase();
                    vaseList.add(Controller.createVaseList());
                    System.out.println();
                    break;

                case 2:
                    statueList.add(Controller.createStatueList());
                    System.out.println();
                    break;

                case 3:
                    paintingList.add(Controller.createPaintingList());
                    System.out.println();
                    break;

                case 4:
                    if (item != null) {

                        if (item instanceof Vase)
                            ((Vase) item).outputVase();
                        else if (item instanceof Statue)
                            ((Statue) item).outputStatue();
                        else if (item instanceof Painting)
                            ((Painting) item).outputPainting();
                    } else
                        System.out.println(" You need to create an object");
                    break;
            }
        } while (choice <= 4);
    }
}
