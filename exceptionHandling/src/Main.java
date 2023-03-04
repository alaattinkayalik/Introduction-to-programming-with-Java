public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[]{5,4,2};
            System.out.println("Selected array element : "+numbers[0]);
        }catch (Exception exception){
            System.out.println("Error !!");
        }
        finally {
            System.out.println("I always Work!!");
        }
    }
}