package com.lei.bbs.bean;

public class Response {

    private int userId;
    private String userName;
    private String sex;

    private String status;
    private String result;
    private String level;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                '}';
    }
}
/*  public Repository(String name, String language, Owner owner) {
        this.name = name;
        this.language = language;
        this.owner = owner;
    }

    public String fullName() {
        return owner.username + "/" + name;
    }*/