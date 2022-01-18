package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.DAO.CarDAOlmpl;
import web.DAO.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServicelmpl implements CarService {
    private CarDao carDAO;


    @Autowired
    public void setCarDAO(CarDao carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDAO.getCars(count);
    }

}
