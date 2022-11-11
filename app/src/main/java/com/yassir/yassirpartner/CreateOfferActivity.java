package com.yassir.yassirpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;

public class CreateOfferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_offer);

        Button create = findViewById(R.id.button);
        Button cancel = findViewById(R.id.button2);

        create.setOnClickListener(view -> {
            Intent intent = new Intent(context, OffersActivity.class);
            context.startActivity(intent);
        });
        cancel.setOnClickListener(view -> {
            onBackPressed();
        });
    }
}