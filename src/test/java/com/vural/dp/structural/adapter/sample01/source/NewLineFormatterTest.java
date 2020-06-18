package com.vural.dp.structural.adapter.sample01.source;

import com.vural.dp.structural.adapter.sample01.adaptee.CsvFormattable;
import com.vural.dp.structural.adapter.sample01.adaptee.CsvFormatter;
import com.vural.dp.structural.adapter.sample01.csvadapter.CsvAdapterImpl;
import org.junit.Test;

public class NewLineFormatterTest {

    @Test
    public void testFormatText() {
        String testString = " Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable newLineFormatter = new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);

        CsvFormattable csvFormatter = new CsvFormatter();
        TextFormattable csvAdapter = new CsvAdapterImpl(csvFormatter);
        String resultCsvString = csvAdapter.formatText(testString);
        System.out.println(resultCsvString);

    }

}