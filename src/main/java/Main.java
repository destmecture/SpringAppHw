import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.*;

public class Main {
    public static AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    public static void main(String[] args) {

        Driver driver1 = context.getBean("carDriver", Driver.class);
        Driver driver2 = context.getBean("busDriver", Driver.class);
        Driver driver3 = context.getBean("pickupDriver", Driver.class);



        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);
    }
}
