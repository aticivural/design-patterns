package com.vural.dp.creational.prototype.sample01;

public class NonDisclosureAgreement extends PrototypeCapableDocument {

    private AuthorizedSignatory authorizedSignatory;

    public AuthorizedSignatory getAuthorizedSignatory() {
        return authorizedSignatory;
    }

    public NonDisclosureAgreement setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
        this.authorizedSignatory = authorizedSignatory;
        return this;
    }

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        /*clone with deep copy*/
        NonDisclosureAgreement nda = (NonDisclosureAgreement) super.clone();
        AuthorizedSignatory clonedAuthorizedSignatory = (AuthorizedSignatory) nda.getAuthorizedSignatory().clone();
        nda.setAuthorizedSignatory(clonedAuthorizedSignatory);
        return nda;
    }

    @Override
    public String toString() {
        return "[NDAgreement: Vendor Name - " + getVendorName() + ", Content - " + getContent() + ", Authorized Signatory - " + getAuthorizedSignatory() + "]";
    }
}
