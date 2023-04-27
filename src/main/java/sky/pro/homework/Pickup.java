package sky.pro.homework;

import javax.annotation.PostConstruct;

public class Pickup extends Transport {

    @PostConstruct
    private void init(){
        System.out.println("Pickup is ready to work!");
    }

    @Override
    public String toString() {
        return "Pickup";
    }
}
