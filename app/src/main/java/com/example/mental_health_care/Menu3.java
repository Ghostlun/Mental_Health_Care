package com.example.mental_health_care;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//Chatting View  about mental health
public class Menu3 extends AppCompatActivity {


    Integer level = 1;

    public Integer getLevel(){

        return level;
    }

    public void setLevel(int Level){

        this.level = Level;
    }

    public Integer levelup(){

        level = level + 1;

        return level;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu3);


        TextView questionView =  (TextView) findViewById(R.id.questionBoard);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

//        TextView counter = (TextView) findViewById(R.id.counter);
//        counter.setText(getLevel());

        button1.setText(getLevel().toString());
        questionView.setText("How are you doing Today?");


        switch(level){


            case 1 :
                questionView.setText("My name is Joy, How are you doing Today? \n Choose the one of the emotion words below");
                button1.setText("I am tired");
                button2.setText("I am despressed");
                button3.setText("I am sad");
                break;

            case 2 :
                questionView.setText("It's important to know how i feel, can you tell me what happened at that time");


                break;

            case 3 : questionView.setText("I am always with you \n please don't hesitate contact with me" );



            break;



            default: questionView.setText("I am sorry, can you give me detail information");

        }


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                levelup();
        }
        });

        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            levelup();        }
         });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                levelup();            }
        });

    }





}
