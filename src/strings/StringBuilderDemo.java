package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {

        String  str = new String("Pune");
        str.concat("City");
        System.out.println(str);

        StringBuffer stringBuffer = new StringBuffer("Pune");
        stringBuffer.append("City");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Pune");
        stringBuilder.append("City");
        System.out.println(stringBuilder);




    }
}
