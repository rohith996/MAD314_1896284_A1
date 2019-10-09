package com.example.mysamplecalapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondCalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_cal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView t1=findViewById(R.id.textView);
        TextView t2=findViewById(R.id.textView2);
        Button btn2=findViewById(R.id.button2);
        Intent intn2= getIntent();
        String s1= intn2.getStringExtra("num1");
        String s2= intn2.getStringExtra("num2");
        String s3=intn2.getStringExtra("num3");
        Integer n1=Integer.parseInt(s1);
        Integer n2=Integer.parseInt(s2);
        Integer n3=Integer.parseInt(s3);
        Integer add=n1+n2+n3;
        Integer mul=n1*n2*n3;
        t1.setText(add.toString());
        t2.setText(mul.toString());
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(SecondCalActivity.this,MainActivity.class);
                startActivity(int1);
            }
        });
    }

}
