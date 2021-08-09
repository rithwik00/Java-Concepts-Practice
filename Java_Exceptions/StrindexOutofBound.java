package Java_Exceptions;

class StrindexOutofBound {
    public static void main(String args[])
    {
        try {
            String a = "This is like chipping ";
            char c = a.charAt(24); 
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
