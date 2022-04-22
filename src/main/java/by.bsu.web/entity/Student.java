package by.bsu.web.entity;

public class Student {
    private Integer id;
    private String name;
    private String studentid;
    private String major;
    private String mentor;
    private String gender;
    private String telephone;

    public Student(Integer id, String name, String studentid, String major, String mentor, String gender, String telephone) {
        this.id = id;
        this.name = name;
        this.studentid = studentid;
        this.major = major;
        this.mentor = mentor;
        this.gender = gender;
        this.telephone = telephone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}



