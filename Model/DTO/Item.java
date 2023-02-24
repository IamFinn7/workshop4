package Model.DTO;

import java.util.Scanner;

public class Item {
    private int value;
    private String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public void setInfo(Scanner sc) {
        System.out.println("Value: ");
        this.value = sc.nextInt();
        sc.nextLine();

        System.out.println("Creator: ");
        this.creator = sc.nextLine();

    }

    @Override
    public String toString() {
        return "Value = " + value + ", Creator = " + creator;
    }
}
