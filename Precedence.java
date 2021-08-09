class Precedence {
    public static void main(String[] args)
    {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

        System.out.println("a+b/d = " + (a + b / d));

        System.out.println("a+b*d-e/f = " + (a + b * d - e / f));
    
        System.out.println(b++ + ++c);

        int x = 5, y = 3;
        System.out.println("Hi " + x + y);
        System.out.println("Hi " + (x + y));
    }
}
