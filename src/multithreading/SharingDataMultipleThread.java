package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task: "+ taskName+ "is running on thread "+Thread.currentThread().getName());

    }
}


public class SharingDataMultipleThread {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println(cores);

        for (int i =0 ; i<20 ;i++){
            executorService.submit(new Task("task "+i+" "));
            executorService1.submit(new Task("taskUS "+i+" "));
        }

        executorService.shutdown();
        executorService1.shutdown();



    }
}
