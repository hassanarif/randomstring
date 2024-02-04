package com.interview.randomstring.randomstring.model;

import java.util.UUID;

public class MetaData {

    private final String version;
    private final String uuid;
    private final int numberOfLines;
    private final int length;

    public MetaData(String version, int numberOfLines, int length) {
        this.version = version;
        this.uuid = UUID.randomUUID().toString();
        this.numberOfLines = numberOfLines;
        this.length = length;
    }

    public String getVersion() {
        return version;
    }

    public String getUuid() {
        return uuid;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public int getLength() {
        return length;
    }
}
