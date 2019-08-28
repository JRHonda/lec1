package edu.vanderbilt.cs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class SecondClass {

    // MARK: - Properties
    private String type;

    // MARK: - Initialization
    SecondClass()
    {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";
        Car car = gson.fromJson(json, Car.class);
        type = car.brand;
    }

    // MARK: - Methods
    String getType()
    {
        return type;
    }
}
