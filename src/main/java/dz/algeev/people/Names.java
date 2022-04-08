package dz.algeev.people;

public class Names {

    final String firstName;
    String patronymic, lastName;
    String word;
    public Names(String firstName){
        this(firstName,null,null);
    }
    public Names(String firstName, String lastName){
        this(firstName,null,lastName);
    }
    public Names(String firstName, String patronymic, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        if((firstName==null&&lastName==null&&patronymic==null)||
                (firstName==""&&lastName==""&&patronymic=="")){
            throw new IllegalArgumentException("Username cannot be null");
        }
    }

    public String getPatronymic(){
        return patronymic;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String toString(){

        return ((lastName==null?"":(lastName + " ")) +
                (firstName==null?"":(firstName + " ")) +
                (patronymic==null?"":(patronymic)));
    }
}
