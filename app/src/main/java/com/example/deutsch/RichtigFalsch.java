package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class RichtigFalsch extends AppCompatActivity {


    String sentens_konjunktionen[]={    "1Je mehr er trainiert, desto stärker wird er.",
            "1Umso schneller du rennst, umso eher gewinnst du das Rennen.",
            "1Weder der Regen noch der Wind konnten die Stimmung verderben.",
            "1Nicht nur hat er die Präsentation vorbereitet, sondern auch die Fragen beantwortet.",
            "1Entweder du kommst zum Treffen, oder du informierst uns vorher.",
            "1Zwar ist es kalt draußen, aber die Sonne scheint.",
            "1Sowohl der Hund als auch die Katze sind erlaubt.",
            "1Je mehr Bücher du liest, desto größer wird dein Wortschatz.",
            "1Umso länger wir warten, umso ungeduldiger werden wir.",
            "1Weder der Lehrer noch die Schüler hatten die Lösung.",
            "1Nicht nur das Essen war köstlich, sondern auch der Nachtisch.",
            "1Entweder du kommst ins Kino, oder du bleibst zu Hause.",
            "1Zwar war der Film lang, aber er war fesselnd.",
            "1Sowohl der Vater als auch die Mutter haben Zeit für das Event.",
            "1Je mehr du übst, desto besser wirst du im Sport.",
            "1Umso mehr Zeit wir zusammen verbringen, umso mehr schätzen wir einander.",
            "1Weder der Chef noch die Kollegen haben von deinem Plan gewusst.",
            "1Nicht nur der Kaffee, sondern auch der Tee ist hier köstlich.",
            "1Entweder du hilfst mir, oder ich schaffe es allein.",
            "1Zwar hat er den Job bekommen, aber er ist nicht zufrieden.",
            "1Sowohl der Anfang als auch das Ende des Buches waren überraschend.",
            "1Je mehr du sparst, desto mehr Geld hast du am Ende.",
            "1Umso mehr wir lernen, umso besser verstehen wir die Materie.",
            "1Weder der Tag noch die Nacht beeinflussen seine Produktivität.",
            "1Nicht nur die Sonne, sondern auch der Mond leuchtet am Himmel.",
            "1Entweder du nimmst den Bus, oder du fährst mit dem Fahrrad.",
            "1Zwar war es schwierig, aber wir haben es geschafft.",
            "1Sowohl der Arzt als auch die Krankenschwester kümmern sich um die Patienten.",
            "1Je mehr du reist, desto offener wirst du für andere Kulturen.",
            "1Umso länger wir diskutieren, umso weniger erreichen wir.",
            "1Weder der Sommer noch der Winter beeinträchtigen ihre Aktivitäten.",
            "1Nicht nur die Musik, sondern auch die Texte sind beeindruckend.",
            "1Entweder du isst jetzt, oder du wirst später hungrig sein.",
            "1Zwar hat er die Einladung erhalten, aber er hat abgesagt.",
            "1Sowohl der Tag als auch die Nacht haben ihre eigene Schönheit.",
            "0Je er mehr liest, desto er klüger wird.",
            "0Umso du schneller rennst, gewinnst du das Rennen eher.",
            "0Weder der Wind oder der Regen konnten die Stimmung verderben.",
            "0Nicht nur er hat die vorbereitet Präsentation, sondern auch die beantwortet Fragen.",
            "0Entweder zum Treffen du kommst, oder uns du informierst vorher.",
            "0Zwar es kalt ist draußen, aber scheint die Sonne.",
            "0Sowohl Hund der als auch die Katze sind erlaubt.",
            "0Je mehr du liest Bücher, desto wird dein größer Wortschatz.",
            "0Umso ungeduldiger wir werden, wir warten länger.",
            "0Weder hatten der Lehrer noch die Lösung die Schüler.",
            "0Nicht nur war das Essen köstlich, sondern auch der Nachtisch.",
            "0Entweder zu Hause du bleibst, oder ins Kino du kommst.",
            "0Zwar lang der Film war, aber fesselnd er war.",
            "0Sowohl Mutter die als auch der Vater Zeit für das Event haben.",
            "0Je Sport mehr du übst, desto besser wirst du im.",
            "0Umso zusammen verbringen wir mehr Zeit, desto wir mehr einander schätzen.",
            "0Weder der Chef wussten die noch Kollegen von deinem Plan.",
            "0Nicht nur war der Tee köstlich, sondern auch der Kaffee.",
            "0Entweder allein schaffe ich es, oder hilfst du mir.",
            "0Zwar nicht zufrieden er ist, hat er den Job bekommen.",
            "0Sowohl überraschend waren als auch des Buches Anfang das Ende.",
            "0Je Geld am Ende mehr du hast, desto sparst du mehr.",
            "0Umso die Materie verstehen wir mehr, lernen wir mehr.",
            "0Weder Nacht die noch der Tag seine Produktivität beeinflussen.",
            "0Nicht nur leuchtet der Mond, sondern auch die Sonne am Himmel.",
            "0Entweder mit dem Fahrrad du fährst, oder den Bus nimmst du.",
            "0Zwar es schwierig war, aber es geschafft haben wir.",
            "0Sowohl die Krankenschwester als auch die Patienten sich kümmern um den Arzt.",
            "0Je für andere Kulturen offener du wirst, reist mehr du.",
            "0Umso erreichen wir weniger, wir diskutieren länger.",
            "0Weder ihre Aktivitäten der Sommer beeinträchtigen noch der Winter.",
            "0Nicht nur sind die Texte, sondern auch beeindruckend die Musik.",
            "0Entweder hungrig du wirst später, oder isst jetzt du.",
            "0Zwar hat er die erhalten Einladung, aber er hat abgesagt.",
            "0Sowohl ihre eigene Schönheit als auch haben die Nacht der Tag."
    };

    boolean rightans;
    String sentens_now;
    TextView sent;
    TextView komment;
    ConstraintLayout c;
    MainActivity m = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_richtig_falsch);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        sent = findViewById(R.id.textViewCenter);
        komment = findViewById(R.id.komment);
        c = findViewById(R.id.layout);

        regenerateQuestion();
    }

    private void regenerateQuestion() {
        char right='3';
        if(m.in_b1){
            int t = (int)(Math.random()*sentens_konjunktionen.length);
            sentens_now = sentens_konjunktionen[t].substring(1);
            right = (sentens_konjunktionen[t].charAt(0));
        }


        if(right=='1'){
            rightans=true;
        }
        else{
            rightans=false;
        }
        sent.setText(sentens_now);
    }

    public void checkf(View view) {
        if(!rightans){
            c.setBackgroundColor(ContextCompat.getColor(this, R.color.springgreen));
            komment.setText("Deine Antwort ist richtig, dieser Satz ist falsch!");

        }
        else{
            komment.setText("Deine Antwort ist falsch, dieser Satz ist richtig!");
            c.setBackgroundColor(ContextCompat.getColor(this, R.color.litered));
        }
        // ждёт
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                c.setBackgroundColor(ContextCompat.getColor(RichtigFalsch.this, R.color.liteYelow));
                regenerateQuestion();
                komment.setText("");
            }
        }, 1500);
    }
    public void checkt(View view) {
        if(rightans){
            komment.setText("Deine Antwort ist richtig, dieser Satz ist richtig!");
            c.setBackgroundColor(ContextCompat.getColor(this, R.color.springgreen));

        }
        else{
            komment.setText("Deine Antwort ist falsch, dieser Satz ist falsch!");
            c.setBackgroundColor(ContextCompat.getColor(this, R.color.litered));
        }
        // ждёт
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                c.setBackgroundColor(ContextCompat.getColor(RichtigFalsch.this, R.color.liteYelow));
                komment.setText("");
                regenerateQuestion();
            }
        }, 1500);
    }
}