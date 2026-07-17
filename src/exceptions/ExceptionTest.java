package exceptions;

class MyException extends Exception{

    MyException(String name){
        System.out.println(name);

    }

}


public class ExceptionTest {



    public static void main(String[] args) throws InterruptedException , NullPointerException, MyException{

        int a = 10;

        int b = 0;

        String str = null;

        try{
            System.out.println(str.length());
            Thread.sleep(2000);
            System.out.println(a/b);


        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("type2"+e.getMessage());

            throw new MyException("THIS IS A USER DEFINED EXCEPTION");

        } catch (Exception e){
            System.out.println("type"+ e.getMessage());
        }
        finally {
            System.out.println("exception occurred");
        }



    }
}


/*
Exception class extends Throwable class and Throwable class
implements java.io.Serializable
and Throwable class come from java.lang package

we can have one try and multiple catch block feasible solution, and we can have Multiple
try block but that's not feasible


                        object
                           |
                        Throwable

     Exception  (we can recover )                  Error( cant recover ex. memory space error)
                   programmatically
     checked and Unchecked                         Virtual machine error & Assertion error

examples of errors - device failure , network error , out of disk memory


Two types of Exception in Java

1 Checked Exception or Compile time exception -
compiler will force you to handle it ex. ClassNotFoundException , InterruptedException
IOException,FileNotFoundException, SQLException


2 Unchecked Exception or RunTimeException -
ex. - ArithmeticException , ClassCastException , NullPointerException ,
ArrayIndexOutOfBoundException , ArrayStoreException , IllegalThreadStateException
NumberFormatException

3 User Defined Exception


Stack Overflow error example :

main() calling f1() calling f2() and f2() calling f1() so in stack memory these calls
will make stack overflow

with infinite while loop we can have OutOfMemoryError


note : we cannot write catch block after finally
we cannot catch Exception e first and then lower hierarchy exception because it will show
exception already caught



 */
