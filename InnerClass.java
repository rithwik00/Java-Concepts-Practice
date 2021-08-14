public class InnerClass {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.Inner inner = out.new Inner();

        System.out.println(out.x + inner.y);
    }
}

class OuterClass {
    int x = 10;
  
    class Inner {
      int y = 5;
    }
  }