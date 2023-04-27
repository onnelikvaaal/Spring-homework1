package sky.pro.homework;

import javax.annotation.PostConstruct;

public class Car extends Transport {

    @PostConstruct
    private void init(){
        System.out.println("Car is ready to work!");
    }

    @Override
    public String toString() {
        return "Car";
    }
}
