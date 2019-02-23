package com.example.appinion;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static android.R.layout.simple_spinner_item;

public class MainActivity extends AppCompatActivity {
    private String URLstring = "https://raw.githubusercontent.com/appinion-dev/intern-dcr-data/master/data.json";
    private static ProgressDialog mProgressDialog;
    private ArrayList<Data> dataArrayList;
    private ArrayList<String> names = new ArrayList<String>();
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.s1);

    }

    public void retrieveJSON(View view) {



        StringRequest stringRequest = new StringRequest(Request.Method.GET, URLstring,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.d("strrrrr", ">>" + response);

                        try {

                            JSONObject obj = new JSONObject(response);
                            if(obj.optString("status").equals("true")){

                                dataArrayList = new ArrayList<>();
                                JSONArray dataArray  = obj.getJSONArray("product_group_list");

                                for (int i = 0; i < dataArray.length(); i++) {

                                    Data pg = new Data();
                                    JSONObject dataobj = dataArray.getJSONObject(i);

                                    pg.setId(dataobj.getString("id"));
                                    pg.setProduct_group(dataobj.getString("product_group"));


                                    dataArrayList.add(pg);

                                }

                                for (int i = 0; i < dataArrayList.size(); i++){
                                    names.add(dataArrayList.get(i).getProduct_group().toString());
                                }

                                ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(MainActivity.this, simple_spinner_item, names);
                                spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                                spinner.setAdapter(spinnerArrayAdapter);


                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //displaying the error in toast if occurrs
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        // request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        requestQueue.add(stringRequest);


    }

    public void retrieveJSON2(View view) {



        StringRequest stringRequest = new StringRequest(Request.Method.GET, URLstring,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.d("strrrrr", ">>" + response);

                        try {

                            JSONObject obj = new JSONObject(response);
                            if(obj.optString("status").equals("true")){

                                dataArrayList = new ArrayList<>();
                                JSONArray dataArray  = obj.getJSONArray("literature_list");

                                for (int i = 0; i < dataArray.length(); i++) {

                                    Data pg = new Data();
                                    JSONObject dataobj = dataArray.getJSONObject(i);

                                    pg.setId(dataobj.getString("id"));
                                    pg.setProduct_group(dataobj.getString("literature"));


                                    dataArrayList.add(pg);

                                }

                                for (int i = 0; i < dataArrayList.size(); i++){
                                    names.add(dataArrayList.get(i).getProduct_group().toString());
                                }

                                ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(MainActivity.this, simple_spinner_item, names);
                                spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                                spinner.setAdapter(spinnerArrayAdapter);


                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //displaying the error in toast if occurrs
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        // request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        requestQueue.add(stringRequest);


    }


    public void retrieveJSON3(View view) {



        StringRequest stringRequest = new StringRequest(Request.Method.GET, URLstring,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.d("strrrrr", ">>" + response);

                        try {

                            JSONObject obj = new JSONObject(response);
                            if(obj.optString("status").equals("true")){

                                dataArrayList = new ArrayList<>();
                                JSONArray dataArray  = obj.getJSONArray("physician_sample_list");

                                for (int i = 0; i < dataArray.length(); i++) {

                                    Data pg = new Data();
                                    JSONObject dataobj = dataArray.getJSONObject(i);

                                    pg.setId(dataobj.getString("id"));
                                    pg.setProduct_group(dataobj.getString("sample"));


                                    dataArrayList.add(pg);

                                }

                                for (int i = 0; i < dataArrayList.size(); i++){
                                    names.add(dataArrayList.get(i).getProduct_group().toString());
                                }

                                ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(MainActivity.this, simple_spinner_item, names);
                                spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                                spinner.setAdapter(spinnerArrayAdapter);


                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //displaying the error in toast if occurrs
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        // request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        requestQueue.add(stringRequest);


    }


    public void retrieveJSON4(View view) {



        StringRequest stringRequest = new StringRequest(Request.Method.GET, URLstring,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.d("strrrrr", ">>" + response);

                        try {

                            JSONObject obj = new JSONObject(response);
                            if(obj.optString("status").equals("true")){

                                dataArrayList = new ArrayList<>();
                                JSONArray dataArray  = obj.getJSONArray("gift_list");

                                for (int i = 0; i < dataArray.length(); i++) {

                                    Data pg = new Data();
                                    JSONObject dataobj = dataArray.getJSONObject(i);

                                    pg.setId(dataobj.getString("id"));
                                    pg.setProduct_group(dataobj.getString("gift"));


                                    dataArrayList.add(pg);

                                }

                                for (int i = 0; i < dataArrayList.size(); i++){
                                    names.add(dataArrayList.get(i).getProduct_group().toString());
                                }

                                ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(MainActivity.this, simple_spinner_item, names);
                                spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                                spinner.setAdapter(spinnerArrayAdapter);


                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //displaying the error in toast if occurrs
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        // request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        requestQueue.add(stringRequest);


    }
    public void show(View view){
        Toast.makeText(getApplicationContext(), "This is my Toast message!",
                Toast.LENGTH_LONG).show();
    }




}
