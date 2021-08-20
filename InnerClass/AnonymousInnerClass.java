package InnerClass;

class SuperClass {
    void methodOne() {
        System.out.println("From SuperClass");
    }
 
    void methodTwo() {
        System.out.println("From SuperClass");
    }
}

class AnonymousInnerClass {
    public static void main(String args[]) {
        SuperClass superclass = new SuperClass() 
        {
            @Override
            void methodOne() {
                System.out.println("From Anonymous Inner Class");
            }
        };
        superclass.methodOne();
    }
}
