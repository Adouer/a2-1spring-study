import com.adouer.dao.UserMapper;
import com.adouer.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //设置配置文件
        String resource = "mybatis-config.xml";
        //流读取配置文件
        InputStream in = Resources.getResourceAsStream(resource);
        //获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory  = new SqlSessionFactoryBuilder().build(in);
        //获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
