// import java.io.*;
// import java.util.Scanner;

// import jdk.internal.org.jline.utils.InputStreamReader;

class InputMethod {
    public static void main(String args[]) throws Exception {
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // String name = reader.readLine();
        // System.out.println(name);
        // /******************************************************/
        // Scanner in = new Scanner(System.in);
        // String s = in.nextLine();
        // int a = in.nextInt();
        // float f = in.nextFloat();
        // System.out.println(s + a + f);
        // in.close();
        /******************************************************/
        String name1 = (System.console().readLine());
        System.out.println(name1 + name1.getClass().getName());
    }
}
