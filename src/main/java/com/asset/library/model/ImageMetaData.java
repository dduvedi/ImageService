package com.asset.library.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ImageMetaData {
    private String key;
    private String url;
    private Long updateOn;

    public ImageMetaData(String key, String url, Long updateOn) {
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

    @JsonIgnore
    public Long getUpdateOn() {
        return updateOn;
    }
}
