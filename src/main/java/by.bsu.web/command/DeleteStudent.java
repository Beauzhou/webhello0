package by.bsu.web.command;

import by.bsu.web.dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


public class DeleteStudent implements Command{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, ClassNotFoundException, ServletException, IOException {
        String id2 = req.getParameter("id");
        int id = Integer.parseInt(id2);
        StudentDao dao = new StudentDao();
        dao.deleteStudent(id);
        req.setAttribute("message", "delete Success");
        req.getRequestDispatcher("controller?command=studentList").forward(req, resp);
        return null;
    }
}