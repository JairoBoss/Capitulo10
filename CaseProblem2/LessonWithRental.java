package CaseProblem2;

public class LessonWithRental extends Rental{
    private Boolean leccion;

    public LessonWithRental(String noContrato, int minutos, String noTelefono, int equipo, Boolean leccion) {
        super(noContrato, minutos, noTelefono, equipo);
        this.leccion = leccion;
    }
}
