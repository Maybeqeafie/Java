package dz.algeev.figure;

public class Rectangle extends Figure {
    Point x;
    int len,len1;
    public Rectangle(Point x, int len, int len1){
        this.x = x;
        this.len = len;
        this.len1 = len1;
    }
    public int figure(){
        return len * len1;
    }
}
