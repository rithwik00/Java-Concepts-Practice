package Java_Exceptions;

class UserDefined extends Exception {
    private static int accno[] = {1, 2, 3, 4};
    private static String name[] = {"a", "b", "c", "d", "e"};
    private static double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

    UserDefined() {    }
    UserDefined(String str) { super(str); }

    public static void main(String[] args)
    {
        try  {
            // display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
 
            // display the actual account information
            for (int i = 0; i < 5 ; i++)
            {
                System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
 
                // display own exception if balance < 1000
                if (bal[i] < 1000) {
                    UserDefined me = new UserDefined("Balance is less than 1000");
                    throw me;
                }
            }
        } //end of try
 
        catch (UserDefined e) {
            e.printStackTrace();
        }
    }
}