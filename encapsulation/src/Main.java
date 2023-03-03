public class Main {
    public static void main(String[] args) {

        //The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
        //
        //declare class variables/attributes as private
        //provide public get and set methods to access and update the value of a private variable

        Person myObj = new Person();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}