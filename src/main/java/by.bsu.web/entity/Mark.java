package by.bsu.web.entity;

public class Mark {
    private Integer id;
    private String studentid;
    private String name;
    private String java;
    private String aws;
    private String decisiontrees;
    private String english;
    private String computervision;

    public Mark(Integer id, String studentid, String name, String java, String aws, String decisiontrees, String english, String computervision) {
        this.id = id;
        this.studentid = studentid;
        this.name = name;
        this.java = java;
        this.aws = aws;
        this.decisiontrees = decisiontrees;
        this.english = english;
        this.computervision = computervision;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getAws() {
        return aws;
    }

    public void setAws(String aws) {
        this.aws = aws;
    }

    public String getDecisiontrees() {
        return decisiontrees;
    }

    public void setDecisiontrees(String decisiontrees) {
        this.decisiontrees = decisiontrees;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getComputervision() {
        return computervision;
    }

    public void setComputervision(String computervision) {
        this.computervision = computervision;
    }
}
