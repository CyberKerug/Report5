package jp.ac.uryukyu.ie.e165735;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class StrError {
    public static void main(String[] args) {
        try {
            String str;
            str = "3．14";
            int l;
            l = str.length();
            System.out.println("strに格納されている文字は" + l + "文字です。");
            System.out.println("strに格納されている数値は"+Double.parseDouble(str)+"です");
        }catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生したため、\n strには何も格納されていません。");
            printStackTrace();
        }
    }
}