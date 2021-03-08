package Ejercicio9;

public class Test {
    public static void main(String[] args) {
        Vehicle a = new Car(23);
        System.out.println(a.toString());

        Vehicle b = new MotorCycle(12);
        System.out.println(b.toString());
    }
}
