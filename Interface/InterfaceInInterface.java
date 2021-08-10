package Interface;

interface Test1 {
   interface Yes
   {
      void show();    
   }
}
  
class Testing1 implements Test1.Yes {
   public void show()
   {
      System.out.println("show method of interface");
   } 
} 

public class InterfaceInInterface {
    public static void main(String[] args)
   {
     Test.Yes obj;
     Testing t = new Testing();
     obj = t;
     obj.show();
   } 
}
