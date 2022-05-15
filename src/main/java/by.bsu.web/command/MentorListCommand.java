package by.bsu.web.command;

import by.bsu.web.dao.MentorDao;
import by.bsu.web.entity.Mentor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class MentorListCommand implements Command{
    @Override
    public String execute(HttpServletRequest reg, HttpServletResponse resp)
            throws SQLException{
        MentorDao dao = new MentorDao();
        List<Mentor> mentors = dao.findAll();
        reg.setAttribute("mentors",mentors);
        return "WEB-INF/view/mentor-list.jsp";
    }
}