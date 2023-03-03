public class Main {
    int x = 5;

    public static void main(String[] args) {

        //Multiple Objects
        //You can create multiple objects of one class:
        
        Main myObj1 = new Main();  // Object 1
        Main myObj2 = new Main();  // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}