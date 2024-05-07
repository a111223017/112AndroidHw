package com.example.ch06_quiz;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView image1,image2,image3,image4,image5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        image1 = (ImageView) findViewById(R.id.output1);
        image2 = (ImageView) findViewById(R.id.output2);
        image3 = (ImageView) findViewById(R.id.output3);
        image4 = (ImageView) findViewById(R.id.output4);
        image5 = (ImageView) findViewById(R.id.output5);
        CheckBox chk1 =(CheckBox) findViewById(R.id.chk1);
        CheckBox chk2 =(CheckBox) findViewById(R.id.chk2);
        CheckBox chk3 =(CheckBox) findViewById(R.id.chk3);
        CheckBox chk4 =(CheckBox) findViewById(R.id.chk4);
        CheckBox chk5 =(CheckBox) findViewById(R.id.chk5);
        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    image1.setVisibility(ImageView.VISIBLE);
                } else {
                    image1.setVisibility(ImageView.GONE);
                }
            }
        });
        chk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    image2.setVisibility(ImageView.VISIBLE);
                } else {
                    image2.setVisibility(ImageView.GONE);
                }
            }
        });
        chk3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    image3.setVisibility(ImageView.VISIBLE);
                } else {
                    image3.setVisibility(ImageView.GONE);
                }
            }
        });
        chk4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    image4.setVisibility(ImageView.VISIBLE);
                } else {
                    image4.setVisibility(ImageView.GONE);
                }
            }
        });
        chk5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    image5.setVisibility(ImageView.VISIBLE);
                } else {
                    image5.setVisibility(ImageView.GONE);
                }
            }
        });
    }
}