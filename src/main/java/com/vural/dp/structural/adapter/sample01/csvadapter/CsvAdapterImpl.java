package com.vural.dp.structural.adapter.sample01.csvadapter;

import com.vural.dp.structural.adapter.sample01.adaptee.CsvFormattable;
import com.vural.dp.structural.adapter.sample01.source.TextFormattable;

public class CsvAdapterImpl implements TextFormattable {

    CsvFormattable csvFormatter;

    public CsvAdapterImpl(CsvFormattable csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        return csvFormatter.formatCsvText(text);
    }
}
