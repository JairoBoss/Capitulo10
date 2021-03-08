package Ejercicio10;

public class CollegeEmployee extends Person {
    private Integer noSeguro;
    private Integer salario;
    private String departamento;

    public CollegeEmployee(String nombre, String apellido, String direccion, Integer cp, Integer telefono, Integer noSeguro, Integer salario, String departamento) {
        super(nombre, apellido, direccion, cp, telefono);
        this.noSeguro = noSeguro;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Integer getNoSeguro() {
        return noSeguro;
    }

    public void setNoSeguro(Integer noSeguro) {
        this.noSeguro = noSeguro;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
