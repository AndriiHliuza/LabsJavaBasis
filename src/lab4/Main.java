package lab4;

/*
C11 = 6 (Визначити клас косметика, який складається як мінімум з 5-и полів.)
 */

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Makeup[] makeupProducts = {
                new Makeup(80, 450, "Maybelline", "USA", "крем для рук"),
                new Makeup(82, 451, "Aaybelline", "USA", "крем для рук"),
                new Makeup(78, 440, "Baybelline", "USA", "крем для рук"),
                new Makeup(99, 499, "Yaybelline", "USA", "крем для рук")
        };
        Arrays.sort(makeupProducts, Comparator.comparing(Makeup::getPrice));
        for (int i = 0; i < makeupProducts.length; i++) {
            System.out.println((i + 1) + ") " + makeupProducts[i]);
        }

        System.out.println("----------------------------------------");

        Arrays.sort(makeupProducts, Comparator.comparing(Makeup::getBrand).reversed());
        for (int i = 0; i < makeupProducts.length; i++) {
            System.out.println(i + ") " + makeupProducts[i]);
        }

    }
}
