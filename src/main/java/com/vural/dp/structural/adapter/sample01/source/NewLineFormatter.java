package com.vural.dp.structural.adapter.sample01.source;

public class NewLineFormatter implements TextFormattable {
    @Override
    public String formatText(String text) {
        return text.replace(".", "\n");
    }
}
