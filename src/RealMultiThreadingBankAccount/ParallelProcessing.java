package RealMultiThreadingBankAccount;

class DepositThread implements Runnable{

    private JointAccount jointAccount;


    public DepositThread(JointAccount jointAccount) {
        this.jointAccount = jointAccount;
    }


    @Override
    public void run() {
        for(int i=0; i<=100000 ; i++){
            jointAccount.deposit(100);
        }

    }
}

class WithdrawThread implements Runnable{

    private JointAccount jointAccount;

    public  WithdrawThread(JointAccount jointAccount){
        this.jointAccount = jointAccount;
    }
    @Override
    public void run() {
        for(int i=0; i<=100000 ; i++){
            jointAccount.withdraw(100);
        }

    }
}

public class ParallelProcessing {
    public static void main(String[] args) {
        JointAccount j1 = new JointAccount(10);

        Thread t1 = new Thread(new DepositThread(j1));
        t1.start();
        Thread t2 = new Thread(new WithdrawThread(j1));
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(j1.getBalance());


    }
}
