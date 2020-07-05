package com.example.mental_health_care;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//what kind of mental health care are exist
public class Menu1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1);


        findViewById(R.id.mentalTextBox);

        //How ADHD Button works
        Button ADHD_Button = (Button) findViewById(R.id.ADHD_Button);
        ADHD_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });


        //How Panic Button works
        Button Panic_Button = (Button) findViewById(R.id.Panic_Button);
        Panic_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //How Depression Button works
        Button Depression_Button = (Button) findViewById(R.id.Depression_Button);
        Depression_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //How Dementia_Button works
        Button Dementia_Button = (Button) findViewById(R.id.Dementia_Button);
        Dementia_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //How Pobia_Button works
        Button Pobia_Button = (Button) findViewById(R.id.Pobia_Button);
        Pobia_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //How ADHD Button works
        Button Dysthymia_Button = (Button) findViewById(R.id.Dysthymia_Button);
        Dysthymia_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //How ADHD Button works
        Button Stress_Button = (Button) findViewById(R.id.Stress_Button);
        Stress_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

}
