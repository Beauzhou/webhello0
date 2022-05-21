package by.bsu.web.command;

import by.bsu.web.dao.StudentDao;
import by.bsu.web.entity.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class SelectCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        String name=req.getParameter("name");
        String major=req.getParameter("major");
        StudentDao dao = new StudentDao();
        List<Student> students=dao.selectStudent(name,major);
        req.setAttribute("students",students);
        return "WEB-INF/view/student-list.jsp";
    }
}