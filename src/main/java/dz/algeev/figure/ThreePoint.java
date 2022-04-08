package dz.algeev.figure;

public class ThreePoint extends Point {
    int z;
    public ThreePoint(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public boolean equals(Object obj){
        if(this == obj){return true;}
        if(obj == null){return false;}
        if(getClass() != obj.getClass()){return false;}
        ThreePoint a = (ThreePoint) obj;
        if((this.x != a.x) || (this.y != a.y) || (this.z != a.z)){return false;}
        return true;
    }
    public String toString(){
        return "{" + x + ";" + y + ";" + z + "}";
    }
}
