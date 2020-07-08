package com.asset.library.model;

public class ImageResponse {

    private Long lastSyncedOn;
    private Object imageData;

    public ImageResponse(Long lastSyncedOn, Object metaData) {
        this.lastSyncedOn = lastSyncedOn;
        this.imageData = metaData;
    }

    public ImageResponse(ImageMetaData metaData) {
        this.imageData = metaData;
    }

    public Long getLastSyncedOn() {
        return lastSyncedOn;
    }

    public Object getImageData() {
        return imageData;
    }
}
