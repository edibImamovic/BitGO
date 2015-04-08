package com.example.edibimamovic.bitgo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SelectActivity extends ActionBarActivity implements AdapterView.OnItemSelectedListener {

    private String mSelectedStation;
    private int mStations;

    String[] arr;
    ArrayList<String> arr2;

    ArrayAdapter<String> adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arr =    getResources().getStringArray(R.array.stations);
        arr2 = new ArrayList<String>();
        for(String s : arr){
            arr2.add(s);
        }

        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        List<String> listArr = Arrays.asList(arr);
        Collections.sort(listArr);
        String[] newArr = (String[]) listArr.toArray();
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);





        for(String s : arr){
            Log.e("TAGG", s);
        }




        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr2);

        Collections.sort(arr2);
        String[] newArr2 = (String[]) listArr.toArray();
        spinner2.setAdapter(adapter2);


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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(mSelectedStation != null){
            adapter2.add(mSelectedStation);
        }

        mSelectedStation = parent.getItemAtPosition(position).toString();
        Log.d("TESTTAG", mSelectedStation);

        // String selected = adapter2.getItem(position);
        adapter2.remove(mSelectedStation);

        Collections.sort(arr2);
        adapter2.notifyDataSetChanged();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
