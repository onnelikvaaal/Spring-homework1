package sky.pro.homework;

import javax.annotation.PostConstruct;

public class Bus extends Transport {

    @PostConstruct
    private void init(){
        System.out.println("Bus is ready to work!");
    }

    @Override
    public String toString() {
        return "Bus";
    }
}
