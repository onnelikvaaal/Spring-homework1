package sky.pro.homework;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("sky.pro.homework")
public class AppConfig {


    @Bean(name = "car")
    public Car getCarBean() {
        return new Car();
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus();
    }

    @Bean(name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup();
    }

    @Bean(name = "carDriver")
    public Driver getCarDriver(@Qualifier("car") Transport transport) {
        return new Driver("carDriver", transport);
    }

    @Bean(name = "busDriver")
    public Driver getBusDriver(@Qualifier("bus") Transport transport) {
        return new Driver("busDriver", transport);
    }

    @Bean(name = "pickupDriver")
    public Driver getPickupDriver(@Qualifier("pickup") Transport transport) {
        return new Driver("pickupDriver", transport);
    }
}
