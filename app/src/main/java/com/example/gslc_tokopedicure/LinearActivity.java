package com.example.gslc_tokopedicure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearActivity extends AppCompatActivity {
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        btnStart = findViewById(R.id.loginBtn);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LinearActivity.this, GridActivity.class);
                startActivity(intent);
            }
        });
    }
}