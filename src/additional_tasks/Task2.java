package additional_tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
        А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
        Для вычисления суммы с учетом процентов используйте цикл for.
        Пусть сумма вклада будет представлять тип float.
         */
        Scanner scanner = new Scanner(System.in);
        float sum = scanner.nextFloat();
        int month = scanner.nextInt();
        for (float i = 1; i <= month; i++) {
            sum += sum * 0.07;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", month, sum);
    }
}
