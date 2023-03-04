public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[]{5,4,2};
            System.out.println("Selected array element : "+numbers[9]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (Exception exception){
            System.out.println("Error !!");
        }
        finally {
            System.out.println("I always Work!!");
        }
    }
}   