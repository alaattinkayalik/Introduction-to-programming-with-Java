public class Main {
    int x = 5;

    public static void main(String[] args) {

        //If you create multiple objects of one class, you can change the attribute values in one object,
        // without affecting the attribute values in the other:

        Main myObj1 = new Main();  // Object 1
        Main myObj2 = new Main();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25
    }
}