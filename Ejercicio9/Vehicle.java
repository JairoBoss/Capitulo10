package Ejercicio9;

public class Vehicle {
    private Integer noRuedas;
    private Integer promedio;

    public Vehicle(Integer noRuedas, Integer promedio) {
        this.noRuedas = noRuedas;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noRuedas=" + noRuedas +
                ", promedio=" + promedio +
                '}';
    }
}
