package ui;

import domain.Cars;

import java.util.List;

public class ResultView {
    public static void resultOutput(Cars cars) {
        StringBuilder sb = new StringBuilder();
        for (String name : cars.getCarNames()) {
            sb.append(name).append(" : ").append(cars.getCar(name).getMove()).append("\n");
        }
        System.out.println(sb);
    }

    public static void winner(List<String> winner) {
        StringBuilder sb = new StringBuilder();
        sb.append(winner.get(0));
        for (int i = 1; i < winner.size(); i++) {
            sb.append(", ").append(winner.get(i));
        }
        sb.append("가 최종 우승했습니다.");
        System.out.println(sb);
    }
}
