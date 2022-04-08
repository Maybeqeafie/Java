package dz.algeev.people;

public class Emploer {
    Names name;
    Department department;


    public Emploer(Names name){
        this.name = name;
    }

    public Emploer (Names name, Department department){
        this.name = name;
        this.department = department;
    }


    @Override
    public String toString(){

        if (this == department.getBoss()){
            return name + ", начальник отдела " + department.title;
        }
        return name + " работает в отделе " + department.title
                + ", начальник которого " + department.getBoss().getName();


    }
    public String getName(){
        return name + "";
    }
    public void setDepartment(Department department){
        if(this!=this.department.getBoss()){
            this.department = department;
        }
        else {
            this.department.setBoss(null);
            this.department = department;
        }
    }
}
