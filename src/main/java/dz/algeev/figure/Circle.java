package dz.algeev.figure;

public class Circle extends Figure  {
    final int radius;
    private final Point centr;
    public Circle(Point centr, int radius)  {
        this.centr = new Point(centr.x,centr.y);
        if(radius < 0){
            throw new IllegalArgumentException("радиус отрицательный");
        }
        this.radius = radius;
    }
    public Point getCentr(){
        return new Point(centr.x, centr.y);
    }
    public int figure(){
        return 3 * (int)Math.pow(radius,2);
    }
}
