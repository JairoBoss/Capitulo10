package Ejercicio7;

public class Test {
    public static void main(String[] args) {
        CarRental a = new CarRental("Jairo",160,"CHICO",2);
        System.out.println(a.toString());

        LuxuryCarRental b = new LuxuryCarRental("Jairo",160,"CHICO",2);
        System.out.println(b.toString());
    }
}
