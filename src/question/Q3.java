package question;

public class Q3 {
    public static void main(String[] args) {

        int m = 17;
        int n = 3;

        int closest = ((m / n) * n);//15
        int secClosest = (((m / n) + 1) * n);//18

        if ((m - closest) > (secClosest - m)) {
            System.out.println(secClosest);
        } else {
            System.out.println(closest);
        }
    }
}
