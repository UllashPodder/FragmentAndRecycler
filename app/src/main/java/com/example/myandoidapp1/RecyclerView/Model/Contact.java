package com.example.myandoidapp1.RecyclerView.Model;

import java.util.ArrayList;
import java.util.Random;

public class Contact {
    private String contactName;
    private String contactPhoneNunber;
    private boolean isOnline;
    public Contact(String contactName, String contactPhoneNunber, boolean isOnline){
        this.contactName = contactName;
        this.contactPhoneNunber = contactPhoneNunber;
        this.isOnline = isOnline;
    }

    public String getName() {
        return contactName;
    }

    public boolean isOnline() {
        return isOnline;
    }
    private static int lastContactId = 0;
    public static ArrayList<Contact> createContactsList(int numContacts){
        ArrayList <Contact> contactList = new ArrayList<Contact>();
        for (int i = 1; i <= numContacts; i++) {
            contactList.add(new Contact("Person " + ++lastContactId, "+8801 " + getRandomNum(),i%2 == 1));
        }
        return contactList;
    }
    private static Integer getRandomNum(){
        Random r = new Random();
        int i1 = r.nextInt(9999999 - 1111111) + 1111111;
        return i1;
    }
}
