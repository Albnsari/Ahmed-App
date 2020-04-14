package com.example.ahmedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.EditText);
        textView = findViewById(R.id.TextView2);
        button = findViewById(R.id.Button1);

    }

    public void check(View v) {
        textView.setText(
                (editText.length() == 0)?"الرجاء وضع عدد":
                (Integer.parseInt(editText.getText().toString()) % 2 == 0)?"زوجي":"فردي"
        );
    }

}
