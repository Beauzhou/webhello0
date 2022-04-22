package by.bsu.web.dao;

import by.bsu.web.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public Student findById(int id) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.create()){
            PreparedStatement statement = connection
                    .prepareStatement("select * from student where id = ?");
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();

            List<Student> students = map(resultSet);

            return students.size() == 1 ? students.get(0) : null;

        }
    }
    public List<Student> findAll() throws SQLException{
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection connection = factory.create()) {
            PreparedStatement statement = connection.prepareStatement("select id,name,studentid,major,mentor,gender,telephone from student");
            ResultSet resultSet = statement.executeQuery();
            return map(resultSet);
        }
    }
    public void save(Student student) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.create()) {
            PreparedStatement statement = connection.prepareStatement("insert into student(name,studentid,major,mentor,gender,telephone) values (?,?,?,?,?,?) ");
            statement.setString(1, student.getName());
            statement.setString(2, student.getStudentid());
            statement.setString(3, student.getMajor());
            statement.setString(4, student.getMentor());
            statement.setString(5, student.getGender());
            statement.setString(6, student.getTelephone());
            statement.executeUpdate();
        }

    }
    public void deleteStudent(Integer id) throws SQLException, ClassNotFoundException {
        ConnectionFactory factory =new ConnectionFactory();
        Connection connection =factory.create();
        PreparedStatement statement = connection.prepareStatement("delete   from student where id =?");
        statement.setInt(1,id);
        statement.executeUpdate();
    }

    public void upgradeStudent(Student student) throws SQLException, ClassNotFoundException {
        ConnectionFactory factory =new ConnectionFactory();
        Connection connection =factory.create();
        PreparedStatement statement = connection.prepareStatement("update student set name =?,studentid =?,major=?,mentor=?,gender=?,telephone =? where id =?");
        statement.setString(1,student.getName());
        statement.setString(2,student.getStudentid());
        statement.setString(3,student.getMajor());
        statement.setString(4,student.getMentor());
        statement.setString(5,student.getGender());
        statement.setString(6,student.getTelephone());
        statement.setInt(7,student.getId());
        statement.executeUpdate();
    }
    public List<Student> map(ResultSet resultSet) throws  SQLException{
        List<Student> students = new ArrayList<>();
        while (resultSet.next()){
            Integer id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String studentid = resultSet.getString("studentid");
            String major= resultSet.getString("major");
            String mentor= resultSet.getString("mentor");
            String gender= resultSet.getString("gender");
            String telephone= resultSet.getString("telephone");
            Student student = new Student(id, name, studentid, major,mentor, gender,telephone );
            students.add(student);
        }
        return students;
    }
}
