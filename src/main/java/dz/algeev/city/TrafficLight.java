package dz.algeev.city;

public class TrafficLight {
    private Color currentColor = new Red();

    public String next(){
        if(currentColor.getClass() == Red.class) {
            currentColor = new Green();
        }
        else {
            currentColor = new Red();
        }
        return currentColor.getColor();
    }
    public void on(){
        currentColor = new Red();
    }
    public void off(){
        currentColor = new Black();
    }
}
