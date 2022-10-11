package javaprogram0;
/*2. Write a Java programme using the following steps.
        2.1 Declare two static variables
        2.2 Declare one static method
        2.3 Call both static variables into the static method inside the print statement.
        2.4 Declare the Main method.
        2.5 Call the static method into the Main method and Run the programme.
        */

public class JavaCallingWork2 {
    //2.1
    static int x = 15;
    static int y = 20;

    //2.4 //2.5
    public static void main(String[] args) {
        bdd();
    }

    //2.2 //2.3
    public static void bdd() {
        System.out.println(x);
        System.out.println(y);


    }


}
