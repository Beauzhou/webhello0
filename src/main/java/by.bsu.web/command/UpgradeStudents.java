package by.bsu.web.command;

import by.bsu.web.dao.StudentDao;
import by.bsu.web.entity.Student;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;



public class UpgradeStudents implements Command{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException {
        int id=Integer.parseInt(req.getParameter("id"));
        System.out.println(id);
        StudentDao dao = new StudentDao();
        Student student = dao.findById(id);
        req.setAttribute("student",student);
        return "WEB-INF/view/upgrade-student.jsp";
    }
}
