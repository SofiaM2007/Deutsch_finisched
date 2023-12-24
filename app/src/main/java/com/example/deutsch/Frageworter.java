package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class Frageworter extends AppCompatActivity {

    //Woher-1; Wo - 2; Wohin - 3
    String quastion[]={"1___ kommst du?","2___ bist du?", "3___ gehst du?"};


    Spinner spiner;
    TextView frage;

    String sentensnow;
    String ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frageworter);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        spiner = findViewById(R.id.fragewort);
        frage=findViewById(R.id.frage);

        quastiongeneration();

    }

    public void quastiongeneration(){
        int t = (int)(Math.random()*quastion.length);
        sentensnow = quastion[t].substring(1);
        // percent.setText(points + " " + wordsa1.length + " " + points/wordsa1.length);
        char a = quastion[t].charAt(0);
        if(a=='1') ans="Woher";
        else if(a=='2') ans = "Wo";
        else if(a=='3') ans = "Wohin";
        frage.setText(sentensnow);
    }

    public void checkanswer(){
        //spiner.getText
    }

}