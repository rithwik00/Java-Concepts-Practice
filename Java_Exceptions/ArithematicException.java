package Java_Exceptions;

class ArithematicException {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println("c = " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero ");
        }
    }
}