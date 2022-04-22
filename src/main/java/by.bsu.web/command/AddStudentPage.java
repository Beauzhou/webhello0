package by.bsu.web.command;

import by.bsu.web.dao.StudentDao;
import by.bsu.web.entity.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class AddStudentPage implements Command{
    @Override
    public String execute(HttpServletRequest reg, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        StudentDao dao =new StudentDao();
        String name=reg.getParameter("name");
        String studentid=reg.getParameter("studentid");
        String major=reg.getParameter("major");
        String mentor=reg.getParameter("mentor");
        String gender=reg.getParameter("gender");
        String telephone=reg.getParameter("telephone");
        Student student =new Student(null,name,studentid,major,mentor,gender,telephone);
        dao.save(student);
        return "WEB-INF/view/main.jsp";
    }
}
