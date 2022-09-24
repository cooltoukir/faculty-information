package com.example.diufacultyinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FsitActivity extends AppCompatActivity {

    CardView fsitcv1,fsitcv2,fsitcv3,fsitcv4,fsitcv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fsit);

        fsitcv1 = (CardView)findViewById(R.id.fsitcv1);
        fsitcv2 = (CardView)findViewById(R.id.fsitcv2);
        fsitcv3 = (CardView)findViewById(R.id.fsitcv3);
        fsitcv4 = (CardView)findViewById(R.id.fsitcv4);
        fsitcv5 = (CardView)findViewById(R.id.fsitcv5);


    }

    public void metod_fsitcv1(View view) {
        Intent i = new Intent(FsitActivity.this,CseActivity.class);
        startActivity(i);
    }
    public void metod_fsitcv2(View view) {
        Intent i = new Intent(FsitActivity.this,CisActivity.class);
        startActivity(i);
    }
    public void metod_fsitcv3(View view) {
        Intent i = new Intent(FsitActivity.this,SeActivity.class);
        startActivity(i);
    }
    public void metod_fsitcv4(View view) {
        Intent i = new Intent(FsitActivity.this,EsdmActivity.class);
        startActivity(i);
    }
    public void metod_fsitcv5(View view) {
        Intent i = new Intent(FsitActivity.this,GedActivity.class);
        startActivity(i);
    }
}
