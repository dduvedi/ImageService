package com.asset.library.services.interfacesimpl;

import com.asset.library.model.ImageResponse;
import com.asset.library.services.interfaces.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.asset.library.constant.Errors.INVALID_KEY;
import static com.asset.library.constant.Errors.KEY_NOT_AVAILABLE;
import static com.asset.library.utility.Utils.isStringOnlyAlphabet;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private Map<String, ImageResponse> imageMap;

    @Override
    public Object getImageByKey(String key, Long updatedOn) {
        if (StringUtils.isEmpty(key) && updatedOn == null)
            throw new IllegalArgumentException("Key and updatedOn both cannot be null");

        if (updatedOn != null) {
            List<ImageResponse> resp = new ArrayList<>();
            for (Map.Entry<String, ImageResponse> entry : imageMap.entrySet()) {
                if (entry.getValue().getUpdateOn() > updatedOn) {
                    resp.add(entry.getValue());
                }
            }
            return resp;
        } else if (isStringOnlyAlphabet(key)) {
            ImageResponse imageResponse = imageMap.get(key);
            if (imageResponse == null)
                throw new IllegalArgumentException(KEY_NOT_AVAILABLE);
            return imageResponse;

        } else
            throw new IllegalArgumentException(INVALID_KEY);
    }
}
