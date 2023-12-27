package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
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
            "5Der Lehrer erklärt ___ Schülern die Aufgabe.",
            "2Die Katze jagt ___ Maus durch den Garten.",
            "5Ich trinke ___ Kaffee am Morgen.",
            "5Sie trägt ___ Hut auf dem Kopf.",
            "3Wir besuchen ___ Museum in der Stadt.",
            "5Meine Eltern kaufen ___ neuen Computer.",
            "5Er isst ___ Apfel zum Frühstück.",
            "2Ich höre ___ Musik im Auto.",
            "4Der Arzt gibt ___ Patienten Medikamente.",
            "5Die Kinder spielen mit ___ Hunden im Park.",
            "5Sie schreibt ___ Brief an ihre Freundin.",
            "3Der Koch bereitet ___ leckere Abendessen zu.",
            "5Wir sehen ___ Film im Kino.",
            "5Die Lehrerin zeigt ___ Schülern die interessante Präsentation.",
            "5Ich kaufe ___ neuen Pullover im Geschäft.",
            "3Die Gäste bewundern ___ Gemälde in der Galerie.",
            "1Er hat den Schlüssel in ___ Tasche verloren.",
            "2Die Gärtner pflanzen ___ Blumen im Garten.",
            "2Sie öffnet ___ Tür mit dem Schlüssel.",
            "3Die Kinder mögen ___ Spielzeug sehr.",
            "2Wir hören ___ Vögel im Park singen.",
            "2Der Musiker spielt ___ Gitarre auf der Bühne.",
            "2Ich esse ___ Pizza zum Mittagessen.",
            "3Die Touristen fotografieren ___ Denkmal am Marktplatz.",
            "2Die Lehrerin lobt ___ Schüler für gute Leistungen.",
            "2Der Bauer füttert ___ Kühe auf dem Bauernhof.",
            "2Er trägt ___ Uhr am Handgelenk.",
            "2Die Kinder malen ___ Bilder im Kunstunterricht.",
            "5Wir kaufen ___ neuen Fernseher für das Wohnzimmer.",
            "3Die Eltern schenken dem Kind ___ Fahrrad zum Geburtstag.",
            "2Ich lese ___ Zeitung jeden Morgen.",
            "2Der Gärtner gießt ___ Blumen im Park.",
            "2Der Chef gibt dem Mitarbeiter ___ wichtige Aufgabe.",
            "2Die Sportler trainieren ___ Muskeln im Fitnessstudio.",
            "2Sie besucht ___ Freundin am Wochenende.",
            "2Der Tourist fotografiert ___ Sehenswürdigkeiten in der Stadt.",
            "2Die Lehrer loben ___ Schülerinnen für ihre Anstrengungen.",
            "5Die Katze klettert ___ Baum im Garten hoch.",
            "5Ich trage ___ Rucksack auf dem Rücken.",
            "2Der Fotograf macht ___ Fotos während des Events.",
            "3Die Eltern schenken dem Kind ___ Buch zum Geburtstag.",
            "3Der Mechaniker repariert ___ Auto in der Werkstatt.",
            "2Sie isst ___ Schokolade als Nachtisch.",
            "3Die Schüler besuchen ___ Museum auf dem Klassenausflug.",
            "5Die Lehrerin zeigt ___ Schülern den richtigen Weg.",
            "2Die Touristen bewundern ___ Landschaft während der Reise.",
            "3Ich höre ___ Lied auf dem Radio.",
            "3Der Künstler malt ___ Porträt im Atelier.",
            "2Wir kaufen ___ Geschenk für die Party.",
            "2Die Kinder füttern ___ Enten im Park.",
            "5Er trägt ___ Mantel bei kaltem Wetter.",
            "5Die Eltern kaufen ___ neuen Tisch für die Küche.",
            "2Der Lehrer erklärt den Schülerinnen ___ Grammatikregeln.",
            "3Die Sportler trinken ___ Wasser nach dem Training.",
            "3Sie liest ___ Buch in der Bibliothek.",
            "3Der Hund begleitet ___ Herrchen bei jedem Spaziergang.",
            "2Die Köchin kocht ___ Suppe in der Küche.",
            "2Der Gärtner pflegt ___ Blumen im Blumenbeet.",
            "5Ich trinke ___ Tee am Abend.",
            "5Der Lehrer erklärt ___ Schülern die Lösung des Problems.",
            "3Der Mechaniker repariert ___ Fahrrad in der Werkstatt.",
            "3Die Eltern schenken dem Kind ___ Puzzle zum Geburtstag.",
            "3Wir kaufen den neuen Teppich für ___ Wohnzimmer.",
            "3Die Gäste bewundern die Architektur ___ Gebäudes.",
            "2Der Fotograf macht ___ Fotos während der Hochzeit.",
            "2Sie hört ___ Musik mit Kopfhörern.",
            "5Der Lehrer erklärt ___ Schülern die Lösung des Problems.",
            "3Der Mechaniker repariert ___ Fahrrad in der Werkstatt.",
            "3Die Eltern schenken dem Kind ___ Puzzle zum Geburtstag.",
            "2Ich esse ___ Erdbeeren zum Nachtisch.",
            "2Die Touristen besuchen ___ Sehenswürdigkeiten in der Stadt.",
            "3Die Lehrerin zeigt den Schülern ___ richtige Verhalten.",
            "4Die Kinder spielen mit ___ Sand am Strand.",
            "5Er trägt ___ Hut im Sommer.",
            "3Der Künstler malt ___ Landschaftsbild auf Leinwand.",
            "2Die Eltern schenken dem Kind ___ Uhr zum Geburtstag.",
            "2Die Sportler trainieren ___ Ausdauer im Fitnessstudio.",
            "5Sie besucht ___ Freund am Wochenende.",
            "2Die Kinder füttern ___ Tiere im Zoo."
};
    private String[] questionsa2 = {"5Der Lehrer erklärt ___ Schülern die Aufgabe.",
            "2Die Katze jagt ___ Maus durch den Garten.",
            "5Ich trinke ___ Kaffee am Morgen.",
            "5Sie trägt ___ Hut auf dem Kopf.",
            "3Wir besuchen ___ Museum in der Stadt.",
            "5Meine Eltern kaufen ___ neuen Computer.",
            "5Er isst ___ Apfel zum Frühstück.",
            "2Ich höre ___ Musik im Auto.",
            "4Der Arzt gibt ___ Patienten Medikamente.",
            "5Die Kinder spielen mit ___ Hunden im Park.",
            "5Sie schreibt ___ Brief an ihre Freundin.",
            "3Der Koch bereitet ___ leckere Abendessen zu.",
            "5Wir sehen ___ Film im Kino.",
            "5Die Lehrerin zeigt ___ Schülern die interessante Präsentation.",
            "5Ich kaufe ___ neuen Pullover im Geschäft.",
            "3Die Gäste bewundern ___ Gemälde in der Galerie.",
            "1Er hat den Schlüssel in ___ Tasche verloren.",
            "2Die Gärtner pflanzen ___ Blumen im Garten.",
            "2Sie öffnet ___ Tür mit dem Schlüssel.",
            "3Die Kinder mögen ___ Spielzeug sehr.",
            "2Wir hören ___ Vögel im Park singen.",
            "2Der Musiker spielt ___ Gitarre auf der Bühne.",
            "2Ich esse ___ Pizza zum Mittagessen.",
            "3Die Touristen fotografieren ___ Denkmal am Marktplatz.",
            "2Die Lehrerin lobt ___ Schüler für gute Leistungen.",
            "2Der Bauer füttert ___ Kühe auf dem Bauernhof.",
            "2Er trägt ___ Uhr am Handgelenk.",
            "2Die Kinder malen ___ Bilder im Kunstunterricht.",
            "5Wir kaufen ___ neuen Fernseher für das Wohnzimmer.",
            "3Die Eltern schenken dem Kind ___ Fahrrad zum Geburtstag.",
            "2Ich lese ___ Zeitung jeden Morgen.",
            "2Der Gärtner gießt ___ Blumen im Park.",
            "2Der Chef gibt dem Mitarbeiter ___ wichtige Aufgabe.",
            "2Die Sportler trainieren ___ Muskeln im Fitnessstudio.",
            "2Sie besucht ___ Freundin am Wochenende.",
            "2Der Tourist fotografiert ___ Sehenswürdigkeiten in der Stadt.",
            "2Die Lehrer loben ___ Schülerinnen für ihre Anstrengungen.",
            "5Die Katze klettert ___ Baum im Garten hoch.",
            "5Ich trage ___ Rucksack auf dem Rücken.",
            "2Der Fotograf macht ___ Fotos während des Events.",
            "3Die Eltern schenken dem Kind ___ Buch zum Geburtstag.",
            "3Der Mechaniker repariert ___ Auto in der Werkstatt.",
            "2Sie isst ___ Schokolade als Nachtisch.",
            "3Die Schüler besuchen ___ Museum auf dem Klassenausflug.",
            "5Die Lehrerin zeigt ___ Schülern den richtigen Weg.",
            "2Die Touristen bewundern ___ Landschaft während der Reise.",
            "3Ich höre ___ Lied auf dem Radio.",
            "3Der Künstler malt ___ Porträt im Atelier.",
            "2Wir kaufen ___ Geschenk für die Party.",
            "2Die Kinder füttern ___ Enten im Park.",
            "5Er trägt ___ Mantel bei kaltem Wetter.",
            "5Die Eltern kaufen ___ neuen Tisch für die Küche.",
            "2Der Lehrer erklärt den Schülerinnen ___ Grammatikregeln.",
            "3Die Sportler trinken ___ Wasser nach dem Training.",
            "3Sie liest ___ Buch in der Bibliothek.",
            "3Der Hund begleitet ___ Herrchen bei jedem Spaziergang.",
            "2Die Köchin kocht ___ Suppe in der Küche.",
            "2Der Gärtner pflegt ___ Blumen im Blumenbeet.",
            "5Ich trinke ___ Tee am Abend.",
            "5Der Lehrer erklärt ___ Schülern die Lösung des Problems.",
            "3Der Mechaniker repariert ___ Fahrrad in der Werkstatt.",
            "3Die Eltern schenken dem Kind ___ Puzzle zum Geburtstag.",
            "3Wir kaufen den neuen Teppich für ___ Wohnzimmer.",
            "3Die Gäste bewundern die Architektur ___ Gebäudes.",
            "2Der Fotograf macht ___ Fotos während der Hochzeit.",
            "2Sie hört ___ Musik mit Kopfhörern.",
            "5Der Lehrer erklärt ___ Schülern die Lösung des Problems.",
            "3Der Mechaniker repariert ___ Fahrrad in der Werkstatt.",
            "3Die Eltern schenken dem Kind ___ Puzzle zum Geburtstag.",
            "2Ich esse ___ Erdbeeren zum Nachtisch.",
            "2Die Touristen besuchen ___ Sehenswürdigkeiten in der Stadt.",
            "3Die Lehrerin zeigt den Schülern ___ richtige Verhalten.",
            "4Die Kinder spielen mit ___ Sand am Strand.",
            "5Er trägt ___ Hut im Sommer.",
            "3Der Künstler malt ___ Landschaftsbild auf Leinwand.",
            "2Die Eltern schenken dem Kind ___ Uhr zum Geburtstag.",
            "2Die Sportler trainieren ___ Ausdauer im Fitnessstudio.",
            "5Sie besucht ___ Freund am Wochenende.",
            "2Die Kinder füttern ___ Tiere im Zoo.",
            "4Ich gebe ___ Hund einen Knochen.",
            "4Die Lehrerin hilft ___ Schüler bei den Hausaufgaben.",
            "4Wir schenken ___ Geburtstagskind ein Buch.",
            "4Der Arzt verschreibt ___ Patienten Medikamente.",
            "4Sie gibt ___ Kind einen Luftballon.",
            "5Der Gärtner gibt ___ Pflanzen Wasser.",
            "4Die Mutter kauft ___ Kind eine neue Jacke.",
            "4Wir zeigen ___ Touristen den Weg zum Bahnhof.",
            "5Der Lehrer erklärt ___ Schülern die Regel.",
            "4Ich schicke ___ Freund eine Geburtstagskarte.",
            "4Die Köchin gibt ___ Gericht die besondere Note.",
            "4Er leiht ___ Freund sein Fahrrad.",
            "4Die Oma erzählt ___ Enkel eine Geschichte.",
            "4Wir bestellen ___ Kellner einen Kaffee.",
            "4Der Fotograf zeigt ___ Model die richtige Pose.",
            "4Die Eltern kaufen ___ Kind ein neues Spielzeug.",
            "4Der Musiker spielt ___ Publikum ein Stück auf der Gitarre.",
            "4Sie gibt ___ Vogel Futter im Garten.",
            "4Der Chef gibt ___ Mitarbeiter eine wichtige Aufgabe.",
            "1Die Freundin schenkt ___ Freundin einen Blumenstrauß.",
            "1Wir schreiben ___ Lehrerin einen Dankesbrief.",
            "1Der Bauer füttert ___ Tieren auf dem Bauernhof.",
            "4Die Ärztin verschreibt ___ Patienten ein Rezept.",
            "1Der Maler zeigt ___ Gruppe seine neuen Kunstwerke.",
            "4Sie gibt ___ Hund ein Leckerli.",
            "4Wir geben ___ Projektteam eine Präsentation.",
            "2Der Professor erklärt den Studenten ___ Theorie.",
            "4Die Eltern schenken ___ Kind einen Computer.",
            "1Wir schenken ___ Freundin einen Geburtstagsstrauß.",
            "4Der Verkäufer zeigt ___ Kunden das Produkt."
    };
    private String[] questionsb1 = {"5Der Lehrer erklärt ___ Schülern die Aufgabe.",
            "2Die Katze jagt ___ Maus durch den Garten.",
            "5Ich trinke ___ Kaffee am Morgen.",
            "5Sie trägt ___ Hut auf dem Kopf.",
            "3Wir besuchen ___ Museum in der Stadt.",
            "5Meine Eltern kaufen ___ neuen Computer.",
            "5Er isst ___ Apfel zum Frühstück.",
            "2Ich höre ___ Musik im Auto.",
            "4Der Arzt gibt ___ Patienten Medikamente.",
            "5Die Kinder spielen mit ___ Hunden im Park.",
            "5Sie schreibt ___ Brief an ihre Freundin.",
            "3Der Koch bereitet ___ leckere Abendessen zu.",
            "5Wir sehen ___ Film im Kino.",
            "5Die Lehrerin zeigt ___ Schülern die interessante Präsentation.",
            "5Ich kaufe ___ neuen Pullover im Geschäft.",
            "3Die Gäste bewundern ___ Gemälde in der Galerie.",
            "1Er hat den Schlüssel in ___ Tasche verloren.",
            "2Die Gärtner pflanzen ___ Blumen im Garten.",
            "2Sie öffnet ___ Tür mit dem Schlüssel.",
            "3Die Kinder mögen ___ Spielzeug sehr.",
            "2Wir hören ___ Vögel im Park singen.",
            "2Der Musiker spielt ___ Gitarre auf der Bühne.",
            "2Ich esse ___ Pizza zum Mittagessen.",
            "3Die Touristen fotografieren ___ Denkmal am Marktplatz.",
            "2Die Lehrerin lobt ___ Schüler für gute Leistungen.",
            "2Der Bauer füttert ___ Kühe auf dem Bauernhof.",
            "2Er trägt ___ Uhr am Handgelenk.",
            "2Die Kinder malen ___ Bilder im Kunstunterricht.",
            "5Wir kaufen ___ neuen Fernseher für das Wohnzimmer.",
            "3Die Eltern schenken dem Kind ___ Fahrrad zum Geburtstag.",
            "2Ich lese ___ Zeitung jeden Morgen.",
            "2Der Gärtner gießt ___ Blumen im Park.",
            "2Der Chef gibt dem Mitarbeiter ___ wichtige Aufgabe.",
            "2Die Sportler trainieren ___ Muskeln im Fitnessstudio.",
            "2Sie besucht ___ Freundin am Wochenende.",
            "2Der Tourist fotografiert ___ Sehenswürdigkeiten in der Stadt.",
            "2Die Lehrer loben ___ Schülerinnen für ihre Anstrengungen.",
            "5Die Katze klettert ___ Baum im Garten hoch.",
            "5Ich trage ___ Rucksack auf dem Rücken.",
            "2Der Fotograf macht ___ Fotos während des Events.",
            "3Die Eltern schenken dem Kind ___ Buch zum Geburtstag.",
            "3Der Mechaniker repariert ___ Auto in der Werkstatt.",
            "2Sie isst ___ Schokolade als Nachtisch.",
            "3Die Schüler besuchen ___ Museum auf dem Klassenausflug.",
            "5Die Lehrerin zeigt ___ Schülern den richtigen Weg.",
            "2Die Touristen bewundern ___ Landschaft während der Reise.",
            "3Ich höre ___ Lied auf dem Radio.",
            "3Der Künstler malt ___ Porträt im Atelier.",
            "2Wir kaufen ___ Geschenk für die Party.",
            "2Die Kinder füttern ___ Enten im Park.",
            "5Er trägt ___ Mantel bei kaltem Wetter.",
            "5Die Eltern kaufen ___ neuen Tisch für die Küche.",
            "2Der Lehrer erklärt den Schülerinnen ___ Grammatikregeln.",
            "3Die Sportler trinken ___ Wasser nach dem Training.",
            "3Sie liest ___ Buch in der Bibliothek.",
            "3Der Hund begleitet ___ Herrchen bei jedem Spaziergang.",
            "2Die Köchin kocht ___ Suppe in der Küche.",
            "2Der Gärtner pflegt ___ Blumen im Blumenbeet.",
            "5Ich trinke ___ Tee am Abend.",
            "5Der Lehrer erklärt ___ Schülern die Lösung des Problems.",
            "3Der Mechaniker repariert ___ Fahrrad in der Werkstatt.",
            "3Die Eltern schenken dem Kind ___ Puzzle zum Geburtstag.",
            "3Wir kaufen den neuen Teppich für ___ Wohnzimmer.",
            "3Die Gäste bewundern die Architektur ___ Gebäudes.",
            "2Der Fotograf macht ___ Fotos während der Hochzeit.",
            "2Sie hört ___ Musik mit Kopfhörern.",
            "5Der Lehrer erklärt ___ Schülern die Lösung des Problems.",
            "3Der Mechaniker repariert ___ Fahrrad in der Werkstatt.",
            "3Die Eltern schenken dem Kind ___ Puzzle zum Geburtstag.",
            "2Ich esse ___ Erdbeeren zum Nachtisch.",
            "2Die Touristen besuchen ___ Sehenswürdigkeiten in der Stadt.",
            "3Die Lehrerin zeigt den Schülern ___ richtige Verhalten.",
            "4Die Kinder spielen mit ___ Sand am Strand.",
            "5Er trägt ___ Hut im Sommer.",
            "3Der Künstler malt ___ Landschaftsbild auf Leinwand.",
            "2Die Eltern schenken dem Kind ___ Uhr zum Geburtstag.",
            "2Die Sportler trainieren ___ Ausdauer im Fitnessstudio.",
            "5Sie besucht ___ Freund am Wochenende.",
            "2Die Kinder füttern ___ Tiere im Zoo.",
            "4Ich gebe ___ Hund einen Knochen.",
            "4Die Lehrerin hilft ___ Schüler bei den Hausaufgaben.",
            "4Wir schenken ___ Geburtstagskind ein Buch.",
            "4Der Arzt verschreibt ___ Patienten Medikamente.",
            "4Sie gibt ___ Kind einen Luftballon.",
            "5Der Gärtner gibt ___ Pflanzen Wasser.",
            "4Die Mutter kauft ___ Kind eine neue Jacke.",
            "4Wir zeigen ___ Touristen den Weg zum Bahnhof.",
            "5Der Lehrer erklärt ___ Schülern die Regel.",
            "4Ich schicke ___ Freund eine Geburtstagskarte.",
            "4Die Köchin gibt ___ Gericht die besondere Note.",
            "4Er leiht ___ Freund sein Fahrrad.",
            "4Die Oma erzählt ___ Enkel eine Geschichte.",
            "4Wir bestellen ___ Kellner einen Kaffee.",
            "4Der Fotograf zeigt ___ Model die richtige Pose.",
            "4Die Eltern kaufen ___ Kind ein neues Spielzeug.",
            "4Der Musiker spielt ___ Publikum ein Stück auf der Gitarre.",
            "4Sie gibt ___ Vogel Futter im Garten.",
            "4Der Chef gibt ___ Mitarbeiter eine wichtige Aufgabe.",
            "1Die Freundin schenkt ___ Freundin einen Blumenstrauß.",
            "1Wir schreiben ___ Lehrerin einen Dankesbrief.",
            "1Der Bauer füttert ___ Tieren auf dem Bauernhof.",
            "4Die Ärztin verschreibt ___ Patienten ein Rezept.",
            "1Der Maler zeigt ___ Gruppe seine neuen Kunstwerke.",
            "4Sie gibt ___ Hund ein Leckerli.",
            "4Wir geben ___ Projektteam eine Präsentation.",
            "2Der Professor erklärt den Studenten ___ Theorie.",
            "4Die Eltern schenken ___ Kind einen Computer.",
            "1Wir schenken ___ Freundin einen Geburtstagsstrauß.",
            "4Der Verkäufer zeigt ___ Kunden das Produkt.",
            "6Das ist das Auto ___ Lehrers.",
            "6Die Farbe ___ Himmels verändert sich.",
            "6Ich bewundere ___ Geduld ___ Künstlers.",
            "6Das ist das Haus ___ Nachbarn.",
            "6Die Größe ___ Projekts beeindruckt mich.",
            "6Der Name ___ Buches ist mir entfallen.",
            "6Ich kenne ___ Adresse ___ Restaurants.",
            "6Die Stimme ___ Sängers ist einzigartig.",
            "6Das ist ___ Anzug ___ Mannes.",
            "6Die Idee ___ Architekten gefällt mir.",
            "6Das ist das Zimmer ___ Kindes.",
            "6Die Meinung ___ Experten ist wichtig.",
            "6Ich kenne ___ Geschichte ___ Landes.",
            "6Das ist das Ergebnis ___ Experiments.",
            "6Die Entscheidung ___ Teams steht fest.",
            "6Die Schönheit ___ Gemäldes beeindruckt die Besucher.",
            "6Das ist das Ziel ___ Projekts.",
            "6Die Meinung ___ Lehrers ist gefragt.",
            "6Das ist das Ende ___ Films.",
            "6Die Details ___ Plans sind wichtig.",
            "6Das ist ___ Lösung ___ Rätsels.",
            "6Die Farbe ___ Kleides passt gut zu ihr.",
            "6Das ist das Buch ___ Autors.",
            "6Die Atmosphäre ___ Raums ist einladend.",
            "6Das ist ___ Instrument ___ Musikers.",
            "6Die Worte ___ Gedichts sind berührend.",
            "6Das ist das Ergebnis ___ Experiments.",
            "6Die Entscheidung ___ Teams steht fest.",
            "6Das ist das Ziel ___ Projekts.",
            "6Die Meinung ___ Lehrers ist gefragt."
    };






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



        loadNextQuestion();
    }

    private void loadNextQuestion() {
        char num_ans='0';
        if(m.in_a1){
            int t=(int) (Math.random() * questionsa2.length);
            sentens = questionsa2[t].substring(1);
            num_ans=questionsa2[t].charAt(0);
        }
        else if(m.in_a2){
            int t=(int) (Math.random() * questionsb1.length);
            sentens = questionsb1[t].substring(1);
            num_ans=questionsb1[t].charAt(0);
        }
        else if(m.in_b1){
            int t=(int) (Math.random() * questionsb1.length);
            sentens = questionsb1[t].substring(1);
            num_ans=questionsb1[t].charAt(0);
        }
        clearRadioButtons();
        questionTextView.setText(sentens);

        switch (num_ans){
            case '1':
                correctans="der";
                break;
            case '2':
                correctans="die";
                break;
            case '3':
                correctans="das";
                break;
            case '4':
                correctans="dem";
                break;
            case '5':
                correctans="den";
                break;
            case '6':
                correctans="des";
                break;
            default:
                correctans="a";
        }
    }

    public void checkAnswer(View view) {
        int selectedRadioButtonId = answerRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
        String selectedAnswer = selectedRadioButton.getText().toString();

        if (selectedAnswer.equals(correctans)) {
            //Toast.makeText(this, "Richtig!", Toast.LENGTH_SHORT).show();
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightGreen));
            //submitButton.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.LimeGreen));
            // ждёт 2 секунды
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    mainLayout.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.litePurple));
                    loadNextQuestion();
                }
            }, 1000);

        }
        else {
            //Toast.makeText(this, "Ihre Antwort ist falsch "+correctans, Toast.LENGTH_SHORT).show();
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightRed));
            answerRadioGroup.clearCheck();
            //submitButton.setBackgroundColor(ContextCompat.getColor(Padezh.this, R.color.lightDarkRed));
        }
    }

    private void clearRadioButtons() {
        answerRadioGroup.clearCheck();
    }


}