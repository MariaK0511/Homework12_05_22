package branching_operators;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Написать программу для вывода названия поры года по номеру месяца.
        При решении используйте оператор if-else-if.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String MONTH = "";

        if (n == 1) MONTH = "January";
        else if (n == 2) MONTH = "February";
        else if (n == 3) MONTH = "March";
        else if (n == 4) MONTH = "April";
        else if (n == 5) MONTH = "May";
        else if (n == 6) MONTH = "June";
        else if (n == 7) MONTH = "July";
        else if (n == 8) MONTH = "August";
        else if (n == 9) MONTH = "September";
        else if (n == 10) MONTH = "October";
        else if (n == 11) MONTH = "November";
        else if (n == 12) MONTH = "December";
        System.out.println(MONTH);
    }
}

