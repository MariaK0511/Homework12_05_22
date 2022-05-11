package additional_tasks;

public class Task3 {
    public static void main(String[] args) {
        //3. Напишите программу, которая выводит на консоль таблицу умножения.
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + j + "  ");
            }
            System.out.println();
        }
    }
}
