import com.adouer.config.MyAnnotaionConfig;
import com.adouer.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        //通过AnnotationConfigApplicationContext获取上下文对象
        ApplicationContext context = new AnnotationConfigApplicationContext(MyAnnotaionConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
