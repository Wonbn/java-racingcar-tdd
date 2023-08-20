package controller;

import domain.*;
import ui.InputView;
import ui.ResultView;

public class RacingGameController {
    public static void playGame() {
        String inputNames = InputView.getCarNames();
        Cars cars = Cars.generateCars(inputNames);

        int inputCoins = InputView.getCoin();
        Coin coin = Coin.numberOf(inputCoins);

        while (!Judgement.checkGameOver(coin)) {
            coin.spendCoin();
            moveCars(cars);
            ResultView.resultOutput(cars);
        }

        int furthestDistance = Judgement.furthestDistance(cars);

        for (String name : cars.getCarNames()) {
            if (cars.getCar(name).getMoveCount() == furthestDistance) {
                cars.getCar(name).win();
            }
        }

        ResultView.winner(Judgement.whoIsWinner(cars));
    }

    private static void moveCars(Cars cars) {
        for (String name : cars.getCarNames()) {
            if (Judgement.check4OrGreater(RandomNumber.getRandomNumber())) {
                cars.getCar(name).move();
            }
        }
    }
}
