package Java_Exceptions;

class ReturnFromTryCatch {
    public static void main(String[] args) {
        System.out.println(methodReturningValue());    //Output : 50
    }
 
    static String methodReturningValue() {
        String s = null;
        try
        {
            s = "From try block ";
            return s;
        }
        catch (Exception e)
        {
            return s;
        }
        finally
        {   
            s = s + "from finally";
            // System.out.println("hi");
            // return s;    //This method returns From try bloack from finally
        }

        // return s;    Unreachable code
    }    
}
