package model;

import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dateOfBirth;
    private String code;
    private int count=0;

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count++;
    }

    public User() {
    }

    public User(String name, LocalDate dateOfBirth, String code) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", code='" + code + '\'' +
                '}';
    }
}
