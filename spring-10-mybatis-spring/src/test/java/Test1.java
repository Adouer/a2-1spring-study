import com.adouer.dao.UserMapperr;
import com.adouer.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperr userMapperr = context.getBean("userMapperr", UserMapperr.class);
        List<User> users = userMapperr.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
