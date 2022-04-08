package dz.algeev.figure;

public class Square extends Figure {
    private int length;
    public Point point;
    public Square(int length, Point point){
        this.point = point;
        if(length <= 0){
            throw new IllegalArgumentException("Длина может быть только больше 0");
        }
        this.length = length;
    }
    public Polyline corners(){
        return new Polyline( new Point[]{
                new Point(point.x, point.y),
                new Point(point.x + length, point.y),
                new Point(point.x + length, point.y + length),
                new Point(point.x, point.y + length)});
    }
    public int summa(){
        int summa;
        summa = length * 4;
        return summa;
    }
    public void setLength(int length){
        if(length <= 0){
            throw new IllegalArgumentException("Длина может быть только больше 0");
        }
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public int figure(){
        return length + length;
    }
    public String toString(){
        return "квадрат в точке " + point + " со стороной " + length;
    }
}
