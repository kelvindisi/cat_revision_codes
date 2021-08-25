package com.devkiu.questiononee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void computeTotal(View view) {
        EditText input = (EditText) findViewById(R.id.inputText);
        TextView output = (TextView) findViewById(R.id.outputView);

        String valueStr = input.getText().toString();

        int value = Integer.parseInt(valueStr);
        int total = 0;
        for(int i=1; i<=value; i++) {
            total = total + i;
        }
        output.setText(String.valueOf(total));
    }
}