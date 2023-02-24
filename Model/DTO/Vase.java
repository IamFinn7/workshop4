package Model.DTO;

import java.util.Scanner;

public class Vase extends Item {
    int height;
    String material;

    public Vase() {

    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public void setInfo(Scanner sc) {
        System.out.println("Height: ");
        this.height = sc.nextInt();
        sc.nextLine();

        System.out.println("Material: ");
        this.material = sc.nextLine();

    }

    @Override
    public String toString() {
        return super.toString() + ", Height = " + height + ", Material=" + material;
    }

}
