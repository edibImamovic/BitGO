package com.example.edibimamovic.bitgo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class Location_activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);


        Intent settingsActivity = getIntent();

        String location = settingsActivity.getStringExtra("EXTRA_LOCATION");
        String station = settingsActivity.getStringExtra("EXTRA_STATION");
        double latitude = settingsActivity.getDoubleExtra("EXTRA_LATITUDE", 0);
        double longitude = settingsActivity.getDoubleExtra("EXTRA_LONGITUDE", 0);

        TextView intentMessage = (TextView) findViewById(R.id.location_name);
        intentMessage.setText(location);

        intentMessage = (TextView) findViewById(R.id.station_name);
        intentMessage.setText(station);

        EditText coordinates = (EditText) findViewById(R.id.latitude);
        coordinates.setText(Double.toString(latitude));

        coordinates = (EditText) findViewById(R.id.longitude);
        coordinates.setText(Double.toString(longitude));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_locations, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
