package com.example.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONExporter {
    
    public String convertToJson(Object object) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        String stringJson = gson.toJson(object);
        return stringJson;
    }
}
