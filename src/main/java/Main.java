public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String out = "";
            out = fizzbuzz(i, out);
            System.out.println(out);
        }
    }

    static String fizzbuzz(int i, String out) {
        f
        if (i % 3 == 0) {
            out += "fizz";
        }
        if (i % 5 == 0) {
            out += "buzz";
        }

        if (i % 3 != 0 && i % 5 != 0) {
            out += i;
        }
        return out;
    }
}

class TestMain extends Main {
    public static void sub() {
        System.out.println("Hello Git!");
    }
}
