import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\MySamplesEE\\reading-File-Demo\\src\\scripts"));
            String line = null;
            while ((line = reader.readLine())!= null){
                System.out.println(line.toString());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
                System.out.println("Succesfully!!");
            }catch (Exception exception){
                System.out.println(exception);
            }
        }
    }
}