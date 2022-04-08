package dz.algeev.people;

public class Record {
    String lection;
    String surNameTeacher;
    int arrs;

    public Record(String lection, String surNameTeacher, int arrs){
        this.lection = lection;
        this.surNameTeacher = surNameTeacher;
        this.arrs = arrs;
    }

    public String toString() {
        String z = "";
        z = z + lection + "|" + surNameTeacher + "|" + arrs;
        return z;
    }
}
