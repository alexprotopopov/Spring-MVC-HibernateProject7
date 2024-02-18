package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> listCars();

    List<Car> show(int count);
}
