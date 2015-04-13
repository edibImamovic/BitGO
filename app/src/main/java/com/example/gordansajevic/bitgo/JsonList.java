package com.example.gordansajevic.bitgo;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import models.Transport;



/**
 * Created by gordansajevic on 10/04/15.
 */
public class JsonList {

    RequestQueue rq;

    JSONArray jsonArray;

    protected void getTransport(String url){
        rq.add(new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray jsonArray) {
                Transport[] array = new Transport[jsonArray.length()];
                try {
                    for (int i = 0; i < jsonArray.length(); i++) {
                        Transport newTransport = new Transport();
                        JSONObject object = jsonArray.getJSONObject(i);
                        newTransport.setId(object.getInt("id"));
                        newTransport.setName(object.getString("name"));
                        array[i] = newTransport;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            }, new Response.ErrorListener(){
                @Override
                public void onErrorResponse(VolleyError error){
                    error.printStackTrace();

                }
        }));
    }

}
