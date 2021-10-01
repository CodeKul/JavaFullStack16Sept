package package1;

public class Test {

    protected int i =9;

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.i);
    }
}

/**
 * private => it is accessible within class only
 * public => it is accessible in whole project
 * protected => accessible in package and through inheritance outside the package
 * default => accessible in package,default is
 */