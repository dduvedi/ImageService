package com.asset.library.services.interfaces;

import com.asset.library.model.ImageResponse;

public interface ImageService {
    ImageResponse getImageByKey(String key, Long timestamp);
}
