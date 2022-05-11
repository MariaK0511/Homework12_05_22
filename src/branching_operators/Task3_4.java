package branching_operators;


import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        /*
        3. Напишите программу, которая будет принимать на вход число
         и на выход будет выводить сообщение четное число или нет.
         Для определения четности числа используйте операцию
         получения остатка от деления - операция выглядит так: "% 2").
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Четное число " + n);
        } else {
            System.out.println("Нечетное число " + n);

        }

        /*
        4. Для введенного числа t (температура на улице) вывести
           Если t>-5, то вывести «Тепло».
           Если -5>= t > -20, то вывести «Нормально».
           Если -20>= t, то вывести «Холодно».
         */
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if ((-5 >= t) && (t > -20)) {
            System.out.println("Нормально");
        } else if (-20 >= t) {
            System.out.println("Холодно");
        }
    }
}
