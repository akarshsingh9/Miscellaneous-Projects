package com.quickdeal.quickdealdemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    ImageView buyer,seller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buyer = (ImageView)findViewById(R.id.buyer);
        seller = (ImageView)findViewById(R.id.seller);

        preferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        buyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("option",1);
                editor.putBoolean("notFirstTime",true);
                editor.commit();

                Intent intent = new Intent(MainActivity.this,ProfileBuyerActivity.class);
                startActivity(intent);
            }
        });

        seller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("option",2);
                editor.putBoolean("notFirstTime",true);
                editor.commit();

                Intent intent = new Intent(MainActivity.this,ProfileSellerActivity.class);
                startActivity(intent);

            }
        });

    }
}
