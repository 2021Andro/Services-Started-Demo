package com.example.startedservicesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvCountShow;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCountShow = findViewById(R.id.tvCountShow);

    }

    public void btnCounter(View view) {

        tvCountShow.setText("Count "+count++);
    }

    public void btnStartedServices(View view) {

        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }
}