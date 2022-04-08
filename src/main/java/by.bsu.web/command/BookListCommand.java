package by.bsu.web.command;

import by.bsu.web.dao.BookDao;
import by.bsu.web.entity.Book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class BookListCommand implements Command{
    @Override
    public String execute(HttpServletRequest reg, HttpServletResponse resp)
            throws SQLException{
        BookDao dao = new BookDao();
        List<Book> books = dao.findAll();
        reg.setAttribute("books",books);
        return "WEB-INF/view/book-list.jsp";
    }
}
