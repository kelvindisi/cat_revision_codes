package com.devkiu.question2a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ComputeActivity extends AppCompatActivity {
    EditText valueOne, valueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compute);
    }
    public void computeTotal(View view) {
        valueOne = (EditText) findViewById(R.id.valueOne);
        valueTwo = (EditText) findViewById(R.id.valueTwo);
        //get values
        float x = Float.parseFloat(valueOne.getText().toString());
        float y = Float.parseFloat(valueTwo.getText().toString());
        //compute total
        float total = x + y;
        //Return to different Activity
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("total", total);
        startActivity(intent);
    }
}