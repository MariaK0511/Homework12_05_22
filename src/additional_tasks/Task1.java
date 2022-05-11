package additional_tasks;

public class Task1 {
    public static void main(String[] args) {
        //1. Выведите на экран первые 11 членов последовательности Фибоначчи.
        int num0 = 0;
        int num1 = 1;
        for (int i = 1; i <= 11; i++) {
            System.out.print(num0 + " ");
            int sum = num0 + num1;
            num0 = num1;
            num1 = sum;
        }
    }
}
