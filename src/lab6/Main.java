package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Candy[] sweetsBasket = {
                new Snickers(2),
                new Bounty(3),
                new Mars("Mars", 45, "black"),
                new Milka("Soft & Choc", 20, "black"),
                new Candy("Romashka", 35, 20, 10, "Ukraine", "black")
        };
        System.out.println("---------------Candies in basket------------------");
        print(sweetsBasket);

        System.out.println("---------------Weight of all candies in the basket------------------> " + Candy.getWeightOfAllCandies(sweetsBasket));

        System.out.println("---------------Sorted candies in basket (price)------------------");
        Arrays.sort(sweetsBasket);
        print(sweetsBasket);
        
        System.out.println("---------------Enter range of chocolate percentage in candy------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("From: ");
        int beginChocolatePercentageLimit = scanner.nextInt();
        System.out.print("To: ");
        int endChocolatePercentageLimit = scanner.nextInt();
        System.out.println("Candies with chocolate range from " + beginChocolatePercentageLimit + " to " + endChocolatePercentageLimit);
        ArrayList<Candy> sweets = Candy.getCandiesWithCertainPercentOfChocolate(sweetsBasket, beginChocolatePercentageLimit, endChocolatePercentageLimit);
        for (Candy candy : sweets) {
            System.out.println(candy);
        }
    }

    public static void print(Candy[] candies) {
        for (int i = 0; i < candies.length; i++) {
            System.out.println(candies[i]);
        }
    }
}
