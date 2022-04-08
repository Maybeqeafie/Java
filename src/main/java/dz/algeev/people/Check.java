package dz.algeev.people;

public class Check {
    int number;
    String name;
    Record z;

    public Check(String name, int number, Record z){
        this.name = name;
        this.number = number;
        this.z = z;
    }

    public String toString() {

        return name + "-" + number + ":" + "\n" + z;
    }
}
