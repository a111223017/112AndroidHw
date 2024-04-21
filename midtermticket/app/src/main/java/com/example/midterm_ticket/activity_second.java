package com.example.midterm_ticket;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView Txt =findViewById(R.id.txv);
        Txt.setText(MainActivity.finaltxt);
    }
}
