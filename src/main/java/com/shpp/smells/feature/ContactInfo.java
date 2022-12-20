package com.shpp.smells.feature;

public class ContactInfo {




    public String GetStreetName() {
        return "1 Medison Square";
    }

    public String GetCity() {
        return "NewYork";
    }

    public String GetState() {
        return "NY";
    }

    public String GetFullAddress()
    {
        String city = GetCity();
        String state = GetState();
        String streetName = GetStreetName();
        return streetName + ";" + city + ";" + state;
    }

}

