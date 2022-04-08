package dz.algeev.generic;

public class Box<T>{
    T ob;
    public T getObject(){
        return ob;
    }
    public void setObject(T ob){
        if(isPresent() == false){
            throw new IllegalArgumentException("коробка не пуста");
        }
        this.ob = ob;
    }
    public boolean isPresent(){
        if(ob != null){
            return false;
        }
        return true;
    }
    public T take(){
        T obj = ob;
        ob = null;
        return ob;
    }
}
