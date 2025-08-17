public class ElseIf {
    static void greatestOfNum(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is greatest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is greatest");
        } else {
            System.out.println(c + " is greatest");
        }
    }
    public static void main(String[] args) {
//        print greatest among 3 numbers:
        greatestOfNum(1,2,3);
    }
}
