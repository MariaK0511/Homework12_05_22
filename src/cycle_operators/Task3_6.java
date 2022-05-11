package cycle_operators;

import java.util.Scanner;


public class Task3_6 {
    public static void main(String[] args) {
        /*
        3. Напишите программу, где пользователь вводит любое целое положительное число.
        А программа суммирует все числа от 1 до введенного пользователем числа.
        Для ввода числа воспользуйтесь классом Scanner.
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        /*
        4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98.
        В решении используйте цикл while.
         */
        int a = 7;
        while (a <= 97) {
            a = a + 7;
            System.out.println(a);
        }

        /*
        5. Вывести 10 первых чисел последовательности 0, -5,-10,-15…
         */
        for (int i = 0; i > -46; i = i - 5) {
            System.out.println(i);
        }

        /*
        6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
         */
        for (int i = 10; i <= 20; i++)
            System.out.println(i * i);
    }
}

