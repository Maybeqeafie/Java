package dz.algeev.generic;

public interface Test<T> {
    default void apply(T o){
        System.out.println("Hello!");
    }
}
