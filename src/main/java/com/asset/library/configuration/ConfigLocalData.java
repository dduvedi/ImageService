package com.asset.library.configuration;

import com.asset.library.model.ImageResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ConfigLocalData {

    @Bean
    public Map<String, ImageResponse> imageMap() {
        Map<String, ImageResponse> imageMap = new HashMap<>();
        imageMap.put("BOB", new ImageResponse("BOB", "https://img.techpowerup.org/200703/bank-of-baroda.png", new Date().getTime()));
        imageMap.put("DBS", new ImageResponse("DBS", "https://img.techpowerup.org/200703/dbs-bank.png", new Date().getTime()));
        imageMap.put("ICICI", new ImageResponse("ICICI", "https://img.techpowerup.org/200703/icici-bank.png", new Date().getTime()));

        return imageMap;
    }
}
