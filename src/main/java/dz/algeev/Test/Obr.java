package dz.algeev.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Obr {
    static String tash;
    static String doSomething(String s){
        String n[] = s.split("/");
        if(n.length !=2){
            return "Wrong format";
        }
        ApplicationContext c = new AnnotationConfigApplicationContext(Handler.class);

        Handler handler = (Handler) c.getBean(n[0]);

        return handler.dom(n[1]);
    }
//    прорешать задачи про енам из задачника
}
