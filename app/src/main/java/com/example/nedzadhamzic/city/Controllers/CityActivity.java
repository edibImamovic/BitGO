package com.example.nedzadhamzic.city.Controllers;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nedzadhamzic.city.Models.City;
import com.example.nedzadhamzic.city.R;


public class CityActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        City sarajevo = new City();
        sarajevo.setId(1);
        sarajevo.setName("Sarajevo");
        sarajevo.setTypeTransport(new String[]{"Tramvaj", "Trolejbus", "Autobus"});

        City berlin = new City();
        berlin.setId(2);
        berlin.setName("Berlin");
        berlin.setTypeTransport(new String[]{"Tramvaj", "Trolejbus", "Autobus", "Metro", "MiniBus"});

        City london = new City();
        london.setId(3);
        london.setName("London");
        london.setTypeTransport(new String[]{"Tramvaj", "Trolejbus", "Autobus", "Voz"});

        City[] cities = new City[]{sarajevo, berlin, london};

        ArrayAdapter<City> itemsAdapter =
                new ArrayAdapter<City>(this, android.R.layout.simple_dropdown_item_1line, cities);

        ListView listView = (ListView) findViewById(R.id.ourListView);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                City clicked = (City)parent.getItemAtPosition(position);
                Intent intent = new Intent(CityActivity.this, Transportation.class);
                String[] transportation = clicked.getTypeTransport();
                intent.putExtra("trans", transportation);
                startActivity(intent);

            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_city, menu);
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
