package by.bsu.web.dao;

import by.bsu.web.entity.Mentor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MentorDao {

    public Mentor findById(int id) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.create()){
            PreparedStatement statement = connection
                    .prepareStatement("select * from mentor where id = ?");
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();

            List<Mentor> mentors = map(resultSet);

            return mentors.size() == 1 ? mentors.get(0) : null;

        }
    }
    public List<Mentor> findAll() throws SQLException{
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.create()) {
            PreparedStatement statement = connection.prepareStatement("select id,name,profession,description from mentor");
            ResultSet resultSet = statement.executeQuery();
            return map(resultSet);
        }
    }
    public void save(Mentor mentor) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.create()) {
            PreparedStatement statement = connection.prepareStatement("insert into mentor(name,profession,description) values (?,?,?) ");
            statement.setString(1, mentor.getName());
            statement.setString(2, mentor.getProfession());
            statement.setString(3, mentor.getDescription());
            statement.executeUpdate();
        }

    }
    public void deleteStudent(Integer id) throws SQLException, ClassNotFoundException {
        ConnectionFactory factory =new ConnectionFactory();
        Connection connection =factory.create();
        PreparedStatement statement = connection.prepareStatement("delete   from mentor where id =?");
        statement.setInt(1,id);
        statement.executeUpdate();
    }

    public void upgradeMentor(Mentor mentor) throws SQLException, ClassNotFoundException {
        ConnectionFactory factory =new ConnectionFactory();
        Connection connection =factory.create();
        PreparedStatement statement = connection.prepareStatement("update student set name =?,profession =?,description=? where id =?");
        statement.setString(1, mentor.getName());
        statement.setString(2, mentor.getProfession());
        statement.setString(3, mentor.getDescription());
        statement.setInt(4,mentor.getId());
        statement.executeUpdate();
    }
    public List<Mentor> map(ResultSet resultSet) throws  SQLException{
        List<Mentor> mentors = new ArrayList<>();
        while (resultSet.next()){
            Integer id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String profession = resultSet.getString("profession");
            String description= resultSet.getString("description");
            Mentor mentor = new Mentor(id, name, profession, description);
            mentors.add(mentor);
        }
        return mentors;
    }
}
