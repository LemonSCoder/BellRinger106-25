public class EmailParser {
    public static void main(String args[]) {
        //Test Case: should return first name + last name successfully.
        String userName = getString("john.doe@example.com");
        System.out.println(userName);
        //Test Case: should return customized exception message when @ sign is not present.
        String userAtExc = getString("nathan.yeegmail.com");
        System.out.println(userAtExc);
        //Test Case: should return customized exception message when '.' is not present.
        String userDotExc = getString("evelynlee@gmail.com");
        System.out.println(userDotExc);
    }
    public static String getString(String email) {
        //Exception Handler when '@' sign is not present.
        try {
            // Extracts part of string before the '@' sign.
            String firstLast = email.substring(0, email.indexOf("@"));
            try {
                //Extracts first name of user (anything before the '.')
                String firstName = firstLast.substring(0, firstLast.indexOf("."));
                //Extracts last name of user (anything after the '.')
                String lastName = firstLast.substring(firstLast.indexOf(".") + 1, firstLast.length());
                // Returns first name + last name
                return firstName + " " + lastName;  
            //Returns customized exception message if there is no '.' in the given email string.
            } catch (Exception e) {
                return "There is no '.' in your email.";
            }
        }
        //Returns customized exception message if there is no '@' sign in the given email string.
        catch (Exception e) {
            return "There is no @ sign in your email.";
        }
    }
}
