public class Main {
    public static void main(String[] args) {

        String txt = "Please locate where \'locate\' occurs!";
        System.out.println(txt); //Outputs > Please locate where 'locate' occurs!
        System.out.println(txt.toUpperCase()); //Outputs > PLEASE LOCATE WHERE 'LOCATE' OCCURS!
        System.out.println(txt.toLowerCase()); //Outputs > please locate where 'locate' occurs!
        System.out.println(txt.length()); //Outputs > 36
        System.out.println(txt.indexOf("locate")); //Outputs > 7

        //you can also use the concat() method the concatenate two strings.
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));//Outputs > JohnDoe

        //if you add a number and string, the result will be a string concatenation
        String x = "10";
        int y = 20;
        String z = x+y;
        System.out.println(z);//Outputs > 1020

    }
}