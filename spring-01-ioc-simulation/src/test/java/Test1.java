import com.adouer.MyApplicationContext;

import java.net.URL;

public class Test1 {

    public static void main(String[] args) {
        //类加载器->resources路径->spring.xml配置文件
        String path = Test1.class.getClass().getResource("/spring.xml").getPath();
        MyApplicationContext myApplicationContext = new MyApplicationContext(path);
        Object user1 = myApplicationContext.getBean("user1");
        Object user3 = myApplicationContext.getBean("user2");
        System.out.println(user1);
        System.out.println(user3);
    }
}
