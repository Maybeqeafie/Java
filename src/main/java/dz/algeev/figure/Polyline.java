package dz.algeev.figure;

import java.util.Arrays;
import java.util.Objects;

public class Polyline {
    public Point[] points;
    Point dotst,doten;
    public Polyline(Point[] points){
        this.points = points;
    }
    public Polyline(){
     this.points = new Point[0];
    }
    public int isSumma() throws CloneNotSupportedException {
        Line len;
        int lol = 0;
        for(int i = 0; i < points.length - 1; i++){
            len = new Line(points[i], points[i+1]);
            lol += len.length();
        }
        return lol;
    }
    public int hashCode(){
        return Objects.hash(Arrays.toString(points));
    }
    public boolean equals(Object obj){
        if(this == obj){return true;}
        if(obj == null){return false;}
        if(getClass() != obj.getClass()){return false;}
        Polyline a = (Polyline) obj;
        for(int i = 0;i <points.length;i++){
            if(this.points[i] != a.points[i]){return false;}
        }
        return true;
    }
    public String toString(){
        return "Линия " + Arrays.toString(points);
    }
}
