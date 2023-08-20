package domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.*;

class JudgementTest {

    @Test
    void 숫자가_4이상인지_테스트() {
        int num1 = 6;
        int num2 = 1;
        assertTrue(Judgement.check4OrGreater(num1));
        assertFalse(Judgement.check4OrGreater(num2));
    }

    @Test
    void 경주게임이_끝났는지_테스트() {
        Coin coin = Coin.numberOf(1);
        assertFalse(Judgement.checkGameOver(coin));
        coin.spendCoin();
        assertTrue(Judgement.checkGameOver(coin));
    }

    @Test
    void 경주게임에서_가장_멀리_간_거리_반환테스트() {
        Cars cars = Cars.generateCars("pobi,crong,honux");
        for (String carName : cars.getCarNames()) {
            cars.getCar(carName).move();
        }
        cars.getCar("pobi").move();
        cars.getCar("pobi").move();
        assertEquals(4, Judgement.furthestDistance(cars));
    }
}