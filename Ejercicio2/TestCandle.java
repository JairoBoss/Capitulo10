package Ejercicio2;

public class TestCandle {
    public static void main(String[] args) {
        Candle vela = new Candle("blanco",12.3);
        ScentedCandle vela2 = new ScentedCandle("Rosa",13.2,"rosas");
        vela.imprimir();
        vela2.imprimir();
    }
}
