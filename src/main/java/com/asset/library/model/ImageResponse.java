package com.asset.library.model;

public class ImageResponse {
    private String key;
    private String url;
    private Long updateOn;

    public ImageResponse(String key, String url, Long updateOn) {
        this.key = key;
        this.url = url;
        this.updateOn = updateOn;
    }

    public String getKey() {
        return key;
    }

    public String getUrl() {
        return url;
    }

    public Long getUpdateOn() {
        return updateOn;
    }
}
