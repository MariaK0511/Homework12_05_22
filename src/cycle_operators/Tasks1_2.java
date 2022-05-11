package cycle_operators;

public class Tasks1_2 {
    public static void main(String[] args) {
        /*
        1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        При решении используйте операцию инкремента (++).
         */
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        /*
        2. Необходимо вывести на экран числа от 5 до 1.
        При решении используйте операцию декремента (--).
         */
            for (int j = 5; j > 0; j--) {
                System.out.print(j);
            }
        }
    }
}
