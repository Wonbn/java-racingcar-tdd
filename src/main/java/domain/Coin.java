package domain;

public class Coin {
    private int number;

    private Coin(int number) {
        this.number = number;
    }

    public static Coin numberOf(int number) {
        return new Coin(number);
    }

    public void spendCoin() {
        this.number--;
    }

    public int getCoin() {
        return this.number;
    }
}
