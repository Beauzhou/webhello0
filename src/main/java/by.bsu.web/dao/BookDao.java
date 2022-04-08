package by.bsu.web.dao;

import by.bsu.web.entity.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public Book findById(int id) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.create()){
            PreparedStatement statement = connection
                    .prepareStatement("select id,name from book where id = ?");
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();

            List<Book> books = map(resultSet);

            return books.size() == 1 ? books.get(0) : null;

        }
    }
    public List<Book> findAll() throws SQLException{
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection connection = factory.create()) {
            PreparedStatement statement = connection.prepareStatement("select id,name from book");
            ResultSet resultSet = statement.executeQuery();
            return map(resultSet);
        }
    }
    public void save(Book book) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.create()) {
            PreparedStatement statement = connection.prepareStatement("insert into book(name) values (?) ");
            statement.setString(1, book.getName());
            statement.executeUpdate();
        }

    }
    public List<Book> map(ResultSet resultSet) throws  SQLException{
        List<Book> books = new ArrayList<>();
        while (resultSet.next()){
            Integer id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            Book book = new Book(id ,name);
            books.add(book);
        }
        return books;
    }
}
