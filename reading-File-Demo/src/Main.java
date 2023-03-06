import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\MySamplesEE\\reading-File-Demo\\src\\scripts"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
                System.out.println("Succesfully!!");
            }catch (Exception exception){
                System.out.println(exception);
            }
        }
    }
}