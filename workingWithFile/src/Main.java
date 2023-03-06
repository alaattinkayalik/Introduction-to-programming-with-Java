import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\MySamplesEE\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu.");
            } else {
                System.out.println("Dosya zaten Mevcut.");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\MySamplesEE\\files\\students.txt");
        if (file.exists()) {
            System.out.println("Dosya Adı : " + file.getName());
            System.out.println("Dosya Yolu : " + file.getAbsoluteFile());
            System.out.println("Dosya Yazılabilir mi? : " + file.canWrite());
            System.out.println("Dosya Okunabilir mi? : " + file.canRead());
            System.out.println("Dosya Boyut : "+file.length());
        }
    }

    public static void readFile(){
        File file = new File("C:\\MySamplesEE\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\MySamplesEE\\files\\students.txt",true));
            bufferedWriter.newLine();
            bufferedWriter.write("Merhaba");
            System.out.println("Dosyaya Yazıldı");
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}