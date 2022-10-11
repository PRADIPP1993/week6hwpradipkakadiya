package javaprogram0;
/*  Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme. */

public class JavaCallingWork1 {
    //1.1
    int p = 10;
    int q = 28;

    //1.4 //1.5
    public static void main(String[] args) {
        JavaCallingWork1 xyz = new JavaCallingWork1();
        xyz.myMethod1();

    }

    //1.2 //1.3
    public void myMethod1() {
        System.out.println(p);
        System.out.println(q);
    }

}

