package com.example.health;

public class Customer {
    public Customer(int sno, String f_name, String l_name, int age, String email, String dob, String mobile) {
        this.sno = sno;
        this.f_name = f_name;
        this.l_name = l_name;
        this.age = age;
        this.email = email;
        this.dob = dob;
        this.mobile = mobile;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private int sno;
    private String f_name;
    private String l_name;
    private int age;
    private String email;
    private String dob;
    private String mobile;
}
