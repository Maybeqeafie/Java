package dz.algeev.generic;

public class TestInterface implements Test{
    @Override
    public void apply(Object o) {
        Test.super.apply(o);
        System.out.println("Goodbye!");
    }
}
