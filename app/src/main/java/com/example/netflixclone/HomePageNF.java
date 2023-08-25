package com.example.netflixclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomePageNF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_nf);
        Button getStart =  findViewById(R.id.btn_start);
        Button sign =  findViewById(R.id.btn_sign);

        if (getStart != null) {
            getStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent send = new Intent(HomePageNF.this, Homepage.class);
                    startActivity(send);
                }
            });
        }
        if (sign != null) {
            getStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent send = new Intent(HomePageNF.this, LoginPage.class);
                    startActivity(send);
                }
            });
        }
    }
}