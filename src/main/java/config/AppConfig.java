package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pojo.Bus;
import pojo.Car;
import pojo.Driver;
import pojo.Pickup;

@Configuration
@ComponentScan("pojo")
public class AppConfig {
    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("Машина");
    }
    @Bean(name ="bus")
    public Bus getBusBean() {
        return new Bus("Автобус");
    }
    @Bean(name ="pickup")
    public Pickup getPickupBean(){
        return new Pickup("Пикап");
    }




    @Bean(name = "busDriver")
    public Driver getBusDriverBean(){
        return new Driver(getBusBean(), "Иван");
    }

    @Bean(name = "carDriver")
    public Driver getCarDriverBean(){
        return new Driver(getCarBean(), "Олег");
    }

    @Bean(name = "pickupDriver")
    public Driver getPickupDriverBean(){
        return new Driver(getPickupBean(), "Николай");
    }

}