package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.entity.Book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class AddBookPage implements Command{
    @Override
    public String execute(HttpServletRequest reg, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        BookDao dao =new BookDao();
        String name=reg.getParameter("name");
        Book book =new Book(null,name);
        dao.save(book);
        return "WEB-INF/view/main.jsp";
    }
}
