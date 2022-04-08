package dz.algeev.figure;

import java.util.Objects;

public class Point implements Cloneable{
     public int x,y;
//    Point x1;
//    Point y1;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //    public Point(Point x1, Point y1){
//        this.x1 = x1;
//        this.y1 = y1;
//    }
    public int hashCode(){
        return Objects.hash(x,y);
    }
    public boolean equals(Object obj){
        if(this == obj){return true;}
        if(obj == null){return false;}
        if(getClass() != obj.getClass()){return false;}
        Point a = (Point) obj;
        if((this.x != a.x) || (this.y != a.y)){return false;}
        return true;
    }

    public String toString(){
        return  "{" + x + ";" + y + "}";

    }
}
