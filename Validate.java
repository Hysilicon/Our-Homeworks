package lab10;

public class Validate {

    public static boolean validateString(String input) {

        String name = "Chenhao.Lu";

        String student_id = "1824173";

        // Your code here
        try{
        int x =Integer.parseInt(input.substring(15,19));
        }catch(NumberFormatException e){
            e.getStackTrace();
            return false;
        }
        
           try{
        int x =Integer.parseInt(input.substring(20));
        }catch(NumberFormatException e){
            e.getStackTrace();
            return false;
        }
           
        if (input.contains("ISBN") && input.length() == 22) {

            return true;
        } else {

            return false;
        }

    }

}
