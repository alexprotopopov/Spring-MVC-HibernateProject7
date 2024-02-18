package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiseImpl implements CarService {
    private final List<Car> carList = new ArrayList<>();
    private static int CAR_COUNT;

    public CarServiseImpl() {
        carList.addAll(Arrays.asList(new Car(++CAR_COUNT, "Lada", "111", 150),
                new Car(++CAR_COUNT, "BMW", "222", 250),
                new Car(++CAR_COUNT, "LandRover", "333", 300),
                new Car(++CAR_COUNT, "Porsche", "444", 350),
                new Car(++CAR_COUNT, "Bugatti", "555", 400)));
    }

    public List<Car> listCars() {
        return carList;
    }

    @Override
    public List<Car> show(int count) {
        List<Car> carShow = new ArrayList<>();
        if ((count >= carList.size())) {
            carShow = carList;
        } else {
            for (int i = 0; i < count; i++) {
                carShow.add(carList.get(i));
            }
        }
        return carShow;
    }
}