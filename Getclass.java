public class Getclass {
    public static void main(String args[]) {
        Object obj = new String("RithwikVedpathak");
        Class c = obj.getClass();
        System.out.println("Class of the object obj is: " + c.getName());
    }
}
