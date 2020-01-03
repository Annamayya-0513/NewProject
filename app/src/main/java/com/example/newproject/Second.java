package com.example.newproject;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class Second extends AppCompatActivity {

    Button SingButton;
    TextView textView;

    String url = "http://www.mocky.io/v2/597c41390f0000d002f4dbd1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SingButton = (Button) findViewById(R.id.SignButton);
        textView = (TextView)findViewById(R.id.TextView);


        SingButton.setOnClickListener(   new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendAndRequestResponse();

            }
        });
    }


    private void sendAndRequestResponse() {

///Creating a requestqueue
        RequestQueue requestQueue = Volley.newRequestQueue(Second.this);

///creating a string request to send request to the url
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    //overall obj {}
                    JSONObject jsonObject = new JSONObject(response);
                    //read array within overall obj {[]}
                    JSONArray jsonArray = jsonObject.getJSONArray("users");
//read objects inside the array {[{},{},{}]}
                    for (int i = 0; i <= jsonArray.length(); i++) {

                        JSONObject jsonObject1 = jsonArray.optJSONObject(i);

                        if (jsonObject1.has("id")) {
                            String id = jsonObject1.getString("id");
                            textView.append(String.valueOf(id));

                            Toast.makeText(Second.this, id, Toast.LENGTH_SHORT).show();


                        }

                   }

//                    String username = jsonObject.optString("id");
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                Toast.makeText(Second.this, "Response:" + response, Toast.LENGTH_LONG).show();
                Log.i("Response", response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i(url, "error:" + error.toString());

            }

        });
///adding the string request to request queue
        requestQueue.add(stringRequest);

    }


}
