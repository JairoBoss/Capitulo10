package GameZone1;

public class Test {
    public static void main(String[] args) {
        Alien a = new Martian(2,7,"chicle");
        System.out.println(a.toString());

        Alien b = new Jupiterian(1, 10,"Gris");
        System.out.println(b.toString());
    }
}
