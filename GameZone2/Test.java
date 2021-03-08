package GameZone2;

public class Test {
    public static void main(String[] args) {
        Die a = new Die();
        Die b = new LoadedDie();
        int contador = 0;
        for (int i = 0; i < 101 ; i++) {
            a.lanzar();
            b.lanzar();
            if (a.getValor()>b.getValor()){
                contador++;
            }
        }

        System.out.println(contador);

        for (int i = 0; i < 101; i++) {
            a.lanzar();
            b.lanzar();
            if (a.getValor()<b.getValor()){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
