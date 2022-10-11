package javaprogram0;
/*. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/
public class JavaCallingWork3 {
    //3.1
    int x = 10;
    static int y = 15;
    //3.5 //3.6
    public static void main(String[] args) {
        JavaCallingWork3 abc = new JavaCallingWork3();
        abc.bdda();
        bddb();
    }
    //3.2 //3.4
    public void bdda() {
        System.out.println(x);
        System.out.println(y);
    }
    //3.3 //3.4
    public static void bddb() {
       JavaCallingWork3 abbdd = new JavaCallingWork3();
        System.out.println(abbdd.x);
        System.out.println(y);
    }
}
