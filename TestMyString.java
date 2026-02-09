
abstract class MyString {

    abstract int length(String s);

    abstract String reverse(String s);

    abstract boolean compare(String a, String b);

    abstract String toUpper(String s);
}

class MyStringImp extends MyString {

    int length(String s) {
        int count = 0;
        while (true) {
            try {
                s.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    String reverse(String s) {
        String rev = "";

        for (int i = length(s) - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    boolean compare(String a, String b) {

        if (length(a) != length(b)) {
            return false;
        }

        for (int i = 0; i < length(a); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    String toUpper(String s) {
        String result = "";

        for (int i = 0; i < length(s); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        return result;
    }
}

public class TestMyString {

    public static void main(String[] args) {

        MyString obj = new MyStringImp();

        System.out.println(obj.length("hello"));
        System.out.println(obj.reverse("hello"));
        System.out.println(obj.compare("hi", "hi"));
        System.out.println(obj.toUpper("hello"));
    }
}
