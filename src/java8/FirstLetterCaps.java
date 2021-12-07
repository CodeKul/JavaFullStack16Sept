package java8;

import java.util.Locale;

public class FirstLetterCaps {
    public static void main(String[] args) {
        UpperCase upperCase = FirstLetterCaps::firstLetterUp;
        System.out.println(upperCase.display("seven"));
    }

    public static String firstLetterUp(String str){
        char[] chars = str.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }
}

interface UpperCase{
    String display(String str);
}