package com.vural.dp.behavioral.memento.sample01;

public class EmpOriginator {
    private int id;
    private String name;
    private String phoneNo;
    private String designation;

    public EmpOriginator(int id, String name, String phoneNo, String designation) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public EmpMemento saveToMemento() {
        return new EmpMemento(this.id, this.name, this.phoneNo, this.designation);
    }

    public void undoFromMemento(EmpMemento memento) {
        this.id = memento.getId();
        this.name = memento.getName();
        this.phoneNo = memento.getPhoneNo();
        this.designation = memento.getDesignation();
    }

    public void printInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Phone Number: " + this.phoneNo);
        System.out.println("Designation: " + this.designation);
    }
}
