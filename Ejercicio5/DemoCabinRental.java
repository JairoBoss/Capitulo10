package Ejercicio5;

public class DemoCabinRental {
    public static void main(String[] args) {
        CabinRental a = new CabinRental(2);
        System.out.println(a.getTarifa());

        HolidayCabinRental b = new HolidayCabinRental(2);
        System.out.println(b.getTarifa());
    }
}
