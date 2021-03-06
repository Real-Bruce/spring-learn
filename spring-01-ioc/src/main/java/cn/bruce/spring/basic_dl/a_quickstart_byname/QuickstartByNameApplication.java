package cn.bruce.spring.basic_dl.a_quickstart_byname;

import cn.bruce.spring.basic_dl.a_quickstart_byname.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Bruce
 * @create 2021-08-02 10:40
 */
public class QuickstartByNameApplication {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Person person = (Person) factory.getBean("person");
        System.out.println(person);
    }
}
