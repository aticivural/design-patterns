package com.vural.dp.creational.prototype.sample01;

public class TermsAndConditions extends PrototypeCapableDocument {
    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        /*clone with shallow copy*/
        TermsAndConditions tAndC = null;

        try {
            tAndC = (TermsAndConditions) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return tAndC;
    }

    @Override
    public String toString() {
        return "TermsAndConditions{Vendor Name -" + getVendorName() + ", Content - " + getContent() + " } ";
    }
}
