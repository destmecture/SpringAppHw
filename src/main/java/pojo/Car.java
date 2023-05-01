package pojo;


import javax.annotation.PostConstruct;


public class Car extends Transport {


    public Car(String type) {
        super(type);
    }

    @Override
    @PostConstruct
    public void readiness() {
        System.out.println("Тип транспорта " + this.getType() + " готов к работе");
    }
}
