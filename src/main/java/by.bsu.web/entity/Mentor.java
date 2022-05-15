package by.bsu.web.entity;

public class Mentor {
    private Integer id;
    private String name;
    private String profession;
    private String description;

    public Mentor(Integer id, String name, String profession, String description) {
        this.id = id;
        this.name = name;
        this.profession = profession;
        this.description = description;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
