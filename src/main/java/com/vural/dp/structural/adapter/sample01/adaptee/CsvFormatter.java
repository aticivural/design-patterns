package com.vural.dp.structural.adapter.sample01.adaptee;

public class CsvFormatter implements CsvFormattable {
    @Override
    public String formatCsvText(String text) {
        return text.replace(".", ",");
    }
}
