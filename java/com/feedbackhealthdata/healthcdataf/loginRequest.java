package com.feedbackhealthdata.healthcdataf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class loginRequest extends StringRequest {
    private static final String LOGIN_REQUEST_URL="https://explicit-debits.000webhostapp.com/Login.php";
    private Map<String,String> params;


    public loginRequest( String email_ID, String pass_word,
                           Response.Listener<String> listener, Response.ErrorListener errorListener){

        super(Request.Method.POST,LOGIN_REQUEST_URL,listener,null);
        params = new HashMap<>();
        params.put("email_ID",email_ID);
        params.put("pass_word",pass_word);

    }

    @Override

    public Map<String,String> getParams(){
        return params;
    }
}

