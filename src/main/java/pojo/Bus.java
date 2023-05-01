package pojo;


import javax.annotation.PostConstruct;


public class Bus extends Transport {


    public Bus(String type) {
        super(type);
    }

    @Override
    @PostConstruct
    public void readiness() {
        System.out.println("Тип транспорта " + this.getType() + " готов к работе");
    }


}
