package dz.algeev.math;

import dz.algeev.figure.Point;
import dz.algeev.figure.Polyline;

public class Zamk extends Polyline {
    public Zamk(Point... points){
        super(points);
    }
    public int isSumma() throws CloneNotSupportedException {
        return super.isSumma() + (int)Math.sqrt(Math.pow((points[0].x - points[points.length - 1].x),2)+Math.pow((points[0].y- points[points.length - 1].y),2));
    }
}
