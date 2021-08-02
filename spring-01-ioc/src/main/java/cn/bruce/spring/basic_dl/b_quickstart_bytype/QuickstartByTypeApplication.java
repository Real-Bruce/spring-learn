package cn.bruce.spring.basic_dl.b_quickstart_bytype;

import cn.bruce.spring.basic_dl.b_quickstart_bytype.bean.Person;
import cn.bruce.spring.basic_dl.b_quickstart_bytype.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Bruce
 * @create 2021-08-02 10:40
 */
public class QuickstartByTypeApplication {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao = factory.getBean(DemoDao.class);
        System.out.println(demoDao.findAll());
    }
}
