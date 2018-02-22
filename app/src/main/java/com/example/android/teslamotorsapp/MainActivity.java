package com.example.android.teslamotorsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goWeb(View view){
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:www.tesla.com"));
        startActivity(webIntent);
    }
}
