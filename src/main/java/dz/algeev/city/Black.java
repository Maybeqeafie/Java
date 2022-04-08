package dz.algeev.city;

public class Black implements Color{

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public Color next() {
        return null;
    }
}
