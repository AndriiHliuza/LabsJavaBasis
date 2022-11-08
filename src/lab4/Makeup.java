package lab4;

public class Makeup {
    private int daysToExpiration;
    private int price;
    private String brand;
    private String producerCountry;
    private String typeOfMakeup;

    public Makeup(int daysToExpiration, int price, String brand, String producerCountry, String typeOfMakeup) {
        this.daysToExpiration = daysToExpiration;
        this.price = price;
        this.brand = brand;
        this.producerCountry = producerCountry;
        this.typeOfMakeup = typeOfMakeup;
    }

    public int getDaysToExpiration() {
        return daysToExpiration;
    }

    public void setDaysToExpiration(int daysToExpiration) {
        this.daysToExpiration = daysToExpiration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public void setProducerCountry(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    public String getTypeOfMakeup() {
        return typeOfMakeup;
    }

    public void setTypeOfMakeup(String typeOfMakeup) {
        this.typeOfMakeup = typeOfMakeup;
    }

    @Override
    public String toString() {
        return "Makeup{" +
                "daysToExpiration=" + daysToExpiration +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", producerCountry='" + producerCountry + '\'' +
                ", typeOfMakeup='" + typeOfMakeup + '\'' +
                '}';
    }
}
