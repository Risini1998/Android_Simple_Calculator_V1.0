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
        String answr = getIntent().getStringExtra("answr");
        System.out.println(answr);
        TextView output = findViewById(R.id.output);
        output.setText(answr);

        Button back = findViewById(R.id.backbtn);
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