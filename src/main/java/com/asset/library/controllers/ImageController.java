package com.asset.library.controllers;

import com.asset.library.services.interfaces.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/assets")
public class ImageController {

    @Autowired
    ImageService imageService;

    @RequestMapping(value = "/image", method = RequestMethod.GET)
    public Object getImageByKey(@RequestParam(name = "key", required = false) String key,
                                       @RequestParam(name = "updatedOn", required = false) Long updatedOn) {
        return imageService.getImageByKey(key, updatedOn);
    }
}
