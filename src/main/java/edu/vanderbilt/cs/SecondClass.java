package edu.vanderbilt.cs;

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
