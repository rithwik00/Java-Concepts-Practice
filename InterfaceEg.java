// import java.io.*;

interface Player {
    final int id = 10;
    void display();
}

public class InterfaceEg implements Player {
    public void display(){
        System.out.println("Geek");
    }

    public static void main(String args[]) {
        InterfaceEg t = new InterfaceEg();
        t.display();
        System.out.println(id); //Player.id, t.id also valid :)
        System.out.println(t); // Calls toString method internally
        System.out.println(t.toString()); // direct call to toString method
    }
}
