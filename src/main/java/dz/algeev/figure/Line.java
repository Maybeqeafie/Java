package dz.algeev.figure;

import java.util.Objects;

public class Line<L extends Point> implements Cloneable,SumLength{
    private L start, end;

    public Line(L start, L end) throws CloneNotSupportedException{
//        this.start = (L)start.clone();
//        this.end = (L)end.clone();
    }

    public L getLineStart()  {
        return start;
    }
    public L getLineEnd()  {
        return end;
    }
    public void setLine(L start, L end){
        this.start = start;
        this.end = end;
    }
    public int hashCode(){
        return Objects.hash(start,end);
    }
    public boolean equals(Object obj){
        if(this == obj){return true;}
        if(obj == null){return false;}
        if(getClass() != obj.getClass()){return false;}
        Line a = (Line)obj;
        if((this.start != a.start) || (this.end != a.end)){return false;}
        return Objects.equals(start,a.start) && Objects.equals(end, a.end);
    }
    public Object clone() throws CloneNotSupportedException {
        return new Line((Point) start.clone(),(Point) end.clone());
    }
    public double length(){
        return Math.sqrt(Math.pow((end.x - start.x),2)+Math.pow((end.y- start.y),2));
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
