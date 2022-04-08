package dz.algeev.other;

public class Comment {

    int number;
    String name;
    Comment com;

    public static final String SDVIG = "---";

    public Comment( int number,String name){
        this.number = number;
        this.name = name;

    }

    public Comment(int number,String name, Comment com){
        this.number = number;
        this.name = name;
        this.com = com;

    }

    public String toString(){
        if(com != null){

            name = SDVIG + "(" + number + ")" + name;

        }
        return name;

    }
}
