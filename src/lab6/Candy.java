package lab6;

import java.util.ArrayList;

public class Candy implements Comparable<Candy>{
    private String name;
    private int chocolatePercentage;
    private int weight;
    private int price;
    private String countryProducer;
    private String chocolateType;

    public Candy(String name, int chocolatePercentage, int weight, int price, String countryProducer, String chocolateType) {
        this.name = name;
        this.chocolatePercentage = chocolatePercentage;
        this.weight = weight;
        this.price = price;
        this.countryProducer = countryProducer;
        this.chocolateType = chocolateType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChocolatePercentage() {
        return chocolatePercentage;
    }

    public void setChocolatePercentage(int chocolatePercentage) {
        this.chocolatePercentage = chocolatePercentage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCountryProducer() {
        return countryProducer;
    }

    public void setCountryProducer(String countryProducer) {
        this.countryProducer = countryProducer;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public String toString() {
        return "Candy: " +
                "name='" + name + '\'' +
                ", chocolatePercentage=" + chocolatePercentage +
                ", weight=" + weight +
                ", price=" + price +
                ", countryProducer='" + countryProducer + '\'' +
                ", chocolateType='" + chocolateType + '\'';
    }

    @Override
    public int compareTo(Candy o) {
        return price - o.price;
    }

    public static int getWeightOfAllCandies(Candy[] candies) {
        int weight = 0;
        for (int i = 0; i < candies.length; i++) {
            weight += candies[i].getWeight();
        }
        return weight;
    }

    public static ArrayList<Candy> getCandiesWithCertainPercentOfChocolate(Candy[] candies, int startLimit, int endLimit) {
        ArrayList<Candy> sweets = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i].getChocolatePercentage() >= startLimit && candies[i].getChocolatePercentage() <= endLimit) {
                sweets.add(candies[i]);
            }
        }
        return sweets;
    }
}
