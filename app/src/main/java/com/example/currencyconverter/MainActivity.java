package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView5;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView5=findViewById(R.id.textView5);
        editText=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                Float USD=Float.parseFloat(s);
                double INR = 82.40 * USD;
                textView5.setText("The Currency in INDIAN RUPEE is : "+INR);
            }
        });

    }
}