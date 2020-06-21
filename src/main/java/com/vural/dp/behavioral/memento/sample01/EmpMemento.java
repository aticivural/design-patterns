package com.vural.dp.behavioral.memento.sample01;

public class EmpMemento {

    private int id;
    private String name;
    private String phoneNo;
    private String designation;

    public EmpMemento(int id, String name, String phoneNo, String designation) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Current Memento State" + this.id + " , " + this.name + " , " + this.phoneNo + " , " + this.designation;
    }
}
