package Ejercicio4;

public class UseYear {
    public static void main(String[] args) {
        Year año1 = new Year();
        System.out.println(año1.getDias());

        LeapYear año2 = new LeapYear();
        System.out.println(año2.getDias());
    }
}
