package com.asset.library.configuration;

import com.asset.library.model.ImageMetaData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ConfigLocalData {

    @Bean
    public Map<String, ImageMetaData> imageMap() {
        Map<String, ImageMetaData> imageMap = new HashMap<>();
        imageMap.put("BOB", new ImageMetaData("BOB", "https://img.techpowerup.org/200703/bank-of-baroda.png", new Date().getTime()));
        imageMap.put("DBS", new ImageMetaData("DBS", "https://img.techpowerup.org/200703/dbs-bank.png", new Date().getTime()));
        imageMap.put("ICICI", new ImageMetaData("ICICI", "https://img.techpowerup.org/200703/icici-bank.png", new Date().getTime()));

        return imageMap;
    }
}
