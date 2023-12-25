package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Padezh extends AppCompatActivity {

    private String[] questionsa1 = {
            "5Ich gebe dem Kind ___ Ball.", "5Sie sieht ___ Fernseher.", "3Wir gehen in ___ Park.",
            "3Er liest ___ Buch.", "5Ich trinke ___ Kaffee.", "3Das ist ___ Auto.",
            "4Sie spricht mit ___ Lehrer.", "5Er kauft ___ Apfel.",
            "2Wir besuchen ___ Freunde.", "3Ich habe ___ Hund.",
            "2Sie öffnet ___ Tür.", "2Ich höre ___ Musik.", "2Wir mögen ___ Pizza.",
            "2Sie trägt ___ Jacke.", "3Er wohnt in ___ Stadt.", "3Ich sehe ___ Film.",
            "2Sie schreibt ___ Brief.", "2Wir haben ___ Katze.", "5Er isst ___ Brot.",
            "3Das ist ___ Haus.", "2Sie trägt ___ Hut.", "2Er liest ___ Zeitung.",
            "3Wir fahren in ___ Schule.", "2Ich trage ___ Brille.", "2Sie kauft ___ Blumen.",
            "3Er spielt ___ Klavier.", "3Ich sehe ___ Vogel.", "2Wir haben ___ Auto.",
            "5Sie isst ___ Kuchen.", "2Er öffnet ___ Buch.", "5Ich trinke ___ Tee.",
            "2Wir mögen ___ Strand.", "3Sie geht in ___ Restaurant.", "3Er malt ___ Bild.",
            "2Ich höre ___ Lied.", "2Wir besuchen ___ Museum.", "2Sie putzt ___ Fenster.",
            "3Er hat ___ Computer.", "3Ich spiele ___ Fußball.", "2Wir machen ___ Ausflug.",
            "2Sie trägt ___ Kleid.", "5Er repariert ___ Auto.", "3Ich sehe ___ Sterne.",
            "2Wir besitzen ___ Haus.", "2Sie hört ___ Nachrichten.", "3Er liest ___ Gedicht.",
            "5Ich esse ___ Pizza.", "3Wir reisen in ___ Ferien.",
            "2Sie malt ___ Landschaft.", "2Er trägt ___ Rucksack.",
            "3Ich habe ___ Tasche.", "3Wir sehen ___ Sonnenuntergang.", "3Sie fährt ___ Motorrad.",
            "3Er hat ___ Freundin.", "5Ich trinke ___ Saft.", "2Wir kaufen ___ Geschenk.",
            "2Sie öffnet ___ Fenster.", "2Er besucht ___ Oma.", "2Ich höre ___ Geräusche.",
            "2Wir mögen ___ Musik.", "5Sie isst ___ Obst.", "5Er kauft ___ Hemd.",
            "2Ich trage ___ Uhr.", "3Wir fahren mit ___ Zug.", "2Sie liest ___ Zeitung.",
            "3Er spielt ___ Gitarre.", "3Ich sehe ___ Schiff.", "2Wir haben ___ Idee.",
            "3Sie geht in ___ Park.", "3Er malt ___ Porträt.", "2Ich höre ___ Vögel.",
            "2Wir besuchen ___ Verwandte.", "2Sie trägt ___ Schuhe.", "2Er schreibt ___ Geschichte.",
            "5Ich esse ___ Eis.", "3Wir reisen in ___ Stadt.", "5Sie trinkt ___ Kaffee.",
            "3Er hat ___ Handy.", "3Ich spiele ___ Instrument.", "2Wir machen ___ Foto.",
            "2Sie hört ___ Musik.", "2Er liest ___ Brief.", "5Ich trinke ___ Wasser.",
            "2Wir kaufen ___ Lebensmittel.", "2Sie öffnet ___ Buch.", "2Er besucht ___ Freund.",
            "2Ich höre ___ Radio.", "2Wir mögen ___ Blumen.",
            "5Sie isst ___ Schokolade.", "2Er kauft ___ Geschenk.",
            "2Ich trage ___ Jacke.", "3Wir fahren auf ___ Land.", "2Sie liest ___ Buch.",
            "3Er spielt ___ Spiel.", "2Ich sehe ___ Haus.", "2Wir haben ___ Katze.",
            "3Sie geht in ___ Schule.", "3Er malt ___ Bild.", "2Ich höre ___ Lied.",
            "2Wir besuchen ___ Restaurant.","2Wir reisen in ___ Ferien.","5Sie trinkt ___ Tee.",
            "2Sie trägt ___ Hut.", "3Er hat ___ Computer.", "2Ich esse ___ Früchte.",
            "3Er liest ___ Zeitung.", "2Ich spiele ___ Sport.",
            "2Wir machen ___ Spaziergang.", "2Sie hört ___ Musik.",
            "2Er öffnet ___ Fenster.", "2Ich trage ___ Schuhe.", "2Wir kaufen ___ Kleidung.",
            "2Sie besucht ___ Arzt.", "3Er malt ___ Landschaft.", "2Ich sehe ___ Tier.",
            "2Wir haben ___ Auto.", "3Sie geht in ___ Geschäft.", "3Er liest ___ Buch.",
            "5Ich trinke ___ Kaffee.", "2Wir mögen ___ Essen.", "5Sie isst ___ Abendessen.",
            "2Er kauft ___ Handy.", "2Ich trage ___ Hut.", "2Wir fahren in ___ Urlaub.",
            "2Sie liest ___ Zeitschrift.", "3Er spielt ___ Fußball.", "2Ich höre ___ Stimme.",
            "5Ich gebe ___ Kind einen Ball.", "3Sie hilft ___ Mann.", "4Wir schreiben ___ Lehrerin.",
            "4Er erzählt ___ Familie.", "2Sie kauft ___ Freund Blumen.", "2Ich helfe ___ Eltern.",
            "2Wir geben ___ Schwester ein Buch.", "3Er zeigt ___ Arzt seinen Arm.", "2Sie erzählt ___ Lehrer eine Geschichte.",
            "2Ich schicke ___ Chef eine E-Mail.", "2Wir bringen ___ Nachbarn Kuchen.", "3Er leiht ___ Kollegen seinen Stift.",
            "2Sie schenkt ___ Kind ein Spielzeug."
    };
    private String[] questionsa2 = {};
    private String[] questionsb1 = {};






    int currentQuestionIndex=0, AnsweredQuestions=0;
    String sentens;
    String correctans;
    TextView questionTextView;
    RadioGroup answerRadioGroup;
    Button submitButton;
    LinearLayout mainLayout;
    MainActivity m = new MainActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padezh);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
       // System.out.println(questions.length);
       // System.out.println(correctAnswers.length);

        questionTextView = findViewById(R.id.questionTextView);
        answerRadioGroup = findViewById(R.id.answerRadioGroup);
        submitButton = findViewById(R.id.submitButton);
        mainLayout = findViewById(R.id.Layout);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
            }
        });

        loadNextQuestion();
    }

    private void loadNextQuestion() {
        int num_ans=0;
        if(m.in_a1){
            int t=(int) (Math.random() * questionsa1.length);
            sentens = questionsa1[t].substring(1);
            num_ans=questionsa1[t].charAt(0);
        }
        else if(m.in_a2){
            int t=(int) (Math.random() * questionsa2.length);
            sentens = questionsa2[t].substring(1);
            num_ans=questionsa2[t].charAt(0);
        }
        else if(m.in_b1){
            int t=(int) (Math.random() * questionsb1.length);
            sentens = questionsb1[t].substring(1);
            num_ans=questionsb1[t].charAt(0);
        }
        clearRadioButtons();
        questionTextView.setText(sentens);

        switch (num_ans){
            case 1:
                correctans="der";
                break;
            case 2:
                correctans="die";
                break;
            case 3:
                correctans="das";
                break;
            case 4:
                correctans="dem";
                break;
            case 5:
                correctans="den";
                break;
            case 6:
                correctans="des";
                break;
        }
    }

    private void checkAnswer() {
        int selectedRadioButtonId = answerRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
        String selectedAnswer = selectedRadioButton.getText().toString();

        if (selectedAnswer.equals(correctans)) {
            //Toast.makeText(this, "Richtig!", Toast.LENGTH_SHORT).show();
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightGreen));
            submitButton.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.LimeGreen));
            loadNextQuestion();
        }
        else {
            //Toast.makeText(this, "Ihre Antwort ist falsch", Toast.LENGTH_SHORT).show();
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightRed));
            submitButton.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.lightDarkRed));
        }
    }

    private void clearRadioButtons() {
        answerRadioGroup.clearCheck();
    }
}