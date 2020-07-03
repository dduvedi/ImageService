package com.asset.library.services.interfacesimpl;

import com.asset.library.model.ImageResponse;
import com.asset.library.services.interfaces.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.asset.library.constant.Errors.INVALID_KEY;
import static com.asset.library.constant.Errors.KEY_NOT_AVAILABLE;
import static com.asset.library.utility.Utils.isStringOnlyAlphabet;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private Map<String, ImageResponse> imageMap;

    @Override
    public ImageResponse getImageByKey(String key, Long timestamp) {
        if (isStringOnlyAlphabet(key)) {
            ImageResponse imageResponse = imageMap.get(key);

            if (imageResponse == null)
                throw new IllegalArgumentException(KEY_NOT_AVAILABLE);

            if (timestamp == null || timestamp == 0)
                return imageResponse;
            else if (imageResponse.getTime() > timestamp)
                return imageResponse;

            return null;
        } else {
            throw new IllegalArgumentException(INVALID_KEY);
        }
    }
}
