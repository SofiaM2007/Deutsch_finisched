package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class B2 extends AppCompatActivity {
    MainActivity m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        m=new MainActivity();
        m.in_b2=true;
        m.in_adj=false;
        m.in_konj=false;
        //m.back= ContextCompat.getColor(null, R.color.liteorange);
        //m.butt= ContextCompat.getColor(null, R.color.orange);
    }
    public void go_to_artikel_aktivity(View view) {

        Intent intent = new Intent(this, ArtikelActivity.class);
        startActivity(intent);
    }

    public void go_to_konjuktiv2(View view) {
        Intent intent = new Intent(this, adjEndungenAndKonj2.class); //Переход на активнось Konjunktiv2
        m.in_konj=true;
        startActivity(intent);
    }

    public void go_to_adjendung(View view) {
        Intent intent = new Intent(this, adjEndungenAndKonj2.class); //Переход на активнось adjEndungen
        m.in_adj=true;
        startActivity(intent);
    }

    public void go_to_SatzeMitKonjunktionent_aktivity(View view) {
        Intent intent = new Intent(this, SatzeMitKonjunktionen.class); //Переход на активнось SatzeMitKonjunktionent
        startActivity(intent);
    }

}