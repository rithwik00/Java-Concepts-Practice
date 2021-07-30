class Person{}
class Boy extends Person implements Myinterface {}
interface Myinterface{}

class OperatorInstance {
    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Boy();

        System.out.println("obj1 instance of Person: "+ (obj1 instanceof Person));
        System.out.println("obj1 instance of Boy: "+ (obj1 instanceof Boy));
        System.out.println("obj1 instance of Myinterface: "+ (obj1 instanceof Myinterface));
    }
}