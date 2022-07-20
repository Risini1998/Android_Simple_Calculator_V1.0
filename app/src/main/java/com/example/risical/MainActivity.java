package com.example.risical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    double res= 0.0;
    EditText value_1 ;
    EditText value_2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value_2 = findViewById(R.id.userValue2);;
        value_1 = findViewById(R.id.userValue1);
        System.out.println("Hello!!");
        Button add = findViewById(R.id.addbtn);
        Button sub = findViewById(R.id.subbtn);
        Button mul = findViewById(R.id.mulbtn);
        Button dev = findViewById(R.id.devbtn);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("ADD Clicked");
                //EditText value_1 = findViewById(R.id.userValue1);
                //EditText value_2 = findViewById(R.id.userValue2);
                res = Float.parseFloat(value_1.getText().toString()) + Float.parseFloat(value_2.getText().toString());
                goAnswerPage();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("SUB Clicked");
                res = Float.parseFloat(value_1.getText().toString()) - Float.parseFloat(value_2.getText().toString());
                goAnswerPage();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("MUL Clicked");
                res = Float.parseFloat(value_1.getText().toString()) * Float.parseFloat(value_2.getText().toString());
                goAnswerPage();
            }
        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("DEV Clicked");
                res = Float.parseFloat(value_1.getText().toString()) / Float.parseFloat(value_2.getText().toString());
                goAnswerPage();
            }
        });

    }
    public void goAnswerPage(){
        Intent intent =  new Intent(this, MainActivity2.class);
        intent.putExtra("answr",String.valueOf(Math.round(res*100.0)/100.0));
        startActivity(intent);
    }
}