package com.theironyard.androidcontacts;

/**
 * Created by lee on 9/15/16.
 */
public class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        String s = String.format("%s, %s", name, phone);
        return s;
    }
}
