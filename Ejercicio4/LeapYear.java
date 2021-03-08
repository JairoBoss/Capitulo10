package Ejercicio4;

public class LeapYear extends Year {

    public LeapYear() {
        this.dias = 366;
    }

    public void daysElapsed(int mes, int dia){
        int[] meses = {0,31, 29, 31, 30, 31, 30, 30, 31, 30, 31, 30, 31};
        for (int i = 0; i <mes ; i++) {
            dia += meses[i];
        }
        System.out.println(String.format("Han transcurrido %d dias desde el 1 de enero",dia));
    }

    @Override
    public Integer getDias() {
        return super.getDias();
    }
}
