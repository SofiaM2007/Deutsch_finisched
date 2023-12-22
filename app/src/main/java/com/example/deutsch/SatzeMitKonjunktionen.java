package com.example.deutsch;

import static java.lang.Math.min;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SatzeMitKonjunktionen extends AppCompatActivity {

    String sentencesA1[]=new String[]{ //und oder aber sondern
            "Ich trinke gerne Tee und", "meine Schwester trinkt Kaffee", "Er spielt Fußball, aber", "er mag auch Basketball",
            "Ich esse gerne Pizza, oder", "ich esse Pasta", "Wir gehen ins Kino, denn", "es läuft ein interessanter Film",
            "Sie liest Bücher, sondern", "sie schreibt auch Geschichten", "Du magst Schokolade, und", "ich mag Eiscreme",
            "Ich lerne Deutsch, aber", "mein Freund lernt Französisch", "Wir fahren mit dem Zug, oder", "wir nehmen den Bus",
            "Er arbeitet im Büro, denn", "er ist Angestellter",
            "Ich bin müde, aber", "ich möchte nicht schlafen", "Es regnet draußen, oder", "die Sonne scheint",
            "Sie ist traurig, und", "ich versuche sie zu trösten", "Ich habe Hunger, aber", "ich habe kein Geld",
            "Du hast einen Hund, oder", "du hast eine Katze", "Er geht in die Schule, denn", "er ist Schüler",
            "Wir fahren in den Urlaub, oder", "wir bleiben zu Hause", "Sie mag Musik, und", "sie kann gut singen",
            "Ich trinke Wasser, aber", "ich trinke keine Limonade", "Es ist spät, oder", "es ist früh",
            "Er ist groß, aber", "sein Bruder ist klein", "Du bist fleißig, und", "ich bin faul",
            "Wir essen Pizza, oder", "wir bestellen Sushi", "Sie hat lange Haare, und", "er hat kurze Haare",
            "Ich habe Zeit, aber", "ich habe keine Lust", "Es ist warm draußen, oder", "es ist kalt",
            "Er spricht Englisch, aber", "er spricht kein Französisch", "Wir spielen Fußball, und", "wir spielen auch Tennis",
            "Sie liest Zeitung, oder", "sie sieht fern", "Ich mag Sommer, denn", "ich mag warmes Wetter",
            "Es ist laut hier, aber", "ich kann dich gut hören", "Du bist schnell, und", "ich bin langsam",
            "Er isst gern Gemüse, oder", "er isst Fleisch", "Wir fahren Rad, denn", "wir wollen fit bleiben",
            "Sie ist jung, aber", "sie ist sehr intelligent", "Ich gehe einkaufen, und", "ich kaufe neue Schuhe",
            "Es ist hell draußen, oder", "es ist dunkel", "Er liest Bücher, aber", "er schreibt keine Geschichten",
            "Du spielst Klavier, oder", "du spielst Gitarre", "Wir lachen viel, denn", "wir haben Spaß", "Sie mag Fußball, und", "sie mag Basketball auch",
            "Ich koche gerne, aber", "ich backe nicht gerne", "Es ist sonnig, oder", "es ist bewölkt",
            "Er ist freundlich, und", "er ist hilfsbereit", "Wir besuchen Oma, oder", "wir besuchen Opa",
            "Sie ist krank, aber", "sie geht trotzdem zur Arbeit", "Ich trinke Tee, und", "ich trinke Kaffee",
            "Es ist heiß, oder", "es ist kühl", "Er kann gut zeichnen, aber", "er kann nicht gut singen",
            "Wir machen Sport, und", "wir essen gesund", "Sie hat lange Beine, oder", "sie hat kurze Beine",
            "Ich arbeite viel, aber", "ich verdiene nicht viel", "Es ist ruhig hier, und", "ich kann mich gut konzentrieren",
            "Du magst Hunde, oder", "du magst Katzen", "Er hat eine Schwester, aber", "er hat keinen Bruder",
            "Wir gehen ins Schwimmbad, oder", "wir gehen spazieren", "Sie ist fröhlich, und", "sie ist optimistisch",
            "Ich lerne Mathe, aber", "ich finde Englisch einfacher", "Es ist trocken, oder", "es ist nass",
            "Er ist fit, und", "er treibt regelmäßig Sport", "Du hast Recht, aber", "ich habe meine Meinung",
            "Wir essen Obst, oder", "wir essen Gemüse", "Sie trägt eine Brille, aber", "sie trägt keine Kontaktlinsen",
            "Ich fahre gern Fahrrad, und", "ich fahre auch Roller", "Es ist windig, oder", "es ist windstill",
            "Er ist aufgeregt, aber", "er ist nicht nervös", "Wir spielen im Park, und", "wir spielen im Garten",
            "Sie trägt ein Kleid, oder", "sie trägt eine Hose", "Ich wohne in der Stadt, aber", "ich mag die Natur",
            "Es ist leer hier, und", "wir sind alleine", "Er kommt später, oder", "er kommt früher",
            "Wir haben Zeit, aber", "wir haben keine Lust", "Sie spricht gut Spanisch, und", "sie spricht auch Französisch",
            "Ich trinke gerne Saft, oder", "ich trinke Wasser", "Es ist voll hier, oder", "es ist leer",
            "Er ist fleißig, aber", "er ist nicht perfekt", "Wir machen Urlaub am Meer, und", "wir machen Ausflüge",
            "Sie hat lange Haare, oder", "sie hat kurze Haare", "Ich gehe zur Arbeit, aber", "ich habe frei",
            "Es ist teuer, oder", "es ist billig", "Er ist verheiratet, und", "er hat zwei Kinder",
            "Wir essen Pizza, oder", "wir bestellen eine Pizza", "Sie liest gerne Romane, aber", "sie liest keine Comics",
            "Ich trinke gerne Tee, und", "ich trinke auch Kaffee", "Es ist kalt draußen, oder", "es ist warm",
            "Er ist sportlich, aber", "er ist nicht sehr schnell", "Wir gehen spazieren, und", "wir gehen Rad fahren",
            "Sie tanzt gut, oder", "sie singt gut", "Ich koche das Abendessen, aber", "ich bestelle manchmal Essen",
            "Es ist langweilig, oder", "es ist interessant", "Er ist nett, und", "er ist hilfsbereit",
            "Wir reisen gerne, oder", "wir bleiben zu Hause", "Sie ist müde, aber", "sie möchte nicht schlafen",
            "Ich mag Schokolade, und", "ich mag Kekse", "Es ist dunkel draußen, oder", "es ist hell",
            "Er geht zur Schule, aber", "er hat Ferien", "Wir essen gerne Eis, und", "wir essen auch Kuchen",
            "Sie ist jung, oder", "sie ist alt", "Ich lerne Deutsch, aber", "ich spreche auch Englisch",
            "Es ist spät, oder", "es ist früh", "Er ist groß, und", "er ist stark"
    };

    String sentencesA2[]=new String[]{//ob weil dass wenn als
            "Ich frage mich, ob" , "er heute kommt", "Wir gehen ins Kino, weil", "wir einen Film sehen möchten",
            "Es ist wichtig, dass", "du pünktlich bist", "Wenn das Wetter schön ist,", "gehen wir spazieren",
            "Er lernt Deutsch, weil", "er in Deutschland arbeiten möchte", "Ich weiß nicht, ob", "ich Zeit habe",
            "Wir sind glücklich, dass", "wir im Urlaub sind", "Wenn du hungrig bist,", "kannst du etwas essen",
            "Ich erinnere mich, dass", "wir gestern im Park waren", "Es ist besser, wenn", "du früher kommst",
            "Sie freut sich, dass", "ihr Geburtstag ist", "Wenn es regnet,", "bleiben wir zu Hause",
            "Ich verstehe nicht, ob", "das richtig ist", "Er fragt mich, ob", "ich helfen kann",
            "Es ist schwer, weil", "es viele Aufgaben gibt", "Wenn du Zeit hast,", "können wir telefonieren",
            "Sie ist müde, weil", "sie lange gearbeitet hat", "Ich denke, dass", "es bald besser wird",
            "Wir sind froh, dass", "wir hierher gekommen sind", "Wenn du krank bist,", "solltest du zum Arzt gehen",
            "Er hofft, dass", "er die Prüfung besteht", "Es ist schön, wenn", "die Sonne scheint",
            "Sie fragt sich, ob", "es morgen regnet", "Wenn du Geld hast,", "kannst du einkaufen gehen",
            "Ich merke, dass", "ich mich verbessere", "Er ist sauer, weil", "jemand sein Fahrrad genommen hat",
            "Es ist besser, wenn", "du früh aufstehst", "Wenn du müde bist,", "solltest du schlafen",
            "Sie ist neugierig, ob", "er heute kommt", "Es ist schwer, weil", "es viele Hausaufgaben gibt",
            "Wenn du Zeit hast,", "können wir uns treffen", "Ich denke, dass", "es eine gute Idee ist",
            "Er ist gestresst, weil", "er viel Arbeit hat", "Es ist angenehm, wenn", "es warm ist",
            "Wenn du Fragen hast,", "kannst du mich fragen", "Sie zweifelt, ob", "sie das Richtige tut",
            "Es ist notwendig, dass", "du dich beeilst", "Wenn du dich beeilst,", "kommst du rechtzeitig",
            "Ich bin glücklich, dass", "wir uns wiedersehen", "Er ist überrascht, weil", "er ein Geschenk bekommt",
            "Es ist sinnvoll, wenn", "du dich vorbereitest", "Es ist nützlich, wenn", "man neue Dinge lernt",
            "Wenn du Hilfe brauchst,", "stehe ich zur Verfügung", "Ich finde es schade, dass", "sie nicht dabei sein kann",
            "Er ist müde, weil", "er lange gearbeitet hat", "Es ist kompliziert, wenn", "es viele Regeln gibt",
            "Wenn du krank bist,", "solltest du im Bett bleiben", "Sie hat Angst, dass", "sie die Prüfung nicht besteht",
            "Es ist schwierig, wenn", "man wenig Erfahrung hat", "Wenn du Zeit hast,", "können wir telefonieren",
            "Ich bin sicher, dass", "wir eine Lösung finden werden", "Er ist besorgt, weil", "er seine Brieftasche verloren hat",
            "Es ist interessant, wenn", "man neue Leute kennenlernt", "Wenn du hungrig bist,", "solltest du etwas essen",
            "Sie ist gespannt, ob", "sie den Job bekommt", "Es ist wichtig, dass", "du deine Aufgaben erledigst",
            "Wenn du Zeit hast,", "können wir uns treffen", "Ich hoffe, dass", "wir uns bald wiedersehen",
            "Er ist erstaunt, weil", "er die Antwort kennt", "Es ist entspannend, wenn", "man Musik hört",
            "Wenn du gestresst bist,", "solltest du eine Pause machen", "Sie ist froh, dass", "sie die Prüfung bestanden hat",
            "Wenn du Probleme hast,", "solltest du um Hilfe bitten", "Ich finde es komisch, dass", "er immer zu spät kommt",
            "Er ist optimistisch, weil", "er gute Nachrichten gehört hat", "Es ist schwer, wenn", "man wenig Zeit hat",
            "Wenn du müde bist,", "solltest du früh ins Bett gehen", "Sie ist traurig, dass", "sie die Party verpasst hat",
            "Es ist verständlich, wenn", "du Fragen hast", "Wenn du motiviert bist,", "kannst du alles erreichen",
            "Ich bin sicher, dass", "wir eine Lösung finden werden", "Er ist glücklich, weil", "er den Wettbewerb gewonnen hat",
            "Es ist spannend, wenn", "man neue Orte entdeckt", "Wenn du Zweifel hast,", "solltest du nachfragen",
            "Sie ist überrascht, dass", "er Geburtstag hat", "Es ist wichtig, wenn", "man Verantwortung übernimmt",
            "Wenn du Angst hast,", "solltest du dich beruhigen", "Ich finde es schade, dass", "sie nicht dabei sein kann",
            "Er ist gestresst, weil", "er viel Arbeit hat", "Es ist schwierig, wenn", "man wenig Erfahrung hat",
            "Wenn du Zeit hast,", "können wir telefonieren", "Sie ist besorgt, ob", "sie die Prüfung schafft",
            "Es ist interessant, wenn", "man neue Dinge lernt", "Wenn du hungrig bist,", "solltest du etwas essen",
            "Ich bin optimistisch, dass", "alles gut wird", "Er ist erfreut, weil", "er eine Einladung bekommen hat",
            "Es ist angenehm, wenn", "man Zeit für sich selbst hat", "Wenn du Fragen hast,", "kannst du mich fragen",
            "Sie ist verwirrt, ob", "sie den richtigen Weg kennt", "Es ist notwendig, dass", "du pünktlich bist",
            "Wenn du motiviert bist,", "kannst du viel erreichen", "Ich hoffe, dass", "wir uns bald wiedersehen",
            "Er ist überrascht, dass", "sie heute kommt", "Es ist entspannend, wenn", "man sich ausruht",
            "Wenn du Zweifel hast,", "solltest du nachfragen", "Sie ist beeindruckt, dass", "er so gut Deutsch spricht",
            "Es ist verständlich, wenn", "du Fragen hast", "Wenn du Angst hast,", "solltest du dich beruhigen",
            "Ich bin überzeugt, dass", "du das schaffst", "Er ist dankbar, weil", "sie ihm geholfen hat"
    };


    TextView[] textViews = new TextView[5];

    TextView begginSentens;
    Button checkButton;
    float[] lastX = new float[5];
    List<String> shuffledWords;
    int currentSentenceIndex;

    MainActivity m = new MainActivity();

    int size = textViews.length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satze_mit_konjunktionen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        checkButton=findViewById(R.id.checkButton);

        begginSentens=findViewById(R.id.textViewBegin);

        textViews[0] = findViewById(R.id.textView1);
        textViews[1] = findViewById(R.id.textView2);
        textViews[2] = findViewById(R.id.textView3);
        textViews[3] = findViewById(R.id.textView4);
        textViews[4] = findViewById(R.id.textView5);

        for (int i = 0; i < size; i++) {
            final int index = i;
            textViews[i].setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            lastX[index] = event.getRawX() - v.getX();
                            v.bringToFront(); // Перемещаем текущий элемент поверх остальных
                            break;
                        case MotionEvent.ACTION_MOVE:
                            float newX = event.getRawX() - lastX[index];
                            float newLeftX = Math.max(0, min(newX, ((ViewGroup) v.getParent()).getWidth() - v.getWidth()));
                            v.setX(newLeftX);
                            break;
                    }
                    return true;
                }
            });
        }
        shuffleSentence();
    }
    // Выбирает случайное предложение из массива и перемешивает его слова
    String[] words;

    private void shuffleSentence() {
        String sentence=" ";
        if(m.in_a1) {
            currentSentenceIndex = new Random().nextInt(sentencesA1.length/2);
            currentSentenceIndex*=2;
            sentence = sentencesA1[currentSentenceIndex-1];
            begginSentens.setText(sentencesA1[currentSentenceIndex-2]);
            System.out.println("a1");
        }
        else if(m.in_a2) {
            currentSentenceIndex = new Random().nextInt(sentencesA2.length/2);
            currentSentenceIndex*=2;
            sentence = sentencesA2[currentSentenceIndex-1];
            begginSentens.setText(sentencesA2[currentSentenceIndex-2]);
            System.out.println("a2");
        }

        words = sentence.split(" ");
        shuffledWords = Arrays.asList(words);
        Collections.shuffle(shuffledWords);

        if(size > words.length){
            for(int i = words.length; i < size; i++) {
                textViews[i].setVisibility(View.GONE);
            }
            size = words.length;
        }
        else if(size < words.length){
            for(int i = size; i < words.length; i++) {
                textViews[i].setVisibility(View.VISIBLE);
            }
            size = words.length;
        }

        updateTextViews();
    }

    // Обновляет содержимое textViews с перемешанными словами
    private void updateTextViews() {
        for (int i = 0; i < size; i++) {
            textViews[i].setText(shuffledWords.get(i));
        }
    }

    // Метод, вызываемый при проверке предложения
    public void checkSentence(View view) {

        RelativeLayout mainLayout = findViewById(R.id.mainLayout);

        if("Überprüfen".equals(checkButton.getText())){
            List<String> userWords = new ArrayList<>();

            // Сортируем блоки по их текущим позициям (координатам)
            TextView[] firstNTextViews = Arrays.copyOf(textViews, size);
            Arrays.sort(firstNTextViews, (textView1, textView2) -> Float.compare(textView1.getX(), textView2.getX()));

            for (TextView textView : firstNTextViews) {
                userWords.add(textView.getText().toString());
            }

            String userSentence = TextUtils.join(" ", userWords);
            String originalSentence = " ";// = sentences[currentSentenceIndex];
            if(m.in_a1){
                originalSentence = sentencesA1[currentSentenceIndex-1];
            }
            else if(m.in_a2){
                originalSentence = sentencesA2[currentSentenceIndex-1];
            }

            System.out.println(userSentence+" " + originalSentence);

            if (userSentence.equals(originalSentence)) {
                checkButton.setText("Weiter");
                mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.GreenYellowLite));
            } else {
                mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.Tomato));

            }
        }
        else{
            checkButton.setText("Überprüfen");
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.Pink));
            shuffleSentence();
        }
    }
}