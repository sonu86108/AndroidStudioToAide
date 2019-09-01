package com.example.firstassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btn;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        e=findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e.getText().toString();
                if(age<=5)
                {
                    Toast.makeText(MainActivity.this, "you are valid for polio drop", Toast.LENGTH_SHORT).show();
                }
                else if(age>=5 && age<=10)
                {
                    Toast.makeText(MainActivity.this, "you are valid for injection", Toast.LENGTH_SHORT).show();
                }
                else if(age>=10 && age<=15)
                {
                    Toast.makeText(MainActivity.this, "eligibel for vitamins", Toast.LENGTH_SHORT).show();
                }
                else if(age>=15 )
                {
                    Toast.makeText(MainActivity.this, "ghar jao", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
