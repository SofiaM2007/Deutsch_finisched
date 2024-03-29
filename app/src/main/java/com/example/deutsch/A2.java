package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class A2 extends AppCompatActivity {
    MainActivity m;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Log.d("In A2", "In A2");
        setContentView(R.layout.activity_a2);
        Log.d("In A2", "In A2");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        m=new MainActivity();
        Log.d("In A2", "In A2");
        m.in_a2=true;
        m.in_adj=false;
        m.in_konj=false;
    }

    public void go_to_artikel_aktivity(View view) {

        Intent intent = new Intent(this, ArtikelActivity.class);
        startActivity(intent);
    }

    public void go_to_glagaktivity(View view) {
        Intent intent = new Intent(this, glagol.class);
        startActivity(intent);
    }

    public void go_to_SatzeMitKonjunktionent_aktivity(View view) {
        Intent intent = new Intent(this, SatzeMitKonjunktionen.class); //Переход на активнось KeinNicht
        startActivity(intent);
    }

    public void mit_ohne_zu_aktivity(View view) {
        Intent intent = new Intent(this, Satze_mit_ohne_zu.class); //Переход на активнось Satze_mit_ohne_zu
        startActivity(intent);
    }

    public void go_to_konjuktiv2(View view) {
        Intent intent = new Intent(this, adjEndungenAndKonj2.class); //Переход на активнось Konjunktiv2
        m.in_konj=true;
        startActivity(intent);
    }
    public void go_to_wo_woher_wohin(View view) {
        Intent intent = new Intent(this, Frageworter.class); //Переход на активнось Frageworter
        startActivity(intent);
    }

    public void go_to_adjendung(View view) {
        Intent intent = new Intent(this, adjEndungenAndKonj2.class); //Переход на активнось adjEndungen
        m.in_adj=true;
        startActivity(intent);
    }
    public void go_to_padezh(View view) {
        Intent intent = new Intent(this, Padezh.class); //Переход на активнось Padezh
        startActivity(intent);
    }
}