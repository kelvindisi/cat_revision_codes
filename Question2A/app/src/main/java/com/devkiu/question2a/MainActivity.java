package com.devkiu.question2a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById(R.id.totalOutput);

        if (getIntent().getExtras() != null){
            float total = getIntent().getExtras().getFloat("total");
            output.setText(String.valueOf(total));
        }
    }
    public void showComputeActivity(View view) {
        Intent intent = new Intent(this, ComputeActivity.class);
        startActivity(intent);
    }
}