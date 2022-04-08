package dz.algeev.people;

public class Human {

    Human father;
    int number;
    String Name;
    Names str;
    Names surName;
    String firstname;
    String fatherName;
    
    public Human (String firstname, int number, Human father){
        this.firstname = firstname;
        this.number = number;
        this.father = father;

//        if(str.surName == null){
//            str.surName = father.str.surName;
//        }
//        if(str.fatherName == null && father.str.firstname != null){
//            str.fatherName = father.str.firstname + "ович";
//        }
    }
    public Human(String firstname, String fatherName, int number, Names surName){
        this.firstname = firstname;
        this.fatherName = fatherName;
        this.number = number;
        this.surName = surName;
    }
    public Human(String firstname, int number){

        this.firstname = firstname;
        this.number = number;
    }
//    public Human (String Name, int number){
//        this.Name = Name;
//        this.number = number;
//    }
    public String toString(){
//        if(Name != null){
//            return Name + " с ростом " + number;
//        }
        return "Человек с именем " + firstname + " и ростом " + number;
    }
}
