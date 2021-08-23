package Java_Exceptions;

class Test {
    public static void main(String[] args) {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < 6; i++)
        {
            try
            {
                int a = s[i].length() + Integer.parseInt(s[i]);    
 
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
 
            }
 
            catch(Exception ex)
            {
                System.out.println(ex);
            }
 
            // catch (Exception ex)
            // {
            //     System.out.println("ArrayIndexOutOfBoundsException will be caught here");
            // }
        }
    }
}
