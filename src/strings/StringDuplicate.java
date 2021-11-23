package strings;

public class StringDuplicate {
    public static void main(String[] args) {

        String str = "abcedb";
        StringBuffer stringBuffer =  new StringBuffer(str);

        for(int i=0;i< stringBuffer.length();i++){
            for(int j=i+1;j<stringBuffer.length();j++){
                if(stringBuffer.charAt(i)==stringBuffer.charAt(j)){
                    stringBuffer.deleteCharAt(i);
                }
            }
        }
        System.out.println(stringBuffer);
    }
}
