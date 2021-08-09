class Testing
{
    int x;
    Testing(int i) { x = i; }
    Testing()      { x = 0; }
}

class CallByReference {
  
    public static void main(String[] args)
    {
        // t is a reference
        Testing t = new Testing(5);
  
        // Reference is passed and a copy of reference
        // is created in change()
        change(t);
  
        // New value of x is printed
        System.out.println(t.x);
    }
  
    // This change() doesn't change the reference, it only
    // changes member of object referred by reference
    public static void change(Testing t)
    {
        t.x = 10;
    }  
}

