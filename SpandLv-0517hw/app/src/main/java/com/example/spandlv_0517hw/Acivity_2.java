package com.example.spandlv_0517hw;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Acivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act2);
        TextView txv = findViewById(R.id.txvv);
        txv.setText(MainActivity.msg);

    }
}
