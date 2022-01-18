package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOlmpl implements CarDao {

    private static long CAR_COUNT;

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "Kalina", 666, 101));
        cars.add(new Car(++CAR_COUNT, "McLaren", 1, 1001));
        cars.add(new Car(++CAR_COUNT, "Kamaz", 606, 400));
        cars.add(new Car(++CAR_COUNT, "Grob na Koliosikah", 13, 1));
        cars.add(new Car(++CAR_COUNT, "Vedro", 1, 0));
    }
    @Override
    public List<Car> getCars(int count) { // count - кол-во возвращенных машин
        if (count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
