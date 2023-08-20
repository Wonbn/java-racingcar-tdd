package domain;

public class Car {
    private static final int NAME_MAX_LENGTH = 5;
    private final String name;
    private StringBuilder moveCount = new StringBuilder();
    private boolean win;

    private Car(String name) {
        this.name = name;
        this.moveCount.append("-");
        this.win = false;
    }

    public static Car withName(String name) {
        if (name.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름의 허용 범위인 5자를 초과하였습니다.");
        }
        return new Car(name);
    }

    public void move() {
        this.moveCount.append("-");
    }

    public String getName() {
        return name;
    }

    public String getMove() {
        return moveCount.toString();
    }

    public int getMoveCount() {
        return moveCount.length();
    }

    public void win() {
        this.win = true;
    }

    public boolean isWin() {
        return win;
    }
}