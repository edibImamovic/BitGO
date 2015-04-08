package com.example.nedzadhamzic.city.Models;

/**
 * Created by nedzadhamzic on 08/04/15.
 */
public class City {
    private int id;
    private String mName;
    private String[] typeTransport;


    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String[] typeTransport) {
        this.typeTransport = typeTransport;
    }

    @Override
    public String toString() {
        return getName();
    }



}
