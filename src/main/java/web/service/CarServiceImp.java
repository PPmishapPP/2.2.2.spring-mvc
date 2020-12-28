package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarServiceImp implements CarService{

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Нива", "Белый", 100_000));
        cars.add(new Car("Мерседес", "Черный", 1_000_000));
        cars.add(new Car("Ауди", "Красный", 500_000));
        cars.add(new Car("Хонда", "Белый", 700_000));
        cars.add(new Car("Пятая", "Разноцветная", 2_000_000));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
