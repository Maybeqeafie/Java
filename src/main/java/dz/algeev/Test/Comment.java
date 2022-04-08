package dz.algeev.Test;

import lombok.Data;

@Data
public class Comment {
    String str;
    int mark;
    public Comment(String str, int mark){
        this.str = str;
        this.mark = mark;
    }

}
