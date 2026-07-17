package multithreading;

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i =0 ; i<=50 ; i++){
            if(i%2==0){
                System.out.println("even number :"+ i);
            }
        }
    }

}

/*class StudentMarkProcessor extends Students, Thread not possible in java because java doesnot support
multiple Inheritance
but it is Possible like this StudenMarkProcessor extends Student implements Runnable
if Thread.start() is calling run method then why are we not using Thread.run() becaus eof the lifecycle of
Thread if we directly call the run method it won't start the thread rather it would treat it as a normal
object method call. whenever you implement Thread Override the run method but to use it call start() method
 */

class CustomThread implements Runnable{

    @Override
    public void run() {
        for (int i =0 ; i<=50 ; i++){
            if(i%3==0){
                System.out.println("divisible by 3  :"+ i);
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {

        //2 ways to create threads
        //1 extending Thread class
        MyThread t1 = new MyThread();
        t1.start();//asking the thread to run his code
        //2 Implementing runnable Interface
        CustomThread t2 = new CustomThread();
        Thread t3 = new Thread(t2);
        t3.start();

        //as Runnable is a Functional Interface we can use lambda
        Thread newThread = new Thread(() -> {
            for(int i=0; i<=10;i++){
                if(i%5==0){
                    System.out.println("divisile by 5: "+i);
                }
            }
        });
        newThread.start();


        // why anonymous result due to thread scheduling concept of OS ( which algo Round Robin algo)
        // we cant predict the output as of now due to parallel processing
        // which thread will get the time first we dont know if we dont know which algo used by cpu for scheduling


    }

}
