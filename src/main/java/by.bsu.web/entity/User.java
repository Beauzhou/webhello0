package by.bsu.web.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String name;
    private String login;
    private String password;
    private Integer is_admin;

    public User(Integer id, String name, String login, String password, Integer is_admin) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.is_admin = is_admin;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Integer is_admin) {
        this.is_admin = is_admin;
    }
}
