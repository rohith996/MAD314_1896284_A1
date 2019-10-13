package com.example.mad314_1896284_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2, num3;
    Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editText);
        num2 = findViewById(R.id.editText2);
        num3 = findViewById(R.id.editText3);
        cal = findViewById(R.id.button);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,nextactivity.class);
                i.putExtra("a",num1.getText().toString());
                i.putExtra("b",num2.getText().toString());
                i.putExtra("c",num3.getText().toString());
                startActivity(i);


            }
        });
    }
}
