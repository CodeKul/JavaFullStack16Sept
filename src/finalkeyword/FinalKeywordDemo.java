package finalkeyword;

import statickeyword.StaticKeywordDemo;

/**
 * final variable => you can not reassign the value to final variable
 * final method => you can not override the method
 * final class => you can not inherit the class
 */
public  class FinalKeywordDemo {

    final int i=90;

    public  void display(){

//        i =56;
    }

    public static void main(String[] args) {
        FinalKeywordDemo obj = new FinalKeywordDemo();
        obj.display();
        System.out.println(obj.i);

        StaticKeywordDemo.show();
    }
}

class FinalOver extends FinalKeywordDemo{

    @Override
    public final void display() {

    }
}
