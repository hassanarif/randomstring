package com.interview.randomstring.randomstring.model;

public class ApiResponse {
    private String status;
    private String[] data;
    private MetaData metaData;

    public ApiResponse(String status, String[] data, MetaData metaData) {
        this.status = status;
        this.data = data;
        this.metaData = metaData;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

}
