package cn.bruce.spring.basic_di.a_quickstart_set;

import cn.bruce.spring.basic_di.a_quickstart_set.bean.Cat;
import cn.bruce.spring.basic_di.a_quickstart_set.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Bruce
 * @create 2021-08-02 11:31
 */
public class QuickstartInjectBySetXmlApplication {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);

        Cat cat = factory.getBean(Cat.class);
        System.out.println(cat);
    }
}
