package cz.engeto.helloworld;

import java.util.List;

public class CarFinderService {
    public String findCarByName(String name) {
        try {
            Thread.sleep(500);
            return "Skoda";
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
