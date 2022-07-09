package com.example.risical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Integer sum= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(" hi kammeliyaaaa");
        Button add = findViewById(R.id.addbtn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("BTN Clicked");
                EditText value_1 = findViewById(R.id.userValue1);
                EditText value_2 = findViewById(R.id.userValue2);
                 sum = Integer.parseInt(value_1.getText().toString()) + Integer.parseInt(value_2.getText().toString());
                System.out.println(" the sum - " + sum.toString());
                goAddAnswerPage();
            }
        });


    }
    public void goAddAnswerPage(){
        Intent intent =  new Intent(this, MainActivity2.class);
        intent.putExtra("sum",sum.toString());
        startActivity(intent);
    }
}