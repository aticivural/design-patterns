package com.vural.dp.structural.proxy.sample01.proxy;

import org.junit.Test;

public class ReportGeneratorImplProxyTest {

    @Test
    public void testGenerateReport() {
        Role accessRole = new Role();
        accessRole.setRole("Manager");

        ReportGenerator proxy = new ReportGeneratorImplProxy(accessRole);
        proxy.displayReportTemplate("pdf", 150);
        proxy.generateComplexReport("pdf", 150);
        proxy.generateSensitiveReport();
    }

}