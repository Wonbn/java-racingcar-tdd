package domain;

import java.util.ArrayList;
import java.util.List;

public class Judgement {
    public static boolean check4OrGreater(int number) {
        return number >= 4;
    }

    public static boolean checkGameOver(Coin coin) {
        return coin.getCoin() == 0;
    }

    public static int furthestDistance(Cars cars) {
        int dist = 0;
        for (String name : cars.getCarNames()) {
            dist = Math.max(dist, cars.getCar(name).getMoveCount());
        }
        return dist;
    }

    public static List<String> whoIsWinner(Cars cars) {
        List<String> winner = new ArrayList<>();
        for (String name : cars.getCarNames()) {
            if (cars.getCar(name).isWin()) {
                winner.add(name);
            }
        }
        return winner;
    }
}
