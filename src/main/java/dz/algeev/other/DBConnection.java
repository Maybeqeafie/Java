package dz.algeev.other;

import java.util.Optional;

public class DBConnection implements AutoCloseable {
    public static int count = 5;
    private boolean isOpen = true;

    private DBConnection(){
    }

    public String next(){
        if(isOpen){
            return "HW";
        }
        return null;
    }

    public Optional<DBConnection> create(){
        if(count > 0){
            count--;
            return Optional.of(new DBConnection());
        }
        else  return Optional.empty();
    }

    public void close(){
        if(isOpen) {
            count++;
            isOpen = false;
        }
    }
}
