package pojo;


import javax.annotation.PostConstruct;


public class Pickup extends Transport{


    public Pickup(String type) {
        super(type);
    }

    @Override
    @PostConstruct
    public void readiness() {
        System.out.println("Тип транспорта "+this.getType()+" готов к работе");
    }


}
