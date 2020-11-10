package cz.engeto.simple_calculator;

import java.util.List;


interface Vehicle {
    void start();

    void stop();

    default void blowHorn() {
        System.out.println("Blowing horn");
    }
}

interface BigLoadable {
    int loadCargo(int weight);

    int unloadCargo(int weight);

    int getActualCargoWeight();
}

class Mincooper implements Vehicle {

    public void start() {
        System.out.println("starting engine...");
    }

    public void stop() {
        System.out.println("stopping engine...");
    }

}

class MonsterTruck implements Vehicle, BigLoadable {

    private int actualCargoWeight = 0;

    public void start() {
        System.out.println("starting truck engine...");
    }

    public void stop() {
        System.out.println("stopping truck engine...");
    }

    @Override
    public int loadCargo(int weight) {
        actualCargoWeight = actualCargoWeight + weight;
        return actualCargoWeight;
    }

    @Override
    public int unloadCargo(int weight) {
        if (weight > actualCargoWeight) throw new RuntimeException("Bad weight for unload");
        actualCargoWeight = actualCargoWeight - weight;
        return actualCargoWeight;
    }

    @Override
    public int getActualCargoWeight() {
        return actualCargoWeight;
    }

    private void writeToDb(int weight) {

    }
}

class Main {
    public static void main(String[] args) {
        Mincooper mini = new Mincooper();
        MonsterTruck monster = new MonsterTruck();

        Vehicle[] garage = {mini, monster};

        for (Vehicle vehicle : garage) {
            vehicle.start();
            if (vehicle instanceof BigLoadable) {
                BigLoadable loadable = (BigLoadable) vehicle;
                loadable.loadCargo(200);
                System.out.println(loadable.getActualCargoWeight());
            }

        }

    }
}
