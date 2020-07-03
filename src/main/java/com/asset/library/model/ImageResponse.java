package com.asset.library.model;

public class ImageResponse {
    private String key;
    private String value;
    private Long time;

    public ImageResponse(String key, String value, Long time) {
        this.key = key;
        this.value = value;
        this.time = time;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Long getTime() {
        return time;
    }
}
