package dz.algeev.bird;

public class Popugai extends Fly {
    String text;
    public Popugai(String text){
        this.text = text;
    }
    public void song(){
        System.out.println(text);
    }

}
