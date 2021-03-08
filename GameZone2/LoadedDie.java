package GameZone2;

public class LoadedDie extends Die{
    public LoadedDie(){
        this.numero = (int)(Math.random() * 6 + 2);
    }

    public void lanzar(){
        this.numero = (int)(Math.random() * 6 + 2);
    }
}
