package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Satze_mit_ohne_zu extends AppCompatActivity {

    String satzA2[]=new String[]{
            "Ich möchte Deutsch ___ lernen.0", "Er muss seine Hausaufgaben ___ machen.0",
            "Wir können nicht ___ kommen.0", "Ihr dürft nicht ___ lügen.0",
            "Ich kann schnell ___ laufen.0", "Sie darf heute fern___sehen.0",
            "Wir wollen zusammen ___ picknicken.0", "Du darfst jetzt laut ___ singen.0",
            "Ihr könnt prima ___ schwimmen.0", "Wir müssen die Fenster ___ schließen.0",
            "Ich möchte gerne ___ reisen.0", "Sie kann gut ___ kochen.0",
            "Wir dürfen heute ___ spielen.0", "Er will nach Hause ___ gehen.0",
            "Ihr könnt schnell ___ rennen.0", "Du darfst heute ___ fernsehen.0",
            "Sie kann gut ___ zeichnen.0", "Er möchte nach Hause ___ fahren.0",
            "Ihr dürft heute ___ skifahren.0", "Ich kann gut ___ tanzen.0",
            "Du kannst prima ___ fotografieren.0", "Ihr könnt gut ___ basteln.0",
            "Sie möchte nach Hause ___ schwimmen.0", "Wir dürfen heute ___ grillen.0",
            "Er kann schnell ___ lesen.0", "Ich will morgen früh ___ joggen.0",
            "Wir müssen das Zimmer ___ aufräumen.0", "Ich möchte heute ___ einkaufen.0",
            "Ihr könnt laut ___ singen.0", "Du darfst jetzt ___ träumen.0",
            "Wir dürfen heute ___ picknicken.0", "Ich kann gut ___ skaten.0",
            "Sie darf heute ___ shoppen.0", "Ihr könnt prima ___ jonglieren.0",
            "Ich möchte nach Hause ___ gehen.0", "Sie kann schnell ___ schwimmen.0",
            "Wir dürfen heute ___ angeln.0", "Du darfst heute ___ fernsehen.0",
            "Ihr könnt schnell ___ laufen.0", "Wir können gut ___ kochen.0",
            "Er will nach Hause ___ fahren.0", "Ich darf heute ___ ausschlafen.0",
            "Wir müssen den Hund ___ ausführen.0", "Ihr könnt prima ___ zeichnen.0",
            "Ich möchte nach Hause ___ gehen.0", "Sie darf heute ___ ausschlafen.0",
            "Du darfst heute ___ fernsehen.0", "Ihr könnt laut ___ singen.0",
            "Ich kann gut ___ tanzen.0", "Wir dürfen heute ___ picknicken.0",
            "Er möchte nach Hause ___ gehen.0", "Sie kann gut ___ zeichnen.0",
            "Ihr könnt prima ___ schwimmen.0", "Ich möchte Deutsch ___ lernen.0",
            "Er muss seine Hausaufgaben ___ machen.0", "Wir können nicht ___ kommen.0",
            "Ihr dürft nicht ___ lügen.0", "Ich kann schnell ___ laufen.0",
            "Sie darf heute fern___sehen.0", "Wir wollen zusammen ___ picknicken.0",
            "Du darfst jetzt laut ___ singen.0", "Ihr könnt prima ___ schwimmen.0",
            "Wir müssen die Fenster ___ schließen.0", "Ich möchte gerne ___ reisen.0",
            "Sie kann gut ___ kochen.0", "Wir dürfen heute ___ spielen.0",
            "Er will nach Hause ___ gehen.0", "Ihr könnt schnell ___ rennen.0",
            "Du darfst heute ___ fernsehen.0", "Sie kann gut ___ zeichnen.0",
            "Er möchte nach Hause ___ fahren.0", "Ihr dürft heute ___ skifahren.0",
            "Ich liebe es, ___ lesen.1", "Er hat keine Zeit, ___ kochen.1",
            "Sie vergisst oft, ___ telefonieren.1", "Du musst, ___ frühstücken, bevor du zur Arbeit gehst.1",
            "Es macht Spaß, ___ tanzen, wenn die Musik gut ist.1", "Sie plant, ___ reisen, um neue Länder zu entdecken.1",
            "Wir versuchen, ___ lernen, um unsere Deutschkenntnisse zu verbessern.1",
            "Er hat die Absicht, zu laufen, um fit ___ bleiben.1",
            "Ich vergesse oft, ___ meine Freunde anzurufen.1", "Es ist wichtig, ___ trinken, um hydratisiert zu bleiben.1",
            "Sie plant, zu malen, um ihre kreative Seite aus___drücken.1", "Wir versuchen, ___ verstehen, wie man dieses Problem löst.1",
            "Du hast die Erlaubnis, ___ spielen, solange du fertig mit den Hausaufgaben bist.1", "Er hat Spaß, ___ singen.1",
            "Ich denke daran, ein___kaufen.1", "Wir planen, ___ wandern.1",
            "Sie hat keine Zeit, fern___sehen.1", "Du versuchst, ___ kochen.1",
            "Es ist schön, ___ schwimmen.1", "Er vergisst oft, auf___räumen.1",
            "Ich mag es, ___ zeichnen.1", "Wir haben die Absicht, ___ reisen.1",
            "Sie versucht, ___ verstehen.1", "Ich denke daran, ___ schreiben.1",
            "Es macht Spaß, ___ fotografieren.1", "Er hat die Absicht, ___ spielen.1",
            "Du hast die Erlaubnis, ___ joggen.1", "Sie plant, ___ tanzen.1",
            "Wir versuchen, ___ lesen.1", "Ich mag es, ___ kochen.1",
            "Er hat keine Zeit, ___ lernen.1", "Es ist schön, ___ singen.1",
            "Sie vergisst oft, ___ telefonieren.1", "Du versuchst, ___ shoppen.1",
            "Ich plane, ___ schwimmen.1", "Wir denken daran, ___ wandern.1",
            "Er hat Spaß, ___ malen.1", "Sie versucht, ___ joggen.1",
            "Ich denke daran, ___ schreiben.1", "Es macht Spaß, ___ zeichnen.1",
            "Wir haben die Absicht, ___ reisen.1", "Du hast die Erlaubnis, ___ tanzen.1",
            "Er hat die Absicht, ___ spielen.1", "Ich mag es, ___ lesen.1",
            "Wir versuchen, ___ kochen.1", "Es ist schön, fern___sehen.1",
            "Sie vergisst oft, auf___räumen.1", "Du versuchst, ___ verstehen.1",
            "Ich plane, ein___kaufen.1", "Er hat Spaß, ___ schwimmen.1",
            "Wir haben die Absicht, ___ fotografieren.1", "Sie versucht, ___ singen.1",
            "Ich denke daran, ___ malen.1", "Es macht Spaß, ___ joggen.1",
            "Du hast die Erlaubnis, ___ schreiben.1", "Er hat die Absicht, ___ wandern.1",
            "Ich mag es, ___ telefonieren.1", "Wir versuchen, ___ zeichnen.1",
            "Es ist schön, ___ shoppen.1", "Sie vergisst oft, ___ lesen.1",
            "Du versuchst, ___ kochen.1", "Ich plane, auf___räumen.1",
            "Er hat Spaß, ___ einkaufen.1", "Wir haben die Absicht, ___ singen.1",
            "Sie versucht, ___ fotografieren.1", "Ich denke daran, ___ joggen.1",
            "Es macht Spaß, ___ verstehen.1", "Du hast die Erlaubnis, ___ tanzen.1",
            "Er hat die Absicht, ___ schreiben.1", "Ich mag es, ___ wandern.1",
            "Wir versuchen, ___ malen.1", "Es ist schön, ___ lesen.1",
            "Sie vergisst oft, ___ fernsehen.1", "Du versuchst, ___ telefonieren.1",
            "Ich plane, ___ aufräumen.1", "Er hat Spaß, ___ kochen.1",
            "Wir haben die Absicht, ___ joggen.1", "Sie versucht, ___ fotografieren.1",
            "Ich denke daran, ___ verstehen.1", "Es macht Spaß, ___ singen.1",
            "Du hast die Erlaubnis, ___ malen.1", "Er hat die Absicht, ___ shoppen.1",
            "Ich mag es, ein___kaufen.1", "Wir versuchen, fern___sehen.1",
            "Es ist schön, ___ wandern.1", "Sie vergisst oft, ___ schreiben.1",
            "Du versuchst, ___ telefonieren.1", "Ich plane, auf___räumen.1",
            "Er hat Spaß, ___ verstehen.1", "Wir haben die Absicht, ___ lesen.1",
            "Sie versucht, ___ kochen.1", "Es macht Spaß, ___ joggen.1",
            "Ich denke daran, ___ shoppen.1", "Du hast die Erlaubnis, ___ fotografieren.1",
            "Er hat die Absicht, ___ tanzen.1", "Ich mag es, ___ schreiben.1",
            "Es ist schön, ___ malen.1", "Wir versuchen, ___ singen.1"
    };
    String satzB1[]=new String[]{    "Er lernt Deutsch, um ___ reisen.1", "Sie arbeitet hart, um erfolgreich ___ sein.1",
            "Wir sparen Geld, um ___ kaufen.1", "Ich übe Yoga, um ___ entspannen.1",
            "Sie nimmt Medikamente, um gesund ___ bleiben.1", "Er geht aus dem Haus, ohne ___ frühstücken.1",
            "Sie verlässt den Raum, ohne ___ sagen.1", "Wir fahren in den Urlaub, ohne ___ planen.1",
            "Ich gehe ins Bett, ohne ___ lesen.1", "Sie geht zur Arbeit, ohne müde ___ sein.1",
            "Er geht ins Kino, anstatt ___ studieren.1", "Sie isst Schokolade, anstatt Gemüse.0",
            "Wir nehmen den Zug, anstatt Auto ___ fahren.1", "Ich rufe an, anstatt ___ schreiben.1",
            "Sie geht spazieren, anstatt ___ laufen.1", "Er lernt Deutsch, um ___ reisen.1",
            "Sie arbeitet hart, um erfolgreich ___ sein.1", "Wir sparen Geld, um ___ kaufen.1",
            "Ich übe Yoga, um ___ entspannen.1", "Sie nimmt Medikamente, um gesund ___ bleiben.1",
            "Er geht aus dem Haus, ohne ___ frühstücken.1", "Sie verlässt den Raum, ohne ___ sagen.1",
            "Wir fahren in den Urlaub, ohne ___ planen.1", "Ich gehe ins Bett, ohne ___ lesen.1",
            "Sie geht zur Arbeit, ohne müde ___ sein.1", "Er geht ins Kino, anstatt ___ studieren.1",
            "Sie isst Schokolade, anstatt ___ Gemüse.0", "Wir nehmen den Zug, anstatt Auto ___ fahren.1",
            "Ich rufe an, anstatt ___ schreiben.1", "Sie geht spazieren, anstatt ___ laufen.1",
            "Er vergisst oft, ___ frühstücken.1", "Sie geht ins Bett, ohne ___ lesen.1",
            "Wir fahren in den Urlaub, um ___ entspannen.1", "Ich trinke Kaffee, umwach ___  bleiben.1",
            "Du gehst spazieren, um frische Luft ___ genießen.1", "Er verlässt das Haus, ohne ___ prüfen, ob er den Schlüssel hat.1",
            "Sie telefoniert, ohne auf___legen.1", "Wir lernen Deutsch, um ___ reisen.1",
            "Ich esse Gemüse, um gesund ___ bleiben.1", "Sie schreibt einen Brief, ohne Fehler ___ korrigieren.1",
            "Er trainiert jeden Tag, um fit ___ sein.1", "Wir singen, um Freude ___ teilen.1",
            "Ich gehe einkaufen, ohne Geld mit___nehmen.1", "Sie malt ein Bild, um ihre Kreativität aus___drücken.1",
            "Er spielt Klavier, ohne Noten ___ lesen.1", "Wir machen einen Ausflug, um die Natur ___ genießen.1",
            "Sie läuft im Park, ohne müde ___ werden.1", "Ich koche ein Gericht, um meine Familie ___ überraschen.1",
            "Du schaust fern, um ___ entspannen.1", "Er hört Musik, ohne die Lautstärke ___ erhöhen.1",
            "Wir treffen uns, um ___ plaudern.1", "Sie reist, ohne ihre Familie ___ informieren.1",
            "Ich lese ein Buch, um meine Kenntnisse ___ erweitern.1", "Du machst Sport, um fit ___ bleiben.1",
            "Er schreibt einen Artikel, ohne die Quellen ___ überprüfen.1", "Wir gehen aus, um Freunde ___ treffen.1",
            "Sie lacht, ohne den Grund ___ kennen.1", "Ich spiele Gitarre, um meine Gefühle aus___drücken.1",
            "Du besuchst einen Kurs, um eine neue Fähigkeit ___ lernen.1", "Er repariert das Auto, ohne die Anleitung ___ lesen.1",
            "Wir machen eine Pause, um einen Kaffee ___ trinken.1", "Sie arbeitet, ohne sich aus___ruhen.1",
            "Ich gehe schwimmen, um Sport ___ treiben.1", "Du schreibst einen Brief, ohne die Adresse ___ kennen.1",
            "Er backt einen Kuchen, um seine Freunde ein___laden.1", "Wir schauen einen Film, ohne den Inhalt ___ kennen.1",
            "Ich mache Yoga, um meine Flexibilität ___ verbessern.1", "Er bestellt Essen, ohne ___ kochen.1",
            "Wir machen einen Ausflug, um die Landschaft ___ bewundern.1", "Sie malt ein Bild, ohne die Farben ___ mischen.1",
            "Ich höre Musik, um mich ___ entspannen.1", "Du isst Schokolade, um deine Stimmung ___ verbessern.1",
            "Er spielt Fußball, ohne sich auf___wärmen.1", "Wir trinken Tee, um uns auf___wärmen.1",
            "Sie liest ein Buch, ohne den Autor ___ kennen.1", "Ich gehe spazieren, um frische Luft ___ schnappen.1",
            "Du machst einen Kurs, um neue Fähigkeiten ___ erlernen.1", "Er singt ein Lied, ohne die Worte ___ kennen.1",
            "Wir planen einen Urlaub, um die Sonne ___ genießen.1", "Er spielt Videospiele, anstatt ___ Hausaufgaben.0",
            "Sie sieht Filme, anstatt ___ Bücher.0", "Wir machen Fotos, anstatt ___ Malerei.0",
            "Ich trinke Wein, anstatt ___ Bier.0", "Du isst Pommes, anstatt ___ Salat.0",
            "Er hört Rockmusik, anstatt ___ Klassik.0", "Sie benutzt den Aufzug, anstatt ___ Treppe.0",
            "Wir kaufen Kleidung, anstatt ___ Lebensmittel.0", "Ich esse Kekse, anstatt ___ Obst.0",
            "Du liest Magazine, anstatt ___ Zeitungen.0", "Sie fährt Auto, anstatt ___ Fahrrad.0",
            "Wir trinken Tee, anstatt ___ Kaffee.0", "Ich sehe Serien, anstatt ___ Filme.0",
            "Er nimmt den Bus, anstatt ___ Zug.0", "Sie benutzt das Smartphone, anstatt ___ Computer.0",
            "Er trinkt Kaffee ohne ___ Zucker.0", "Wir machen einen Ausflug ohne ___ Plan.0",
            "Ich gehe spazieren ohne ___ Jacke.0", "Du isst Pizza ohne ___ Käse.0",
            "Sie kauft ein Kleid ohne ___ Muster.0", "Wir machen Sport ohne ___ Ausrüstung.0",
            "Ich trinke Tee ohne ___ Zucker.0", "Er schreibt einen Brief ohne ___ Fehler.0",
            "Sie hört Musik ohne ___ Kopfhörer.0", "Wir besuchen einen Freund ohne ___ Einladung.0",
            "Ich lese ein Buch ohne ___ Bilder.0", "Du gehst ins Kino ohne ___ Geld.0",
            "Sie spielt Tennis ohne ___ Partner.0", "Er isst Schokolade ohne ___ Nüsse.0",
            "Wir machen eine Pause ohne ___ Grund.0", "Sie malt ein Bild ohne ___ Farben.0",
            "Ich trinke Wasser ohne ___ Eis.0", "Du gehst einkaufen ohne ___ Liste.0",
            "Er macht eine Reise ohne ___ Plan.0"};

    MainActivity m = new MainActivity();
    String answ;
    TextView frage;

    String myAnswer;
    Button mit;
    Button ohne;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satze_mit_ohne_zu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        mit=findViewById(R.id.mitButton);
        ohne=findViewById(R.id.ohneButton);
        frage=findViewById(R.id.questionTextView);

        genesateSatz();

    }


    private void genesateSatz() {
        String sentence="";
        char num='2';
        int randomIndex;
        if (m.in_a2) {
            randomIndex = (int) (Math.random() * satzA2.length);
            sentence = satzA2[randomIndex].substring(0, satzA2[randomIndex].length() - 1);
            num=satzA2[randomIndex].charAt(satzA2[randomIndex].length() - 1);
        }
        else if (m.in_b1) {
            randomIndex = (int) (Math.random() * satzB1.length);
            sentence = satzB1[randomIndex].substring(0, satzB1[randomIndex].length() - 1);
            num=satzB1[randomIndex].charAt(satzB1[randomIndex].length() - 1);
        }

        if(num=='0'){
            answ="ohne zu";
        }
        else if(num=='1'){
            answ="mit zu";
        }

        frage.setText(sentence);

    }

    public void checkAnswer(View view) {

        Button selectedButton = (Button) view;
        if (selectedButton.getId() == R.id.mitButton) {
            myAnswer = (String)mit.getText();
        } else if (selectedButton.getId() == R.id.ohneButton) {
            myAnswer = (String)ohne.getText();
        }

        if (answ.equals(myAnswer)) {
            selectedButton.setBackgroundColor(ContextCompat.getColor(Satze_mit_ohne_zu.this, R.color.LimeGreen));
        } else {
            selectedButton.setBackgroundColor(ContextCompat.getColor(Satze_mit_ohne_zu.this, R.color.lightDarkRed));
            //System.out.println(myAnswer+" "+correctAnswer);
        }
        // ждёт 2 секунды
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                genesateSatz();
                selectedButton.setBackgroundColor(ContextCompat.getColor(Satze_mit_ohne_zu.this, R.color.MediumOrchid));
            }
        }, 1000);
        //resetQuestion();
    }
}