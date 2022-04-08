//package dz.algeev.Process;
//
//import dz.algeev.Test.Config;
//import dz.algeev.Test.Default;
//import dz.algeev.main.Main;
//import lombok.SneakyThrows;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.beans.factory.support.GenericBeanDefinition;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.GenericApplicationContext;
//import org.springframework.stereotype.Component;
//
//import java.beans.Beans;
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class DefaultFieldProcess implements BeanPostProcessor {
//
//    @SneakyThrows
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        if (bean.getClass().isAnnotationPresent(Default.class)) {
//
//            for (Field i : bean.getClass().getDeclaredFields()) {
//                i.setAccessible(true);
//                if (i.get(bean) == null) {
//                    GenericBeanDefinition bd = new GenericBeanDefinition();
//                    bd.setBeanClass(Config.class);
//                    for (Method ann : bd.getBeanClass().getDeclaredMethods()) {
//                        ann.setAccessible(true);
//                        if (i.getType() == ann.getReturnType()) {
//                            i.set(bean, ann.invoke(bd, null));
//                        }
//
//                    }
//                }
//            }
//
//        }
//        return bean;
//    }
//
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        return bean;
//    }
//}
