package dz.algeev.math;

import java.util.Objects;

public final class Drob extends Number implements Cloneable{
    private final int chill, znam;

    public Drob(int chill, int znam){
        this.chill = chill;
        if(znam <= 0){
            throw new IllegalArgumentException("знаменатель не может быть отрицательным");
        }
        this.znam = znam;
    }
    public Drob mult(Drob drobi){
        Drob drobi1;
        drobi1 = new Drob(drobi.chill * chill, drobi.znam * znam);
        return drobi1;
    }
    public Drob summa(Drob drobi){
        Drob drobi1;
        if(drobi.znam == znam){
            drobi1 = new Drob(drobi.chill + chill,znam);
            return drobi1;
        }
        drobi1 = new Drob((drobi.chill * znam) + (chill * drobi.znam),drobi.znam * znam);
        return drobi1;
    }
    public Drob minus(Drob drobi){
        Drob drobi1;
        if(drobi.znam == znam){
            drobi1 = new Drob(drobi.chill - chill,znam);
            return drobi1;
        }
        drobi1 = new Drob((drobi.chill * znam) - (chill * drobi.znam), drobi.znam * znam);
        return drobi1;
    }
    public Drob delete(Drob drobi){
        Drob drobi1;
        drobi1 = new Drob(drobi.chill * znam,drobi.znam * chill);
        if (chill <= 0){
            throw new IllegalArgumentException("знаменатель не может быть отрицательным");
        }
        return drobi1;
    }
    public int hashCode(){
        return Objects.hash(chill, znam);
    }
    public boolean equals(Object obj){
        if(this == obj){return true;}
        if(obj == null){return false;}
        if(getClass() != obj.getClass()){return false;}
        Drob a = (Drob) obj;
        if((this.chill != a.chill) || (this.znam != a.znam)){return false;}
        return true;
    }
    public Drob clone() throws CloneNotSupportedException {
        return (Drob) super.clone();
    }
    public String toString() {
        return "Дробь: " + chill + "/" + znam;
    }

    @Override
    public int intValue() {
        return chill/znam;
    }

    @Override
    public long longValue() {
        return chill/znam;
    }

    @Override
    public float floatValue() {
        return chill/(float)znam;
    }

    @Override
    public double doubleValue() {
        return chill/(double)znam;
    }
}
