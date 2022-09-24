package com.example.diufacultyinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FhssActivity extends AppCompatActivity {

    CardView fhsscv1, fhsscv2, fhsscv3, fhsscv4, fhsscv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fhss);

        fhsscv1 = (CardView)findViewById(R.id.fsitcv1);
        fhsscv2 = (CardView)findViewById(R.id.fsitcv2);
        fhsscv3 = (CardView)findViewById(R.id.fsitcv3);
        fhsscv4 = (CardView)findViewById(R.id.fsitcv4);
        fhsscv5 = (CardView)findViewById(R.id.fsitcv5);
    }

    public void metod_fhsscv1(View view) {
        Intent i = new Intent(FhssActivity.this,EngActivity.class);
        startActivity(i);
    }

    public void metod_fhsscv2(View view) {
        Intent i = new Intent(FhssActivity.this,LawActivity.class);
        startActivity(i);
    }

    public void metod_fhsscv3(View view) {
        Intent i = new Intent(FhssActivity.this,JmcActivity.class);
        startActivity(i);
    }

    public void metod_fhsscv4(View view) {
        Intent i = new Intent(FhssActivity.this,DsActivity.class);
        startActivity(i);
    }

    public void metod_fhsscv5(View view) {
        Intent i = new Intent(FhssActivity.this,IslmActivity.class);
        startActivity(i);
    }
}
