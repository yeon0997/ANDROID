package com.example.recyclerview;

public class Chat {
    String name;
    String num;
    String date;
    String con;

    public Chat(String name, String num, String date, String con){
        this.name = name;
        this.num = num;
        this.date = date;
        this.con = con;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }
}
