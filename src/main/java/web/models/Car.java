package web.models;

import java.util.Objects;

public class Car {

    private long id;
    private String model;
    private int numberOfModel;
    private int hp;
    public Car() {

    }
    public Car(long id, String model, int numberOfModel,int hp) {
        this.id = id;
        this.model = model;
        this.numberOfModel = numberOfModel;
        this.hp = hp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfModel() {
        return numberOfModel;
    }

    public void setNumberOfModel(int numberOfModel) {
        this.numberOfModel = numberOfModel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return id == car.id && numberOfModel == car.numberOfModel && hp == car.hp && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, numberOfModel, hp);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", numberOfModel=" + numberOfModel +
                ", hp=" + hp +
                '}';
    }
}
