public class Main {


    //A constructor in Java is a special method that is used to initialize objects.
    // The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
    int modelYear;
    String modelName;

    public Main(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Main myCar = new Main(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

// Outputs 1969 Mustang