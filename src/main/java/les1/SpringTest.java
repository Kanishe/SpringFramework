package les1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean = applicationContext.getBean("testBean",TestBean.class);

        System.out.println(testBean.getName());
        applicationContext.close();
    }
}
