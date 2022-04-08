package dz.algeev.city;

public class Red implements Color{

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public Color next() {
        return new Green();
    }
}
