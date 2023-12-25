package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class adjEndungenAndKonj2 extends AppCompatActivity {


    String sentens_adj_a2[]={       "Das ist ein .großes. (groß) Buch",
            "Ich trinke .heißen. (heißen) Tee",
            "Der Hund hat einen .braunen. (braunen) Fell",
            "Wir haben .frisches. (frisches) Obst gekauft",
            "Das ist ein .interessantes. (interessantes) Experiment",
            "Mein Bruder spielt ein .schnelles. (schnelles) Computerspiel",
            "Sie trägt ein .schönes. (schönes) Kleid",
            "Die Blumen sind .bunte. (bunte) Tulpen",
            "Ich esse ein .leckeres. (leckeres) Eis",
            "Das war eine .aufregende. (aufregende) Erfahrung",
            "Die Katze hat einen .kleinen. (kleinen) Schwanz",
            "Wir haben .neue. (neue) Möbel gekauft",
            "Das ist ein .teures. (teures) Restaurant",
            "Ich höre .laute. (laute) Musik",
            "Der Film war .langweilig. (langweilig)",
            "Wir haben .sauberes. (sauberes) Wasser",
            "Das Haus hat ein .hohes. (hohes) Dach",
            "Sie trägt einen .modernen. (modernen) Hut",
            "Ich lese ein .spannendes. (spannendes) Buch",
            "Wir essen .gesunde. (gesunde) Lebensmittel",
            "Die Blumen haben .frische. (frische) Blüten",
            "Der Lehrer gibt eine .interessante. (interessante) Lektion",
            "Das ist ein .schickes. (schickes) Auto",
            "Ich trage .gemütliche. (gemütliche) Schuhe",
            "Wir haben .gute. (gute) Freunde",
            "Das Konzert war .fantastisch. (fantastisches)",
            "Der Park hat .grüne. (grüne) Bäume",
            "Ich habe ein .weiches. (weiches) Kissen",
            "Die Sonne gibt .warmes. (warmes) Licht",
            "Das ist ein .modernes. (modernes) Smartphone",
            "Wir haben .gesunde. (gesunde) Lebensmittel gekauft",
            "Ich trinke .fruchtigen. (fruchtigen) Saft",
            "Das Gemälde hat .bunte. (bunte) Farben",
            "Ich höre .ruhige. (ruhige) Musik",
            "Der Wald hat .hohe. (hohe) Bäume",
            "Das Buch hat eine .spannende. (spannende) Handlung",
            "Ich trinke .kalten. (kalten) Kaffee",
            "Der See hat .klare. (klare) Wasser",
            "Die Stadt hat .historische. (historische) Gebäude",
            "Wir haben .frische. (frische) Luft",
            "Das ist ein .gemütliches. (gemütliches) Sofa",
            "Die Blumen sind .duftende. (duftende) Rosen",
            "Ich esse .knuspriges. (knuspriges) Brot",
            "Das ist ein .helles. (helles) Zimmer",
            "Wir haben .buntes. (buntes) Papier",
            "Ich trage .moderne. (moderne) Kleidung"};
    String sentens_adj_b1[]={};
    String sentens_adj_b2[]={};

    String sentens_konj_a2[]={};
    String sentens_konj_b1[]={};
    String sentens_konj_b2[]={};

    String sentensnow;
    String rightanswer;
    TextView teil1;
    TextView teil2;
    EditText editText;
    Button chek;
    LinearLayout mainLayout;

    MainActivity m = new MainActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adj_endungen_and_konj2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        teil1=findViewById(R.id.teil1);
        teil2=findViewById(R.id.teil2);
        chek = findViewById(R.id.chek);
        editText=findViewById(R.id.answerEditText);
        mainLayout = findViewById(R.id.layout);

        generateSentens();
    }

    public void generateSentens(){
        if(m.in_adj){
            editText.setHint("Enter Adjektiv");
        }
        else if(m.in_konj==true){
            editText.setHint("Enter Verb in Konjuktiv II");
        }

        if(m.in_a2==true){
            if(m.in_adj){
                int t = (int)(Math.random()*sentens_adj_a2.length);
                sentensnow = sentens_adj_a2[t];
            }
            else if(m.in_konj==true){
                int t = (int)(Math.random()*sentens_konj_a2.length);
                sentensnow = sentens_konj_a2[t];
            }

        }
        else if(m.in_b1==true){
            if(m.in_adj){
                int t = (int)(Math.random()*sentens_adj_b1.length);
                sentensnow = sentens_adj_b1[t];
            }
            else if(m.in_konj==true){
                int t = (int)(Math.random()*sentens_konj_b1.length);
                sentensnow = sentens_konj_b1[t];
            }
        }
        else if(m.in_b2==true){
            if(m.in_adj){
                int t = (int)(Math.random()*sentens_adj_b2.length);
                sentensnow = sentens_adj_b2[t];
            }
            else if(m.in_konj==true){
                int t = (int)(Math.random()*sentens_konj_b2.length);
                sentensnow = sentens_konj_b2[t];
            }
        }
        String[] words = sentensnow.split("\\.");
        teil1.setText(words[0]);
        teil2.setText(words[2]);
        rightanswer=words[1];
        Toast.makeText(adjEndungenAndKonj2.this, ""+rightanswer, Toast.LENGTH_SHORT).show();

    }

    public void checkAnswer(View view) {
        if(chek.getText().equals("Check")){
            if(editText.getText().equals(rightanswer)){
                mainLayout.setBackgroundColor(ContextCompat.getColor(adjEndungenAndKonj2.this, R.color.lightGreen));
                chek.setText("Next");
            }
            else{
                mainLayout.setBackgroundColor(ContextCompat.getColor(adjEndungenAndKonj2.this, R.color.lightRed));
                Toast.makeText(adjEndungenAndKonj2.this, ""+rightanswer+"!="+editText.getText(), Toast.LENGTH_LONG).show();
            }
        }
        else{
            mainLayout.setBackgroundColor(ContextCompat.getColor(adjEndungenAndKonj2.this, R.color.lightRed));
            generateSentens();
            chek.setText("Check");
        }
    }
}