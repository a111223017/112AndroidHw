package com.example.midterm_ticket;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    public static String[] ticket = new  String[3];
    public  static  String finaltxt ;
    private  int ticketCount = 0,ticketmoney = 0;
    private EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        RadioGroup rg = (RadioGroup) findViewById(R.id.rgGender);
        RadioGroup rgtk = (RadioGroup) findViewById(R.id.rgType);
        txt = (EditText) findViewById(R.id.EdtNum);
        txt.addTextChangedListener(this);
        rgtk.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rdbAdult) {


                    ticket[1]=getResources().getString(R.string.regularticket);
                    ticketmoney = ticketCount * 500;

                } else if (checkedId == R.id.rdbChild) {


                    ticket[1]=getResources().getString(R.string.childticket);
                    ticketmoney = ticketCount * 400;

                }
                else
                {
                    ticket[1]=getResources().getString(R.string.studentticket);
                    ticketmoney = ticketCount * 250;
                }
                print();
            }

        });
        // 註冊傾聽者物件
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rdbBoy) {

                    RadioButton boy = findViewById(R.id.rdbBoy);
                    ticket[0]=getResources().getString(R.string.male);

                } else if (checkedId == R.id.rdbGirl) {

                    RadioButton girl = findViewById(R.id.rdbGirl);
                    ticket[0]=getResources().getString(R.string.female);

                }
                print();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setClass(MainActivity.this,activity_second.class);
                startActivity(intent);
            }


        });

    }


    public void bt_on(View view)
    {

        Intent intent = new Intent();
        intent.setClass(MainActivity.this,activity_second.class);
        startActivity(intent);

    }
    public  void print()
    {
        TextView output= findViewById(R.id.lblOutput);
        String str = "";
        str +=ticket[0]+"\n"
                +ticket[1]+ticketCount+"張\n"
                +"金額為"+ticketmoney+"\n";
        finaltxt =str;
        output.setText(str);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
       String str = s.toString();
       ticketCount=Integer.parseInt(str);
       print();

    }

    @Override
    public void afterTextChanged(Editable s) {

    }

}