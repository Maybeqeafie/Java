package dz.algeev.figure;

public class Triangle extends Figure {
    Point[] points;
    public Triangle(Point... points){
        if((points.length > 3) || (points.length < 1)){
            throw new IllegalArgumentException("нужно задать только 3 точки");
        }
        this.points = points;
    }
    public int figure(){

        return ((points[1].x - points[0].x) * (points[2].y - points[0].y) - (points[2].x - points[0].x) * (points[1].y - points[0].y)) / 2;
    }
}
