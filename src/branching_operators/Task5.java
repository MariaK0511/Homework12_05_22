package branching_operators;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        5. По введенному номеру определить цвет радуги (1 -красный, 4 - зеленый и т. д.).
         */
        Scanner scanner = new Scanner(System.in);
        int colour = scanner.nextInt();
        switch (colour) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Violet");
                break;
            case 7:
                System.out.println("Pink");
                break;
        }
    }
}
