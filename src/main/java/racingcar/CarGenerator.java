package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarGenerator {
    public List<String> splitNames(String names) {
        String[] splitNames = names.split(",");
        return new ArrayList<>(Arrays.asList(splitNames));
    }

    public List<Car> createCars(List<String> nameList) {
        return null;
    }
}
