package Inheritance;
interface Shape1 {
    void draw();
    double area();
}
 
class Rect implements Shape1 {
    int length, width;

    Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }
 
    @Override public void draw() {
        System.out.println("Rect has been drawn ");
    }
 
    @Override public double area() {
        return (double)(length * width);
    }
}
 
class Cir implements Shape1 {
 
    double pi = 3.14;
    int radius;
 
    Cir(int radius) { this.radius = radius; }
 
    @Override public void draw() {
        System.out.println("Cir has been drawn ");
    }
 
    @Override public double area() {
 
        return (double)((pi * radius * radius) / 2);
    }
}
class InterfaceEg {
    public static void main(String args[]) {
        Shape1 rect = new Rect(2, 3);
        System.out.println("Area of Rect: " + rect.area());
 
        Shape1 Cir = new Cir(2);
        System.out.println("Area of Cir: " + Cir.area());
    }
}
