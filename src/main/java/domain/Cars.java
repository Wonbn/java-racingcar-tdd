package domain;

import java.util.*;

public class Cars {
    private Map<String, Car> cars;

    public Cars(Map<String, Car> cars) {
        this.cars = cars;
    }

    public static Cars generateCars(String input) {
        Map<String, Car> cars = new HashMap<>();
        String[] names = input.split(",");
        for (String name : names) {
            cars.put(name, Car.withName(name));
        }
        return new Cars(cars);
    }

    public List<String> getCarNames() {
        return new ArrayList<>(cars.keySet());
    }

    public Car getCar(String name) {
        return cars.get(name);
    }
}
