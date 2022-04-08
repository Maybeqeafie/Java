package dz.algeev.Process;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class BeanRandom implements BeanFactoryPostProcessor {

    @SneakyThrows
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        if (!beanFactory.containsBean("random")) {

            BeanDefinitionRegistry lol = (BeanDefinitionRegistry) beanFactory;
            GenericBeanDefinition gBean = new GenericBeanDefinition();
            gBean.setBeanClass(BeanConfig.class);
            lol.registerBeanDefinition("randomConfig",gBean);

            GenericBeanDefinition randomBean = new GenericBeanDefinition();
            randomBean.setFactoryBeanName("randomConfig");

            randomBean.setFactoryMethodName("random");
            randomBean.setBeanClass(int.class);
            randomBean.setScope("prototype");
            lol.registerBeanDefinition("random", randomBean);
        }
    }
}
