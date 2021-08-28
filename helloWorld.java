
class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
         
        int[] b = new int[100];
         
        a = b;

        System.out.println(a[90]);
    }
}