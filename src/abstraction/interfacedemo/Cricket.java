package abstraction.interfacedemo;

public class Cricket implements SportInterface{

    @Override
    public void play() {
        System.out.println("In Cricket play");
    }

    public static void main(String[] args) {

        SportInterface obj = new Cricket();
        obj.play();
    }

    @Override
    public void play1() {
        System.out.println("Play 1");
    }
}
