package virtualthread;

public class VirtualThreadExample {
    public static void main(String[] args) throws InterruptedException {

        for(int i=0;i<=10000;i++) {
            Thread t1 = Thread.ofVirtual().start(() -> System.out.println("I am a virtual Thread" + Thread.currentThread()));
            t1.join();
        }
        Thread t2 = Thread.ofPlatform().start(() -> System.out.println("I am a Platform Thread"+Thread.currentThread()));
        t2.join();
    }
}
/*
if you want to want to use virtual threads in Spring boot app
add this property in your application.properties file

spring.threads.virtual.enabled=true
by default it is false
 */