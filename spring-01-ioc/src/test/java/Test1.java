import com.adouer.dao.impl.UserDaoImpl;
import com.adouer.dao.impl.UserDaoMysqlImpl;
import com.adouer.dao.impl.UserDaoOracleImpl;
import com.adouer.service.UserService;
import com.adouer.service.impl.UserServiceImpl;

import java.util.Calendar;

public class Test1 {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
