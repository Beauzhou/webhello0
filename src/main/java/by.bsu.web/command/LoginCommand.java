package by.bsu.web.command;

import by.bsu.web.dao.UserDao;
import by.bsu.web.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class LoginCommand implements Command{
    @Override
    public String execute(HttpServletRequest reg, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        String login = reg.getParameter("login");
        String password = reg.getParameter("password");

        UserDao dao = new UserDao();
        User user = dao.login(login,password);

        if (user!=null){
            reg.getSession().setAttribute("user",user);
            return "WEB-INF/view/main.jsp";
        } else{
            reg.setAttribute("error_message","Incorrect login or password");
            return "index.jsp";
        }
    }
}
