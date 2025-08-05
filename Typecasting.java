//converting a variable from one datatype to another is called Typecasting
public class Typecasting {

    //Typecasting is of 2 types
    public static void main(String[] args) {

        //Implicit casting
        short x=10;
        int y = x;
        System.out.println(y); //10

        //Explicit casting
        double d = 9.78;
        int num = (int) d;
        System.out.println(num); // 9 (decimal part lost)

    }
}
