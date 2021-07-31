abstract class abs {
    final void fun() {
        System.out.println("Derived fun() called");
    }
}

class derived extends abs {}

class Abstract {
    public static void main(String args[]) {
        abs b = new derived();
        b.fun();
    }
}