package by.bsu.web.command;


public class CommandFactory {
    public Command create(String command){
        switch (command){
            case "login":
                return new LoginCommand();
            case "logout":
                return new LogoutCommand();
            case "studentList":
                return new StudentListCommand();
            case "mentorList":
                return new MentorListCommand();
            case "addStudent":
                return new AddStudentCommant();
            case "addStudentCommand":
                return new AddStudentPage();
            case "register":
                return new RegisterCommand();
            case "registerCommand":
                return new RegisterPage();
            case "deleteStudent":
                return new DeleteStudent();
            case "upgradeStudents":
                return new UpgradeStudents();
            case "upgradeStudentMain":
                return new UpgradeStudentMain();
            case "main":
                return new MainCommand();

            default:
                throw new UnsupportedOperationException();
        }
    }
}
