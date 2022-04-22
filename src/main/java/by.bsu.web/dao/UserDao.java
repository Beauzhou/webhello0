package by.bsu.web.dao;

import java.sql.*;

import by.bsu.web.entity.Student;
import by.bsu.web.entity.User;

public class UserDao {

    public User login(String login, String password) throws SQLException, ClassNotFoundException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.create();

        PreparedStatement statement = connection.prepareStatement("select * from user where login= ?  and password = ? ");
        statement.setString(1, login);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            return new User(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("login"),
                    resultSet.getString("password"),
                    resultSet.getInt("is_admin"));
        }
        return null;
    }

    public void register(User user) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.create()) {
            PreparedStatement statement = connection.prepareStatement("insert into user(name,login,password,is_admin) values (?,?,?,?) ");
            statement.setString(1, user.getName());
            statement.setString(2, user.getLogin());
            statement.setString(3, user.getPassword());
            statement.setInt(4, user.getIs_admin());
            statement.executeUpdate();
        }
    }
}
