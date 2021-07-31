public class ThisConstructorOverlaoding {
    public static void main(String[] args)
    {
        // create box using only boxNo
        Box box1 = new Box(1);
  
        // getting initial width of box1
        System.out.println(box1.width);
    }
}

class Box
{
    double width, height, depth;
    int boxNo;
  
    // constructor used when all dimensions and
    // boxNo specified
    Box(double w, double h, double d, int num)
    {
        width = w;
        height = h;
        depth = d;
        boxNo = num;
    }
  
    // constructor used when no dimensions specified
    Box()
    {
        // an empty box
        width = height = depth = 0;
    }
  
    // constructor used when only boxNo specified
    Box(int num)
    {
        // this() is used for calling the default
        // constructor from parameterized constructor
        this();
  
        boxNo = num;
    }
}