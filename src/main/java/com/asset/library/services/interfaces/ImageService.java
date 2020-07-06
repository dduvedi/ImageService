package com.asset.library.services.interfaces;

import com.asset.library.model.ImageResponse;

public interface ImageService {
    Object getImageByKey(String key, Long updatedOn);
}
