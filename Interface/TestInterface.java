package Interface;

interface Inter1 {
    default void m1() {
        System.out.println("In 1st interface");
    }

    void m2();
}

interface Inter2 {
    default void m1(int i) {
        System.out.println("In 2nd interface");
        m3();
    }

    private void m3() {
        System.out.println("Private method in interface");
    }
}

class TestInterface implements Inter1, Inter2 {

    public void m2() {
        System.out.println("Yo");
    }
    public static void main(String[] args) {
        // System.out.println("Hi");
        TestInterface t = new TestInterface();
        t.m1();
        t.m2();
        t.m1(2);
        // t.m3();
        // new TestInterface.m1(2);
        // new TestInterface.m2();
    }  

}
