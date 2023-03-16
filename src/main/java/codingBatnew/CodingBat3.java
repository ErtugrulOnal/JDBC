package codingBatnew;

public class CodingBat3 {

    public static void main(String[] args) {


        System.out.println(close10(-12, -8));


    }

    public static int close10(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (Math.abs(10 - a) == Math.abs(10 - b)) {
            return 0;
        } else if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        }
        return b;
    }
}
