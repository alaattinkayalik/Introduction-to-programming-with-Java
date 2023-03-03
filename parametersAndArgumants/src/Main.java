public class Main {
    public static void main(String[] args) {

        //Information can be passed to methods as parameter. Parameters act as variables inside the method.
        myMethod("Jenny");  //Outputs > Jenny Refsnes


        //Multiple Parameters
        myMethod2("Jenny", 19); //Outputs > Jenny 19

        /*Return Values : The void keyword, used in the examples above, indicates that the method should not return a value.
        If you want the method to return a value,
        you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:*/
        System.out.println(values(5, 4)); //Outputs > 9

        //Instead of defining two methods that should do the same thing, it is better to overload one.
        //
        //In the example below, we overload the plusMethod method to work for both int and double:
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

    }

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }


    static void myMethod2(String fname, int age) {
        System.out.println(fname + " " + age);
    }

    static int values(int num1, int num2) {
        return num1 + num2;
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }
}