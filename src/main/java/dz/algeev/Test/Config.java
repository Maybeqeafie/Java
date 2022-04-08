package dz.algeev.Test;


import dz.algeev.people.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

@Configuration
public class Config {
    @Bean
    String hell(){
        return "Hello world!";
    }

    @Scope("prototype")
    int random(int min, int max){
        return new Random().nextInt(max - min) + min;
    }
    @Bean
    Date data(){
        return new Date();
    }
    @Bean
    @Scope("singleton")
    Predicate<Integer> rule(){
        return x -> x >=2 && x <= 5;
    }
    @Bean
    int max(){
        return 3;
    }
    @Bean
    int min(){
        return 0;
    }
    @Bean
    Comment com1(){
        return new Comment("Очень хорошо", 4);
    }
    @Bean
    Comment com2(){
        return new Comment("Сойдет", 3);
    }
//    @Bean
//    Comment com3(){
//        return new Comment("Сложно сказать", random(2,5));
//    }
    @Bean
    @Scope("prototype")
    Comment bestCom(List<Comment> com){
//        Comment x = null;
//        for(int i = 0; i < com.size();i++){
//            if(com.get(i).mark > com.get(i++).mark){
//                x = com.get(i);
//            }
//
//        }
//        return x;
        return com.stream().max(Comparator.comparingInt(Comment::getMark)).get();
    }
//    @Bean
//    StudentFactory stFactory(IdGenerator gen,Predicate<Integer> rule){
//        return new StudentFactory(gen,rule);
//    }
//    @Bean
//    Stock subscriber1(){
//        return new Stock("Apple", 999);
//    }
//    @Bean
//    Stock subscriber2(){
//        return new Stock("SpaceX", 568);
//    }
}
