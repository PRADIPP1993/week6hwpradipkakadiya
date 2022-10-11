package javaprogram0;
/*15. Write a Java program to swap two variables.*/
public class SwapTwoVaribables15 {

    public static void main(String[] args) {
        int x = 15;
        int y = 25;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

