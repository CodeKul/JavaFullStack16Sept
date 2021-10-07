package exceptionhandling;

public class StackOverFlowError {

    public static void main(String[] args) {
        StackOverFlowError obj = new StackOverFlowError();
        obj.recursion(12);
    }

    public void recursion(int i) {
        System.out.println("num=>" + i);
        if (i == 0) {
            return;
        } else {
            recursion(i);
        }
    }
}
