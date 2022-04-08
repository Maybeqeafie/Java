//package dz.algeev.Process;
//
//import lombok.SneakyThrows;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.stereotype.Component;
//import java.lang.reflect.Field;
//
//@Component
//public class CheckFieldProcess implements BeanPostProcessor {
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        return bean;
//    }
//
//
//    @SneakyThrows
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        Field gol = bean.getClass().getDeclaredField("name");
//        if(gol.getType() == String.class){
//            gol.setAccessible(true);
//            if(gol.get(bean) != null){
//                return bean;
//            }
//            gol.set(bean, "vasia");
//        }
//        return bean;
//    }
//}
