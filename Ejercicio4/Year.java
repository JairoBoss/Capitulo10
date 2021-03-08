package Ejercicio4;

public class Year {
    protected Integer dias;

    public Year() {
        this.dias = 365;
    }

    public void daysElapsed(int mes, int dia){
        int[] meses = {0,31, 28, 31, 30, 31, 30, 30, 31, 30, 31, 30, 31};
        for (int i = 0; i <mes ; i++) {
            dia += meses[i];
        }
        System.out.println(String.format("Han transcurrido %d dias desde el 1 de enero",dia));
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
}
