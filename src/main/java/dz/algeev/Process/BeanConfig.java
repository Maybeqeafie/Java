package dz.algeev.Process;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;


public class BeanConfig {

    int random(){
        return new Random().nextInt(100);
    }
}
