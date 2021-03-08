package Ejercicio10;

public class Faculty extends CollegeEmployee{
    private Boolean titular;

    public Faculty(String nombre, String apellido, String direccion, Integer cp, Integer telefono, Integer noSeguro, Integer salario, String departamento, Boolean titular) {
        super(nombre, apellido, direccion, cp, telefono, noSeguro, salario, departamento);
        this.titular = titular;
    }

    public Boolean getTitular() {
        return titular;
    }

    public void setTitular(Boolean titular) {
        this.titular = titular;
    }
}
