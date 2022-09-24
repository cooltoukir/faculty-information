package com.example.diufacultyinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FbeActivity extends AppCompatActivity {

    CardView fbecv1, fbecv2, fbecv3, fbecv4, fbecv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fbe);

        fbecv1 = (CardView)findViewById(R.id.fsitcv1);
        fbecv2 = (CardView)findViewById(R.id.fsitcv2);
        fbecv3 = (CardView)findViewById(R.id.fsitcv3);
        fbecv4 = (CardView)findViewById(R.id.fsitcv4);
        fbecv5 = (CardView)findViewById(R.id.fsitcv5);
    }

    public void metod_fbecv1(View view) {

        Intent i = new Intent(FbeActivity.this,BaActivity.class);
        startActivity(i);
    }

    public void metod_fbecv2(View view) {
        Intent i = new Intent(FbeActivity.this,BsActivity.class);
        startActivity(i);
    }

    public void metod_fbecv3(View view) {
        Intent i = new Intent(FbeActivity.this,ReActivity.class);
        startActivity(i);
    }

    public void metod_fbecv4(View view) {
        Intent i = new Intent(FbeActivity.this,Thm2Activity.class);
        startActivity(i);
    }

    public void metod_fbecv5(View view) {
        Intent i = new Intent(FbeActivity.this,IeActivity.class);
        startActivity(i);
    }
}
