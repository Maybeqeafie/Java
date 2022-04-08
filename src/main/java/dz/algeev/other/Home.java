package dz.algeev.other;

public class Home {
    private final int x;
    public Home(int x){
        if(x < 0){
            throw new IllegalArgumentException("x может быть только положительным");
        }
        this.x = x;
    }
    public int getFloor(){
        return x;
    }
    public String toString() {
       if ((x % 10 == 1) && (x != 11)) {
           return "Дом с " + x + " этажом";
       }
       return "Дом с " + x + " этажами";
    }
}
