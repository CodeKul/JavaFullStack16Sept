package strings;

public class StringDemo extends Object {
    public static void main(String[] args) {
        char[] arr = {'M', 'U', 'M', 'B', 'A', 'I'};

//        String str2 = new String(arr);

        String str = "Pune";//2
        String str1 = "Pune";//0
        String str2 = "Pune.";//0
        String str3 = "Pune";//1
        String str4 = "Pune";//1

        String str6 = str1.concat("City");
        System.out.println();
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());


//        System.out.println(str==str1);//false //reference
//
//        System.out.println(str.equalsIgnoreCase(str1));//true  //content
//
    }
}
