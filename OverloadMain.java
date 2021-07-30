public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hi from main");
        OverloadMain.main("Geek");
    }

    public static void main(String args1, String args2) {
        System.out.println("Hi, " + args1 + ", " + args2);
    }

    public static void main(String arg1) {
        System.out.println("Hi, " + arg1);
        OverloadMain.main("Dear G", "My G");
    }

    
}
