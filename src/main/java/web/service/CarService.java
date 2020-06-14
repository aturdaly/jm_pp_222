package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> listCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(111L, "Hundai", 111L));
        carList.add(new Car(222L, "Mazda", 222L));
        carList.add(new Car(333L, "Tayota", 333L));
        carList.add(new Car(444L, "Ford", 444L));
        return carList;
    }
}
