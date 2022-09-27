package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculate_activity extends AppCompatActivity {

    private EditText hours_input;
    private EditText hourly_rate_input;

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        hours_input = (EditText) findViewById(R.id.hours_input);
        hourly_rate_input = (EditText) findViewById(R.id.hourly_rate_input);

        Button bt_calculate = findViewById(R.id.calculate_rate);

        output = (TextView) findViewById(R.id.output);

        bt_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Make calculations
                makeCalculations();
            }
        });

    }

    private void makeCalculations() {

        String no_of_hours = hours_input.getText().toString();
        String hourly_rate = hourly_rate_input.getText().toString();

        if (no_of_hours.isEmpty() && hourly_rate.isEmpty()) {
            output.setText("Fields are empty");
        } else {
            Double value_of_hours = Double.valueOf(no_of_hours);
            Double value_of_rate = Double.valueOf(hourly_rate);

            if (value_of_hours <= 40) {
                Double pay = value_of_hours * value_of_rate;
                output.setText("The pay is: " + pay);
            } else {
                Double pay = (value_of_hours - 40) * value_of_rate * 1.5 + 40 * value_of_hours;
                Double tax = pay * 0.18;
                Double result = pay + tax;
                output.setText("The pay with bonus: " + result);
            }

        }

    }

}