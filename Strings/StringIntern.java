package Strings;

class StringIntern {
    public static void main(String[] args) {
        String s1 = new String("JAVA");
 
        String s2 = s1.intern();       //Creating String Intern
 
        System.out.println(s1 == s2);       //Output : false
 
        System.out.println(s1.equals(s2));

        String s3 = "JAVA";
        String s4 = s1.intern();

        System.out.println(s3 == s4);
    }
}