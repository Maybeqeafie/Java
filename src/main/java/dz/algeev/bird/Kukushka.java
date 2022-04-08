package dz.algeev.bird;

public class Kukushka extends Fly {
    public void song(){
        for(int i = 0;i <= ((Math.random() * 10) + 1);i++){
            System.out.println("ку-ку");
        }
    }
}
