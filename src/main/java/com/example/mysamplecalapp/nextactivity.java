package com.example.mad314_1896284_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class nextactivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextactivity);
        final TextView sum = findViewById(R.id.textView);
        final TextView mul = findViewById(R.id.textView2);
      Button back = findViewById(R.id.button2);
        Intent intent= getIntent();
       final String one = intent.getStringExtra("a");
        final String two = intent.getStringExtra("b");
        final String three = intent.getStringExtra("c");
        Integer a = Integer.parseInt(one);
        Integer b = Integer.parseInt(two);
        Integer c = Integer.parseInt(three);
        Integer add = a+b+c;
        Integer into = a*b*c;
        sum.setText(Integer.toString(add));
        mul.setText(Integer.toString(into));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent in = new Intent(nextactivity.this,MainActivity.class);
               startActivity(in);


            }
        });




    }
}
