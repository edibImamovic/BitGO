package com.example.gordansajevic.bitgo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import models.Transport;


public class LondonActivity extends ActionBarActivity {

    private Button mLon_tram;
    private Button mLon_trol;
    private Button mLon_bus;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_london);

        final Transport tramvaj = new Transport();
        tramvaj.setId(1);
        tramvaj.setName("Tram");
        tramvaj.setLines(new String[]{"Linija1", "Linija2", "Linija3"});

        final Transport trolejbus = new Transport();
        trolejbus.setId(2);
        trolejbus.setName("Trolly");
        trolejbus.setLines(new String[]{"Linija1", "Linija2", "Linija3"});

        final Transport autobus = new Transport();
        autobus.setId(3);
        autobus.setName("Bus");
        autobus.setLines(new String[]{"Linija1", "Linija2", "Linija3"});

        mLon_tram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LondonActivity.this, Lines.class);
                String[] transportation = tramvaj.getLines();
                intent.putExtra("lines", transportation);
                startActivity(intent);
            }
        });

        mLon_trol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LondonActivity.this, Lines.class);
                String[] transportation = trolejbus.getLines();
                intent.putExtra("lines", transportation);
                startActivity(intent);
            }
        });

        mLon_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LondonActivity.this, Lines.class);
                String[] transportation = autobus.getLines();
                intent.putExtra("lines", transportation);
                startActivity(intent);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_london, menu);
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
