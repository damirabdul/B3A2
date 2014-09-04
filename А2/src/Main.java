import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static int convert(char c) {
        if((int) c >96) {
            return (int) c - 87;
        } else {
            return Character.getNumericValue(c);
        }
    }

    public static char anotherconvert(int a) {
        return (char)(a+87);
    }

    public static String add(String s1, String s2,int k) {
        String first = new StringBuilder(s1).reverse().toString();
        String second = new StringBuilder(s2).reverse().toString();
        String result = "";
        int ost = 0;
        int one,two,res,zap;
        if(first.length() > second.length()) {
            for(int i = 0; i < second.length(); i++) {
                one = convert(first.charAt(i));
                two = convert(second.charAt(i));
                res = one + two + ost;
                zap = res%k;
                if(zap > 9) {
                    result += anotherconvert(zap);
                } else {
                    result += zap;
                }
                ost = res/k;
            }
            for(int i = second.length(); i < first.length(); i++) {
                result += first.charAt(i);
            }
        } else {
            for(int i = 0; i < first.length(); i++) {
                one = convert(first.charAt(i));
                two = convert(second.charAt(i));
                res = one + two + ost;
                zap = res%k;
                if(zap > 9) {
                    result += anotherconvert(zap);
                } else {
                    result += zap;
                }
                ost = res/k;
            }
            for(int i = first.length(); i < second.length(); i++) {
                result += second.charAt(i);
            }
        }
        return new StringBuilder(result).reverse().toString();
    }

    public static int fromKSystem(String number, int k) {

        String value = number;
        int result = 0;
        for (int i = 0; i < value.length(); i++) {

            int a;
            char c = value.charAt(value.length() - i - 1);
            if (c >= 'a' && c <= 'z')
                a = (c - 'a') + 10;
            else
                a = c - '0';

            result += a * (int) Math.pow(1.0 * k, (double) i);
        }

        return result;
    }

    public static String toKSystem(int number, int k) {
        int value = number;

        String result = "";

        while (value != 0) {

            int p = value / k;
            int q = value % k;

            if (q > 9) {
                char c = (char) ((q - 10) + (int) 'A');
                result = c + result;
            } else
                result = q + result;
            value = p;
        }

        return result;
    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner s1 = new Scanner(new File("in"));
        int ss = s1.nextLine().charAt(0);
        if (ss > 96) {
            ss -= 87;
        } else {
            ss -= 48;
        }
        String first = s1.nextLine();
        String second = s1.nextLine();
//        System.out.println(add(first,second,ss));
//        System.out.println(ss);
//        System.out.println(first);
//        System.out.println(second);
        System.out.println(toKSystem(fromKSystem(first, ss) + fromKSystem(second, ss), ss));
//        System.out.println("test = "+multiplyToDigit("123456123",7,8));
        s1.close();
    }
}
