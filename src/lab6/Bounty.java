package lab6;

public class Bounty extends Mars{
    private int barNumber;
    public Bounty(int barNumber) {
        super("Bounty", 30, "milky");
        this.barNumber = barNumber;
        setWeight(barNumber * getWeight());
        setPrice(barNumber * getPrice());
    }

    @Override
    public String toString() {
        return super.toString() + ", barNumber=" + barNumber + '\'';
    }
}
