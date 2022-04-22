package by.bsu.web.command;

import by.bsu.web.dao.StudentDao;
import by.bsu.web.entity.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class StudentListCommand implements Command{
    @Override
    public String execute(HttpServletRequest reg, HttpServletResponse resp)
            throws SQLException{
        StudentDao dao = new StudentDao();
        List<Student> students = dao.findAll();
        reg.setAttribute("students",students);
        return "WEB-INF/view/student-list.jsp";
    }
}
