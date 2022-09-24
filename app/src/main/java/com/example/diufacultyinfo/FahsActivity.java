package com.example.diufacultyinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FahsActivity extends AppCompatActivity {

    CardView fahscv1, fahscv2, fahscv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahs);

        fahscv1 = (CardView)findViewById(R.id.fsitcv1);
        fahscv2 = (CardView)findViewById(R.id.fsitcv2);
        fahscv3 = (CardView)findViewById(R.id.fsitcv3);
    }

    public void metod_fahscv1(View view) {
        Intent i = new Intent(FahsActivity.this,PharActivity.class);
        startActivity(i);
    }

    public void metod_fahscv2(View view) {
        Intent i = new Intent(FahsActivity.this,PhActivity.class);
        startActivity(i);
    }

    public void metod_fahscv3(View view) {
        Intent i = new Intent(FahsActivity.this,NfeActivity.class);
        startActivity(i);
    }
}
