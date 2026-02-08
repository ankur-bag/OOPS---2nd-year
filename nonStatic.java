
import java.util.*;

class nonStatic {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value");
        double n = sc.nextDouble(); //123.456
        String s = Double.toString(n);
        int idx = s.indexOf('.');
        String decimalPart = s.substring(idx + 1);
        int dec = Integer.parseInt(decimalPart); //456
        int intPart = (int) n; //123
        nonStatic obj = new nonStatic();
        obj.sumOfInt(intPart);

        obj.sumOfDecimal(dec);

    }

    void sumOfInt(int n) {
        int sum, digit;
        sum = 0;
        while (n > 0) {
            digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println("summation of integer part is : " + sum);
    }

    void sumOfDecimal(int n) {
        int sum, digit;
        sum = 0;
        while (n > 0) {
            digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println("summation of decimal part is : " + sum);
    }
}
