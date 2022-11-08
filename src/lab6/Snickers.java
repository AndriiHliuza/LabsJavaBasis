package lab6;

public class Snickers extends Mars{
    private int barNumber;
    public Snickers(int barNumber) {
        super("Snickers", 50, "black");
        this.barNumber = barNumber;
        setWeight(barNumber * getWeight());
        setPrice(barNumber * getPrice());
    }

    @Override
    public String toString() {
        return super.toString() + ", barNumber=" + barNumber + '\'';
    }
}
