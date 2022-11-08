package lab1;


/*
Виконав студент групи ІО-01 Глюза Андрій
Номер залікової книжки: 105
О1 = "-"
С = 0
O2 = "*"
Тип  індексів i та j: byte
 */

public class Main {
    public static void main(String[] args) {
        final byte a = 2;
        final byte n = 4;

        final byte b = 3;
        final byte m = 5;

        if (a > n) {
            System.out.println("'a' is less than 'n'");
            return;
        }
        if (b > m) {
            System.out.println("'b' is less than 'm'");
            return;
        }

        if (a <= 0 && n >= 0) {
            System.out.println("Division by zero");
            return;
        }

        byte result = 0;
        for (byte j = b; j <= m; j++) {
            result += j;
        }
        result *= (n-a+1);
        System.out.println("Result: " + result);
    }
}