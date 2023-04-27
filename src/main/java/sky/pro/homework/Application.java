package sky.pro.homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println();

        Driver carDriver = context.getBean("carDriver", Driver.class);
        System.out.println(carDriver);

        Driver busDriver = context.getBean("busDriver", Driver.class);
        System.out.println(busDriver);

        Driver pickupDriver = context.getBean("pickupDriver", Driver.class);
        System.out.println(pickupDriver);

        context.close();
    }
}
