class Getclass {
    public static void main(String args[]) {
        Object obj = new String("RithwikVedpathak");
        Class c = obj.getClass();
        c.getName();
        System.out.println("Class of the object obj is: " + c.getName());
    }
}
