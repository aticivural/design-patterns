package com.vural.dp.creational.prototype.sample01;

import org.junit.Test;


public class DocumentPrototypeManagerTest {

    @Test
    public void testGetClonedDocument() {
        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);

        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);
    }

}