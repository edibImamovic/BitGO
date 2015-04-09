package com.example.gordansajevic.bitgo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import models.Transport;


public class BerlinActivity extends ActionBarActivity {

    private Button mBer_tram;
    private Button mBer_trol;
    private Button mBer_bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berlin);

        final Transport tramvaj = new Transport();
        tramvaj.setId(1);
        tramvaj.setName("Strassenbahn");
        tramvaj.setLines(new String[]{"Linija1", "Linija2", "Linija3"});

        final Transport trolejbus = new Transport();
        trolejbus.setId(2);
        trolejbus.setName("Obus");
        trolejbus.setLines(new String[]{"Linija1", "Linija2", "Linija3"});

        final Transport autobus = new Transport();
        autobus.setId(3);
        autobus.setName("Autobuss");
        autobus.setLines(new String[]{"Linija1", "Linija2", "Linija3"});

        mBer_tram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BerlinActivity.this, Lines.class);
                String[] transportation = tramvaj.getLines();
                intent.putExtra("lines", transportation);
                startActivity(intent);

            }
        });

        mBer_trol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BerlinActivity.this, Lines.class);
                String[] transportation = trolejbus.getLines();
                intent.putExtra("lines", transportation);
                startActivity(intent);

            }
        });

        mBer_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BerlinActivity.this, Lines.class);
                String[] transportation = autobus.getLines();
                intent.putExtra("lines", transportation);
                startActivity(intent);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_berlin, menu);
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
