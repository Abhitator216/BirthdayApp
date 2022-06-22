package com.example.hbdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Secondpage (View view) {
        Toast.makeText(this, "Memories are coming ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Secondpage.class);
        startActivity(intent);
    }
    //more Buttons
//    public void moreButtons (View view) {
//        Toast.makeText(this, "🤩 You found your birthday gift  🤩", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(this, SpecialPhotos.class);
//        startActivity(intent);
//    }

}
