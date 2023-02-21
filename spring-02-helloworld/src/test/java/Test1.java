import com.adouer.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class Test1 {
    public static void main(String[] args) {
        //获取spring上下文路径
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = context.getBean("hello5", Hello.class);

        System.out.println(hello);
    }
}
