package com.yassir.yassirpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView offers = findViewById(R.id.imageView);
        ImageView revenue = findViewById(R.id.imageView2);
        ImageView contactSupport = findViewById(R.id.imageView3);
        FloatingActionButton createOffer = findViewById(R.id.fab);


        createOffer.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, CreateOfferActivity.class);
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            this.startActivity(myIntent);
        });
        offers.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, OffersActivity.class);
            this.startActivity(myIntent);
        });
        revenue.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, RevenueActivity.class);
            this.startActivity(myIntent);
        });
    }
}