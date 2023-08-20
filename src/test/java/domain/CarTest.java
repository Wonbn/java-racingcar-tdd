package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 자동차_이름_5자_초과_예외테스트() {
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            Car.withName("123456");
        });
        assertEquals("자동차 이름의 허용 범위인 5자를 초과하였습니다.", exception.getMessage());
    }

    @Test
    void 자동차_생성_테스트() {
        Car testCar = Car.withName("test");
        assertThat(testCar).isInstanceOf(Car.class);
        assertThat(testCar.getName()).isSameAs("test");
        assertThat(testCar.getMove()).isEqualTo(0);
    }

    @Test
    void 전진횟수_증가_테스트() {
        Car testCar = Car.withName("test");
        testCar.move();
        testCar.move();
        assertThat(testCar.getMove()).isEqualTo(2);
    }
}