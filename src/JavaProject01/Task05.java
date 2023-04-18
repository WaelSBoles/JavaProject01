package JavaProject01;

public class Task05 {
    /* 5. Write a program to swap 2 numbers without a
        temporary variable?
  */
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
    }
}

