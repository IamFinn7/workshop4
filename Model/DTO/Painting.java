package Model.DTO;

import java.util.Scanner;

public class Painting extends Item {
    int height, width;
    boolean isWatercolour, isFramed;

    public Painting() {

    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public void setInfo(Scanner sc) {
        System.out.println("Height: ");
        this.height = sc.nextInt();
        sc.nextLine();

        System.out.println("Width: ");
        this.width = sc.nextInt();
        sc.nextLine();

        System.out.println("Water: ");
        this.isWatercolour = sc.nextBoolean();
        sc.nextLine();

        System.out.println("Frame: ");
        this.isFramed = sc.nextBoolean();
        sc.nextLine();

    }

    @Override
    public String toString() {
        return super.toString() + ", Height = " + height + ", Width = " + width + ", isWatercolour = " + isWatercolour
                + ", is Framed = " + isFramed;
    }

    public void inputPainting() {
    }

    public void outputPainting() {
    }

}
