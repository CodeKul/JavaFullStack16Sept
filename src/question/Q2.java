package question;

public class Q2 {
    public static void main(String[] args) {

        int[] arr = {23, 5, 43, 45, 12, 3, 9, 54};//24
        boolean flag = false;
        int[] num = new int[3];
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + arr[i + 1] + arr[i + 2] == 24) {
                flag = true;
                num[0] = arr[i];
                num[1] = arr[i + 1];
                num[2] = arr[i + 2];
            }
        }
        System.out.println("Flag=> " + flag);

        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);
        }
    }
}
