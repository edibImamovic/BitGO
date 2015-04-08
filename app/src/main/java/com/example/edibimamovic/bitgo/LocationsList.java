package com.example.edibimamovic.bitgo;

import java.util.ArrayList;

/**
 * Created by jesenko on 08.04.15..
 * -singleton-
 */
public class LocationsList {
    private static LocationsList ourInstance = new LocationsList();

    public static LocationsList getInstance() {
        return ourInstance;
    }

    private ArrayList<Location> locations;

    private LocationsList() {
        locations = new ArrayList<Location>();
    }

    /**
     * Returns a location by provided id
     * @param id of the location int
     * @return Location
     */
    public  Location getLocation(int id) {
        for (Location loc : locations) {
            if ( loc.getId() == id) {
                return loc;
            }
        }
        return null;
    }

    /**
     * Returns a location by provided name
     * @param locationName String
     * @return Location
     */
    public Location getLocation(String locationName) {
        for (Location loc : locations) {
            if ( loc.getLocationName().equals(locationName)) {
                return loc;
            }
        }
        return null;
    }

    /**
     * Returns the id for the next Location
     * @return
     */
    public int getNextId() {
        if (locations.size() == 0){
            return locations.size() + 1;
        }
        return locations.size() + 2;
    }

}
