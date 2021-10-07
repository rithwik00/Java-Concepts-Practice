package Inheritance;

class Bicycle {
    public int gear, speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public Bicycle() {
        this.gear = 0;
        this.speed = 0;
        System.out.println("In Superclass Constructor");
    }

    static void testing(int i) {
        System.out.println("static with one parameter");
    }

    static void testing(int i, int j) {
        System.out.println("static with 2 parameters");
    }

    void testing(float i, int j) {
        System.out.println("non static test");
    }
    
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedup(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("Number of gears are " + gear + "\n" + "Speed of bicycle is " + speed);
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;
    static void testing(int i) {
        System.out.println("static with one parameter subclass");
    }

    public MountainBike(int gear, int speed, int startHeight) {
        // super(gear, speed);
        seatHeight = startHeight;
        System.out.println("In Subclass Constructor");
    }

    public MountainBike() {
        System.out.println("In Subclass Constructor");
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}

class SingleInheritance {
    public static void main(String args[]) {
        Bicycle mb = new MountainBike();
        System.out.println(mb.toString());
        mb.testing(2);
        // Bicycle.testing(0.0f, 2);    NOT ALLOWED 
    }
}
