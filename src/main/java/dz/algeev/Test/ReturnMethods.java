package dz.algeev.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//    что бы мапа возвращала имя метода
//    2 ознакомится про рефлексию, аннтоциию и поделать задачки на рефлексию
public class ReturnMethods {
    public Map<String,Object> getMethods(Class<?> c){
            return Arrays.stream(c.getDeclaredMethods())
                    .filter(x -> x.isAnnotationPresent(Check.class))
                    .collect(Collectors.toMap(Method::getName, method -> invoke(method, c)));
    }

    public static Object invoke(Method m,Class<?> c){
        try{
            m.setAccessible(true);
            return m.invoke(c.newInstance(),null);
        }catch (Exception ex){
            return null;
        }
    }

    public List<String> fieldCollection(Object o){
        List<String> l = new ArrayList<>();

        for(Class claz = o.getClass();claz != null; claz = claz.getSuperclass()){
            for(Field field : claz.getDeclaredFields()){
                field.setAccessible(true);
                l.add(field.getName());
            }
        }
        return l;
    }

//    public List<Line> lineConnector(Line l, Line li){
//
//    }

}

