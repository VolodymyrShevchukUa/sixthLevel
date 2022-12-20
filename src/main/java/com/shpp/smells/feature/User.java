package com.shpp.smells.feature;

public class User {

    private ContactInfo _contactInfo;

    User(ContactInfo contactInfo)
    {
        _contactInfo = contactInfo;
    }


    public static void main(String[] args) {
        ContactInfo contactInfo = new ContactInfo();
        User user = new User(contactInfo);
        System.out.println(user._contactInfo.GetFullAddress()); 
    }
}

