package dz.algeev.main;

import dz.algeev.Process.BeanConfig;
import dz.algeev.Process.Imya;
import dz.algeev.Test.Default;
import dz.algeev.Test.Monster;
import dz.algeev.Test.ReturnMethods;
import dz.algeev.Test.Stock;
//import dz.algeev.Test.StudentFactory;

import dz.algeev.people.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.beans.Beans;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;


//@SpringBootApplication
//@RestController
//@RequestMapping(value = "", produces = "application/json")
public class Main {

//    @Autowired
//    private PersonRep personRep;

    public static void main(String args[]) throws CloneNotSupportedException, InterruptedException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        SpringApplication.run(Main.class, args);


//        ReturnMethods methods = new ReturnMethods();
//        System.out.println(methods.getMethods(Monster.class));
//        System.out.println(methods.fieldCollection(Monster.class));
//
//        ApplicationContext ctx = new AnnotationConfigApplicationContext("dz.algeev");
//        ctx.getBeansOfType(Student.class).entrySet().forEach(System.out::println);

//        System.out.println(ctx.getBean("hell"));
//
//        System.out.println(ctx.getBean("random"));
//        System.out.println(ctx.getBean("random"));
//
//        System.out.println(ctx.getBean("data"));
//
//        System.out.println(((Predicate<Integer>) ctx.getBean("rule")).test(4));
//
//        System.out.println(ctx.getBean("com3"));
//
//        System.out.println(ctx.getBean("bestCom"));
//
//        StudentFactory strg = (StudentFactory) ctx.getBean("stFactory");
//        System.out.println(strg.createStudent("sdfsd", Arrays.asList(2, 5, 3, 4)));
//        strg.createStudent("faga");
//
//        Stock stock = (Stock) ctx.getBean("subscriber1");
//        stock.notifications(899);


//        Annotation annotation = Imya.class.getAnnotation(Default.class);
//        System.out.println(annotation.getClass().getDeclaredMethod("stroka").invoke(annotation, null));
//        System.out.println(ctx.getBean(Imya.class));
//        System.out.println(ctx.getBean("random"));
    }

//    @RequestMapping("create-person")
//    public BaseD createPerson() {
//        return personRep.save(new BaseD());
//    }
}

