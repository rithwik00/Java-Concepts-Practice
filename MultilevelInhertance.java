class MultilevelInhertance {
    public static void main(String[] args)
    {
        three g = new three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}

class one {
    void print_geek()
    {
        System.out.println("Geeks");
    }
}
 
class two extends one {
    void print_for() { System.out.println("for"); }
}
 
class three extends two {
    void print_geek()
    {
        System.out.println("Geeks");
    }
}