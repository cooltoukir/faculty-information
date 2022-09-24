package com.example.diufacultyinfo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    CardView hcv1, hcv2, hcv3, hcv4, hcv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        hcv1 = (CardView)findViewById(R.id.hcv1);
        hcv2 = (CardView)findViewById(R.id.hcv2);
        hcv3 = (CardView)findViewById(R.id.hcv3);
        hcv4 = (CardView)findViewById(R.id.hcv4);
        hcv5 = (CardView)findViewById(R.id.hcv5);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void metod_hcv1(View view){
        Intent i = new Intent(MainActivity.this,FsitActivity.class);
        startActivity(i);
    }
    public void metod_hcv2(View view){
        Intent i = new Intent(MainActivity.this,FbeActivity.class);
        startActivity(i);
    }
    public void metod_hcv3(View view){
        Intent i = new Intent(MainActivity.this,FeActivity.class);
        startActivity(i);
    }
    public void metod_hcv4(View view){
        Intent i = new Intent(MainActivity.this,FahsActivity.class);
        startActivity(i);
    }
    public void metod_hcv5(View view){
        Intent i = new Intent(MainActivity.this,FhssActivity.class);
        startActivity(i);
    }
}
