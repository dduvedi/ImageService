package com.asset.library.controllers;

import com.asset.library.model.ImageResponse;
import com.asset.library.services.interfaces.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/image")
public class ImageController {

    @Autowired
    ImageService imageService;

    @RequestMapping(value = "/{key}", method = RequestMethod.GET)
    public ImageResponse getImageByKey(@PathVariable("key") String key,
                                       @RequestParam(name = "timestamp", required = false) Long timestamp) {
        return imageService.getImageByKey(key, timestamp);
    }
}
