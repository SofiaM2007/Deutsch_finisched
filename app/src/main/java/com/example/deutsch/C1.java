package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class C1 extends AppCompatActivity {
    MainActivity m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        m=new MainActivity();
        m.in_konjk1=false;
        m.in_konjk2=false;
        m.in_c1=true;
      //  m.back= ContextCompat.getColor(null, R.color.LiteOrangeRed);
      //  m.butt= ContextCompat.getColor(null, R.color.OrangeRed);
    }
    public void go_to_artikel_aktivity(View view) {
        Intent intent = new Intent(this, ArtikelActivity.class);
        startActivity(intent);
    }

    public void go_to_konjk1_aktivity(View view) {
        m.in_konjk1=true;
        m.in_konjk2=false;
        Intent intent = new Intent(this, SatzeMitKonjunktionen.class); //Переход на активнось SatzeMitKonjunktionent
        startActivity(intent);
    }

    public void go_to_konjk2_aktivity(View view) {
        m.in_konjk2=true;
        m.in_konjk1=false;
        Intent intent = new Intent(this, SatzeMitKonjunktionen.class); //Переход на активнось SatzeMitKonjunktionent
        startActivity(intent);
    }
}