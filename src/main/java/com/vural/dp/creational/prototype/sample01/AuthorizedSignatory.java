package com.vural.dp.creational.prototype.sample01;

public class AuthorizedSignatory implements Cloneable {

    private String name;
    private String designation;

    public String getName() {
        return name;
    }

    public AuthorizedSignatory setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesignation() {
        return designation;
    }

    public AuthorizedSignatory setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "AuthorizedSignatory{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
