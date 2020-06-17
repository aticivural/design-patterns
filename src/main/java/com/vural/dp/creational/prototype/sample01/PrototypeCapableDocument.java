package com.vural.dp.creational.prototype.sample01;

public abstract class PrototypeCapableDocument implements Cloneable {

    private String vendorName;
    private String content;

    public String getVendorName() {
        return vendorName;
    }

    public PrototypeCapableDocument setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    public String getContent() {
        return content;
    }

    public PrototypeCapableDocument setContent(String content) {
        this.content = content;
        return this;
    }

    public abstract PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException;
}
