//In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
//
//To access the inner class, create an object of the outer class, and then create an object of the inner class:

class OuterClass {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}

// Outputs 10