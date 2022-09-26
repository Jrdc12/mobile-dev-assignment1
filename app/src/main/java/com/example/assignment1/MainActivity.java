package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button about_btn, calculate_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        about_btn = findViewById(R.id.about_btn);
        calculate_btn = findViewById(R.id.calculate_btn);

        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about_intent = new Intent(getApplicationContext(), about_activity.class);
                startActivity(about_intent);
            }
        });

        calculate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculate_intent = new Intent(getApplicationContext(), calculate_activity.class);
                startActivity(calculate_intent);
            }
        });
    }
}