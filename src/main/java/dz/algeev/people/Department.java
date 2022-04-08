package dz.algeev.people;

public class Department {
    Emploer bossName;
    String title;
    public Department(String title){
        this.title = title;
    }
    public Department(String title, Emploer bossName){
        this.title = title;
        this.bossName = bossName;
    }
    public void setBoss(Emploer bossName){
        if(this.bossName == null){
            this.bossName = bossName;
        }
    }
    public Emploer getBoss(){
        return bossName;
    }
    public String toString(){
        return "Отдел " + title + ". Начальник отдела: " + getBoss();
    }
}
