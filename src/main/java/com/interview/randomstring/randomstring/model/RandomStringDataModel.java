package com.interview.randomstring.randomstring.model;

import java.util.List;


public class RandomStringDataModel {

    private String status;
    private List<String> data;
    private MetaData metaData;

    // Getters and Setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    // Nested class for MetaData
    public static class MetaData {
        private String version;
        private String uuid;
        private int numberOfLines;
        private int length;

        // Getters and Setters

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public int getNumberOfLines() {
            return numberOfLines;
        }

        public void setNumberOfLines(int numberOfLines) {
            this.numberOfLines = numberOfLines;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
    }
}
