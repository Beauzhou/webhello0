package by.bsu.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class MainCommand implements Command{
    @Override
    public String execute(HttpServletRequest reg, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        return "WEB-INF/view/main.jsp";
    }
}