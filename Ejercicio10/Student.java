package Ejercicio10;

public class Student extends  Person{
    private String estudio;
    private Double promedio;

    public Student(String nombre, String apellido, String direccion, Integer cp, Integer telefono, String estudio, Double promedio) {
        super(nombre, apellido, direccion, cp, telefono);
        this.estudio = estudio;
        this.promedio = promedio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
}
