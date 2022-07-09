package com.example.risical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String sum = getIntent().getStringExtra("sum");
        System.out.println("-----------------------------------------------------");
        System.out.println(sum);
        TextView output = findViewById(R.id.output);
        output.setText("this answer is - " + sum);
        Button back = findViewById(R.id.button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Back();
            }
        });
    }

    public void Back(){
        Intent intent =  new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}