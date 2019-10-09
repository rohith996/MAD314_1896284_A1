package com.example.mysamplecalapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       final EditText edit1=findViewById(R.id.editText);
        final EditText edit2=findViewById(R.id.editText2);
        final EditText edit3=findViewById(R.id.editText3);
        Button calculate=findViewById(R.id.button);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intn=new Intent(MainActivity.this,SecondCalActivity.class);
                intn.putExtra("num1",edit1.getText().toString());
                intn.putExtra("num2",edit2.getText().toString());
                intn.putExtra("num3",edit3.getText().toString());
                startActivity(intn);
            }
        });



    }
}
