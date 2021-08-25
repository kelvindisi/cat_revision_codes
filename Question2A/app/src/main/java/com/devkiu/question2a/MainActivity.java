package com.devkiu.question2a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getExtras() != null){
            Float total = getIntent().getExtras().getFloat("total");
            Toast.makeText(this, String.valueOf(total), Toast.LENGTH_SHORT).show();
        }
    }
    public void showComputeActivity(View view) {
        Intent intent = new Intent(this, ComputeActivity.class);
        startActivity(intent);
    }
}