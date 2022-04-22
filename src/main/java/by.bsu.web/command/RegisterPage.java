package by.bsu.web.command;

import by.bsu.web.dao.UserDao;
import by.bsu.web.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class RegisterPage implements Command{
    @Override
    public String execute(HttpServletRequest reg, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        UserDao dao =new UserDao();
        Integer is_admin = 0;
        String name=reg.getParameter("name");
        String login=reg.getParameter("login");
        String password=reg.getParameter("password");
        User user =new User(null,name,login,password,is_admin);
        dao.register(user);
        return "index.jsp";
    }
}