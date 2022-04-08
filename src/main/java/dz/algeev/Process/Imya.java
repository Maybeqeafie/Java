package dz.algeev.Process;

import dz.algeev.Test.Default;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Data
@Component
@Default(Imya.class)
public class Imya {
    String name;
    int number;



}
