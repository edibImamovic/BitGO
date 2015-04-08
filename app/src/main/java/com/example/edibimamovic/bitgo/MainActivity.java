package com.example.edibimamovic.bitgo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent it = new Intent(this, Location_activity.class);

    /* Location activity
        it.putExtra("EXTRA_LOCATION", Location.getInstance().getLocation());
        it.putExtra("EXTRA_STATION", Location.getInstance().getStation());
        it.putExtra("EXTRA_LATITUDE", Location.getInstance().getLatitude());
        it.putExtra("EXTRA_LONGITUDE", Location.getInstance().getLongitude



          it.putExtra("EXTRA_LOCATION", "IUS");
        it.putExtra("EXTRA_STATION", "Ilidza");
        it.putExtra("EXTRA_LATITUDE", 48.4668748);
        it.putExtra("EXTRA_LONGITUDE", 21.658742);

        startActivity(it);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
