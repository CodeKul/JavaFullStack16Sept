package exceptionhandling;

import java.sql.SQLException;
import java.time.LocalDate;

public class ThrowKeyword {

    public static void main(String[] args) throws MyException {
        int age =17;
        if(age<18){
            throw new MyException("you can not vote");
        }else {
           throw new ArithmeticException("Data");
        }
    }
}

class MyException extends Exception {

    public MyException(String msg){
        super(msg);
    }
}
/**
 *          Throw                                          throws
 *  1. throw is used to throw exception explicitly  1.throws is used  to declare exception
 *
 *  2.throw is used within method                   2.throws is used with method signature
 *
 *  3.you can throw only  one exception at a time   3.you can declare multiple exception
 *
 *  4.throw is followed by instance of exception   4.throws is followed by class of exception
 */