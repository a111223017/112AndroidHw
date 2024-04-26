package com.example.midterm_ticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView Txt =findViewById(R.id.txv);
        Txt.setText("已購買:\n"+MainActivity.finaltxt);
    }
    public  void btn_onclick(View view)
    {
        Intent intent = new Intent();
        intent.setClass(activity_second.this,MainActivity.class);
        startActivity(intent);

    }
}
