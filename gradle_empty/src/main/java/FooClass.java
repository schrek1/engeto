import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class FooClass {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Double> weightInKgFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Retrieving weight.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("weight completed");
            return 65.0;
        });

        CompletableFuture<Double> heightInCmFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Retrieving height.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("height completed");
            return 177.8;
        });

        CompletableFuture.allOf(heightInCmFuture, weightInKgFuture).join();

        Double weight = weightInKgFuture.get();
        Double height = heightInCmFuture.get();

        Double heightInMeter = height / 100;
        double bmi = weight / (heightInMeter * heightInMeter);

        System.out.println(bmi);
    }

}
