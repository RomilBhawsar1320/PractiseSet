package multithreading;

import java.util.concurrent.CompletableFuture;

public class DashboardExercise {

    public static String getUser() {
        sleep(2000);
        return "Romil";
    }

    public static Integer getOrders() {
        sleep(3000);
        return 15;
    }

    public static Double getPayments() {
        sleep(1000);
        return 25000.0;
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        // TODO 1: Create userFuture
        CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(DashboardExercise::getUser);


        // TODO 2: Create orderFuture
        CompletableFuture<Integer> orderFuture = CompletableFuture.supplyAsync(DashboardExercise::getOrders);
        // TODO 3: Create paymentFuture
        CompletableFuture<Double> paymentFuture = CompletableFuture.supplyAsync(DashboardExercise::getPayments);
        // TODO 4: Wait for all futures
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(
                userFuture,
                orderFuture,
                paymentFuture
        );

        allFutures.join();

        // TODO 5: Print final dashboard

        System.out.println("Dashboard:");
        System.out.println("User = " + userFuture.join());
        System.out.println("Orders = " + orderFuture.join());
        System.out.println("Payments = " + paymentFuture.join());

        long end = System.currentTimeMillis();

        System.out.println(
                "Time Taken = " + (end - start) + " ms");
    }
}