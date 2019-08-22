package edu.vanderbilt.cs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class SecondClass {
    private String type;

    SecondClass() {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";
        Car car = gson.fromJson(json, Car.class);
        type = car.brand;
    }

    String getType() {
        return type;
    }
}
