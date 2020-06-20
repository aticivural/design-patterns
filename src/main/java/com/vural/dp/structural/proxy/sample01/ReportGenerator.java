package com.vural.dp.structural.proxy.sample01;

public interface ReportGenerator {
    void displayReportTemplate(String reportFormat, int reportEntries);

    void generateComplexReport(String reportFormat, int reportEntries);

    void generateSensitiveReport();
}
