class Parent {

    static void m1()
    {
        System.out.println("From parent "
                           + "static m1()");
    }

    void m2()
    {
        System.out.println("From parent "
                           + "non-static(instance) m2()");
    }
}

class Child extends Parent {

    static void m1()
    {
        System.out.println("From child static m1()");
    }

    @Override
    public void m2()
    {
        System.out.println("From child " + "non-static(instance) m2()");
    }
}

class MethodHiding{
    public static void main(String[] args) {
        Parent obj1 = new Child();
        obj1.m1();

        obj1.m2();
    }
}