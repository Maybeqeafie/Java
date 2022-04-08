package dz.algeev.other;

public class Cat {
    int N = 1;
    String cat;
    String stroka = "";
    public Cat(String cat){
        this.cat = cat;
    }
    public void Meow(){
        System.out.println(cat + ": мяу!");
    }
    public void Meow(int N){
        for(int i = N; i > 0;i--){
            stroka = stroka + "мяу-";
        }
        System.out.println(cat + ": " + stroka + "!");
    }
}
