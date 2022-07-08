package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class ShowGetCars {
    List<Car> listCar;

    {
        listCar = new ArrayList<Car>();
        listCar.add(new Car("autoBrand_1", "carModel_1", 2017));
        listCar.add(new Car("autoBrand_2", "carModel_2", 2018));
        listCar.add(new Car("autoBrand_3", "carModel_3", 2019));
        listCar.add(new Car("autoBrand_4", "carModel_4", 2020));
        listCar.add(new Car("autoBrand_5", "carModel_5", 2021));
    }

    public List<Car> getAllCar() {
        return listCar;
    }

    public List<Car> getCarInterval(int a){
        List<Car> listCarInterval = new ArrayList<>();
        for(int i = 0 ; i <a; i++ ){
            listCarInterval.add(listCar.get(i));
        }
        return listCarInterval;
    }


}
