import com.adouer.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        //发现xml中并没有通过property标签设置Cat和Dog，但是拿到了这两个类
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
        System.out.println(people.getName());
    }
}
