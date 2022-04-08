package dz.algeev.city;

public class Green  implements  Color{

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public Color next() {
        return new Red();
    }
}
