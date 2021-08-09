package Constructors;
// import javax.print.event.PrintJobListener;

class ConstructorChaining {
    ConstructorChaining() {
        System.out.println("Inside default constructor");
    }

    ConstructorChaining(int x) {
        this();
        System.out.println("Inside one parameter Constructor");
    }

    ConstructorChaining(int x, int y) {
        this(5);
        System.out.println("Inside two parameter Constructor");
    }

    public static void main(String[] args) {
        ConstructorChaining c = new ConstructorChaining(1, 2);
    }
}
