package week4;

public class NumberStatistics {
    private int amountOfNumbers;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }
}
