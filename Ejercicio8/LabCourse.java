package Ejercicio8;

public class LabCourse extends CollegeCourse {

    public LabCourse(String departamento, Integer creditos, Integer noCurso) {
        super(departamento, creditos, noCurso);
        this.tarifa = (12*creditos)+50;
    }

    @Override
    public String toString() {
        return "LabCourse{" +
                "tarifa=" + tarifa +
                '}';
    }
}
