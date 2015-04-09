package com.example.gordansajevic.bitgo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.Button;

import models.Transport;


public class SarajevoActivity extends ActionBarActivity {



    private Button mSar_tram;
    private Button mSar_trol;
    private Button mSar_bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarajevo);

        final Transport tramvaj = new Transport();
        tramvaj.setId(1);
        tramvaj.setName("Tramvaj");
        tramvaj.setLines(new String[]{"Linija1", "Linija2", "Linija3"});

        final Transport trolejbus = new Transport();
        trolejbus.setId(2);
        trolejbus.setName("Trolejbus");
        trolejbus.setLines(new String[]{"Linija1", "Linija2", "Linija3"});

        final Transport autobus = new Transport();
        autobus.setId(3);
        autobus.setName("Autobus");
        autobus.setLines(new String[]{"Linija1", "Linija2", "Linija3"});

        mSar_tram = (Button)  findViewById(R.id.sar_tram);
        mSar_trol = (Button) findViewById(R.id.sar_trol);
        mSar_bus = (Button)  findViewById(R.id.sar_bus);

        mSar_tram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(SarajevoActivity.this, Lines.class);
                String[] transportation = tramvaj.getLines();
                intent.putExtra("lines", transportation);
                startActivity(intent);

            }
        });

        mSar_trol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SarajevoActivity.this, Lines.class);
                String[] transportation = trolejbus.getLines();
                intent.putExtra("lines", transportation);
                startActivity(intent);

            }
        });

        mSar_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SarajevoActivity.this, Lines.class);
                String[] transportation = autobus.getLines();
                intent.putExtra("lines", transportation);
                startActivity(intent);

            }
        });
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
