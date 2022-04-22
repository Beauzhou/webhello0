package by.bsu.web.command;

import by.bsu.web.dao.StudentDao;
import by.bsu.web.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


public class UpgradeStudentMain implements Command{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException, ServletException, IOException {

        StudentDao dao =new StudentDao();

        System.out.println("aaaaaa");
        int id=Integer.parseInt(req.getParameter("id"));
        System.out.println(id);
        String name = req.getParameter("name");
        String studentid = req.getParameter("studentid");
        String major = req.getParameter("major");
        String mentor = req.getParameter("mentor");
        String gender = req.getParameter("gender");
        String telephone = req.getParameter("telephone");
        Student student =new Student(id,name,studentid,mentor,major,gender,telephone);
        dao.upgradeStudent(student);
        req.setAttribute("message", "Update Success");
        req.getRequestDispatcher("controller?command=studentList").forward(req, resp);
        return null;
    }
}
