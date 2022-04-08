//package dz.algeev.Test;
//
//import dz.algeev.people.Student;
//import lombok.Data;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//
//@Data
//@Component
//public class StudentFactory {
//    private IdGenerator idgenerator;
//    private Predicate<Integer> rule;
//
//    public StudentFactory(IdGenerator idgenerator, Predicate<Integer> rule) {
//        this.idgenerator = idgenerator;
//        this.rule = rule;
//    }
//
//    public Student createStudent(String name) {
//        return createStudent(name, new ArrayList<>());
//    }
//
//    public Student createStudent(String name, List<Integer> marks) {
//        for(int i=0;i<marks.size();i++){
//            if(!rule.test(marks.get(i))){
//                return new Student(idgenerator.next(), name, rule, new ArrayList<>());
//            }
//        }
//        return new Student(idgenerator.next(), name, rule, marks);
//    }
//}
