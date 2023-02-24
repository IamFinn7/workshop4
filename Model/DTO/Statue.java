package Model.DTO;

import java.util.Scanner;

public class Statue extends Item {
    int weight;
    String colour;

    public Statue() {

    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public void setInfo(Scanner sc) {
        System.out.println("Weight: ");
        this.weight = sc.nextInt();
        sc.nextLine();

        System.out.println("Colour: ");
        this.colour = sc.nextLine();

    }

    @Override
    public String toString() {
        return super.toString() + "Weight = " + weight + ", Colour = " + colour;
    }

    public void inputStatue() {
    }

    public void outputStatue() {
    }

}
