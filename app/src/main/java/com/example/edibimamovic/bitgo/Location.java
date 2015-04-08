package com.example.edibimamovic.bitgo;

import android.content.res.Resources;

/**
 * Created by jesenko on 08.04.15..
 */
public class Location {

    private int id = 1;
    private String mLocation;
    private String mStation;
    private double mLatitude;
    private double mLongitude;

    public Location() {
        mLocation = Resources.getSystem().getString(R.string.new_location);
        mStation = Resources.getSystem().getString(R.string.new_station);
        mLatitude = 0;
        mLongitude = 0;
        id = LocationsList.getInstance().getNextId();

    }

    public Location(String location, String station, double latitude, double longitude) {
        mLocation =location;
        mStation = station;
        mLatitude = latitude;
        mLongitude = longitude;
        id = LocationsList.getInstance().getNextId();
    }

    public String getLocationName() {
        return mLocation;
    }

    public void setLocationName(String location) {
        mLocation = location;
    }

    public String getStationName() {
        return mStation;
    }

    public void setStationName(String station) {
        mStation = station;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double latitude) {
        mLatitude = latitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double longitude) {
        mLongitude = longitude;
    }

    public int getId() {
        return id;
    }
}
