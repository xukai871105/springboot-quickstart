package com.example.student;

/**
 * @author xukai
 */

import java.util.Date;

public class StudentDO {
    private Long id;
    private String name;
    private String sex;
    private Date birthday;
    private String department;
    private String birthplace;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @Override
    public String toString() {
        return "StudentDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", department='" + department + '\'' +
                ", birthplace='" + birthplace + '\'' +
                '}';
    }
}
