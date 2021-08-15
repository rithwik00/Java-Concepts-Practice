package InnerClass;

class Outer {
    int x = 10;
  
    static class InnerClass {
      int y = 5;
    }
  }
  
  public class StaticInnerClass {
    public static void main(String[] args) {
      Outer.InnerClass myInner = new Outer.InnerClass();
      System.out.println(myInner.y);
    }
  }


