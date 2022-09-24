package com.example.diufacultyinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FeActivity extends AppCompatActivity {

    CardView fecv1, fecv2, fecv3, fecv4, fecv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe);

        fecv1 = (CardView)findViewById(R.id.fsitcv1);
        fecv2 = (CardView)findViewById(R.id.fsitcv2);
        fecv3 = (CardView)findViewById(R.id.fsitcv3);
        fecv4 = (CardView)findViewById(R.id.fsitcv4);
        fecv5 = (CardView)findViewById(R.id.fsitcv5);
    }

    public void metod_fecv1(View view) {
        Intent i = new Intent(FeActivity.this,EteActivity.class);
        startActivity(i);
    }

    public void metod_fecv2(View view) {
        Intent i = new Intent(FeActivity.this,TeActivity.class);
        startActivity(i);
    }

    public void metod_fecv3(View view) {
        Intent i = new Intent(FeActivity.this,EeeActivity.class);
        startActivity(i);
    }

    public void metod_fecv4(View view) {
        Intent i = new Intent(FeActivity.this,ArchActivity.class);
        startActivity(i);
    }

    public void metod_fecv5(View view) {
        Intent i = new Intent(FeActivity.this,CeActivity.class);
        startActivity(i);
    }
}
