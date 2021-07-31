class Bicycle {
    public int gear, speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public Bicycle() {
        this.gear = 0;
        this.speed = 0;
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

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}

public class SingleInheritance {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
