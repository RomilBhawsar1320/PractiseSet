package exceptions;

class BankException extends  Exception {
    BankException(String msg) {
        super(msg);
    }

    void f1() {
        f2();
    }

    void f2() {
        f1();


    }
}



public class CustomException {

    public static void main(String[] args)throws BankException{
        BankException bankException = new BankException("Bank Exception");

        try{
            bankException.f1();
            }
        catch (Exception e){
            System.out.println("trying for stack overflow ");
        }

        finally {
            System.out.println("our custom created ");
        }


        }

    }

