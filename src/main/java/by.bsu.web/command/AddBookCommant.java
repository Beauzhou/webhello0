package by.bsu.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class AddBookCommant implements Command{
    @Override
    public String execute(HttpServletRequest reg, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        return "WEB-INF/view/add-book.jsp";
    }
}
