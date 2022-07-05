package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(2003, "BMW", "X3"));
        carList.add(new Car(2006, "BMW", "X4"));
        carList.add(new Car(2010, "BMW", "X5"));
        carList.add(new Car(2016, "BMW", "X6"));
        carList.add(new Car(2020, "BMW", "X7"));
    }

    public List<Car> getCarList() {
        return carList;
    }
    public List<Car> getCarsNumber(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
