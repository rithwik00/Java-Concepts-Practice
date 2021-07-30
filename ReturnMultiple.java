// encapsulate all returned types into a class and then return an object of that class.
import java.util.*;

class MultiDivAdd {
    int mul; // To store multiplication
    double div; // To store division
    int add; // To store addition
    MultiDivAdd(int m, double d, int a)
    {
        mul = m;
        div = d;
        add = a;
    }
}

class ReturnMultiple {
    static MultiDivAdd getMultDivAdd(int a, int b)
    {
        // Returning multiple values of different
        // types by returning an object
        return new MultiDivAdd(a * b, (double)a / b, (a + b));
    }

    public static List<Object> getDetails()
    {
        String name = "Geek";
        int age = 35;
        char gender = 'M';
  
        return Arrays.asList(name, age, gender);
    }
  
    // Driver code
    public static void main(String[] args)
    {
        MultiDivAdd ans = getMultDivAdd(10, 20);
        System.out.println("Multiplication = " + ans.mul);
        System.out.println("Division = " + ans.div);
        System.out.println("Addition = " + ans.add);

        
        List<Object> person = getDetails();
        System.out.println(person);
    }
}