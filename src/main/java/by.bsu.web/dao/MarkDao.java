package by.bsu.web.dao;

import by.bsu.web.entity.Mark;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MarkDao {

    public Mark findById(int id) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.create()){
            PreparedStatement statement = connection
                    .prepareStatement("select * from mark where id = ?");
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();

            List<Mark> marks = map(resultSet);
            return marks.size() == 1 ? marks.get(0) : null;

        }
    }
    public List<Mark> findAll() throws SQLException{
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection connection = factory.create()) {
            PreparedStatement statement = connection.prepareStatement("select id,studentid,name,java,aws,decesiontrees,english,computervision from mark");
            ResultSet resultSet = statement.executeQuery();
            return map(resultSet);
        }
    }
    public  List<Mark> selectMark(String name,String studentid) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection connection =factory.create()) {
            String sql="select * from mark";
            if (name!=""&& studentid!=""){
                sql +=" where name = ? and studentid = ?";
            }
            else if (name==""&& studentid!=""){
                sql += " where studentid=?";
            }
            else if (name!=""&& studentid==""){
                sql += " where name=? ";
            }
            else{
                sql += " where name <> '' and studentid <> ''";
            }
            PreparedStatement statement = connection.prepareStatement(sql);
            if (name!=""&& studentid!=""){
                statement.setString(1, name);
                statement.setString(2, studentid);
            }
            else if (name==""&& studentid!=""){
                statement.setString(1, studentid);
            }
            else if (name!=""&& studentid==""){
                statement.setString(1, name);
            }
            ResultSet resultSet = statement.executeQuery();
            return  map(resultSet);
        }
    }
    public void save(Mark mark) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.create()) {
            PreparedStatement statement = connection.prepareStatement("insert into student(name,studentid,java,aws,decesiontrees,english,computervision) values (?,?,?,?,?,?,?) ");
            statement.setString(1, mark.getName());
            statement.setString(2, mark.getStudentid());
            statement.setString(3, mark.getJava());
            statement.setString(4, mark.getAws());
            statement.setString(5, mark.getDecisiontrees());
            statement.setString(6, mark.getEnglish());
            statement.setString(7, mark.getComputervision());
            statement.executeUpdate();
        }

    }


    public List<Mark> map(ResultSet resultSet) throws  SQLException{
        List<Mark> marks = new ArrayList<>();
        while (resultSet.next()){
            Integer id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String studentid = resultSet.getString("studentid");
            String java = resultSet.getString("java");
            String aws= resultSet.getString("aws");
            String decesiontrees= resultSet.getString("decisiontrees");
            String english= resultSet.getString("english");
            String computervision= resultSet.getString("computervision");
            Mark mark = new Mark(id,studentid, name, java,aws,decesiontrees,english,computervision );
            marks.add(mark);
        }
        return marks;
    }
}
