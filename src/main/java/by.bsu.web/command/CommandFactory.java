package by.bsu.web.command;

public class CommandFactory {
    public Command create(String command){
        switch (command){
            case "login":
                return new LoginCommand();
            case "logout":
                return new LogoutCommand();
            case "bookList":
                return new BookListCommand();
            case "addBook":
                return new AddBookCommant();
            case "addBookCommand":
                return new AddBookPage();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
