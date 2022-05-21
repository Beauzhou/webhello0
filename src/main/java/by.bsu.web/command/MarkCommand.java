package by.bsu.web.command;

import by.bsu.web.dao.MarkDao;
import by.bsu.web.dao.StudentDao;
import by.bsu.web.entity.Mark;
import by.bsu.web.entity.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class MarkCommand implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        String name=req.getParameter("name");
        String studentid=req.getParameter("studentid");
        MarkDao dao = new MarkDao();
        List<Mark> marks=dao.selectMark(name,studentid);
        req.setAttribute("marks",marks);
        return "WEB-INF/view/mark-list.jsp";
    }

}
