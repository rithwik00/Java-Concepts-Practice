package Java_Exceptions;

class NestedTryCatch {
    public static void main(String[] args) {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < s.length; i++)
        {
            //First Level try-catch block
            try
            {
                int a = s[i].length();    //This statement may throw NullPointerException
 
                //second level try-catch block
                try
                {
                    System.out.println(s[i+1]);   //This statement may throw ArrayIndexOutOfBoundsException
 
                    //third level try-catch block
                    try
                    {
                        a = Integer.parseInt(s[i]);    //This statement may throw NumberFormatException
                    }
                    catch (NullPointerException e)
                    {
                        System.out.println("NumberFormatException will not be caught here");
                    }
                }
                catch (NumberFormatException ex)
                {
                    System.out.println("NumberFormatException will be caught here");
                }
            }
            catch(Exception ex)
            {
                System.out.println("This block catches all types of exceptions: " + ex);
            }
        }
    }    
}
