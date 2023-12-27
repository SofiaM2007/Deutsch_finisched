package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Frageworter extends AppCompatActivity {
    //1 - Woher 2 - wo 3-wohin
    String[] quastion = {"1 kommst du?", "2 bist du?", "3 gehst du?",
            "1 kommst du?", "2 ist dein Buch?", "3 gehst du heute Abend?", "1 fährst du in den Urlaub?",
            "2 ist deine Mutter geboren?", "3 möchtest du im Sommer reisen?", "1 kommst du so früh?",
            "2 hast du das Auto geparkt?", "3 fährst du nach der Arbeit?", "1 weißt du, wie spät es ist?",
            "2 ist der Supermarkt hier?", "3 gehst du am Wochenende?", "1 kommst du mit dem Zug?",
            "2 ist der Bahnhof in dieser Stadt?", "3 fliegst du in den Ferien?", "1 kennst du den Weg zur Schule?",
            "2 ist dein Handy?", "3 gehst du nach dem Essen?", "1 kommst du mit dem Bus?",
            "2 ist die Bushaltestelle in der Nähe?", "3 fährst du morgen früh?", "1 weißt du, woher der Kaffee kommt?",
            "2 ist dein Fahrrad?", "3 radelst du in die Stadt?", "1 kommst du so müde?", "2 ist dein Laptop?",
            "3 gehst du heute Nachmittag?", "1 weißt du, woher der Wind weht?", "2 ist der Park hier?",
            "3 gehst du am Samstagabend?", "1 kommst du aus dem Kino?,", "2 ist der Film gut?",
            "3 gehst du ins Theater?", "1 weißt du, woher die Blumen kommen?",
            "2 ist dein Lieblingsrestaurant?", "3 gehst du zum Arzt?", "1 kommst du so glücklich?",
            "2 ist dein Hund?", "3 gehst du zum Sport?", "1 weißt du, woher das Geräusch kommt?",
            "2 ist dein Lieblingslied?", "3 gehst du in die Disco?", "1 kommst du so traurig?",
            "2 ist dein Kühlschrank?", "3 gehst du zur Party?", "1 weißt du, woher die Vögel singen?",
            "2 ist dein Lieblingsbuch?", "3 gehst du zum Konzert?", "1 kommst du mit dem Flugzeug?",
            "2 ist der Flughafen in dieser Stadt?", "3 fliegst du im Winter?", "1 weißt du, woher die Idee kam?",
            "2 ist dein Computer?", "3 gehst du zur Konferenz?", "1 kommst du so gestresst?",
            "2 ist dein Lieblingsessen?", "3 gehst du zum Picknick?", "1 weißt du, woher die Nachrichten kommen?",
            "2 ist dein Fernseher?", "3 gehst du zum Entspannen?", "1 kommst du so aufgeregt?",
            "2 ist deine Tasche?", "3 gehst du zur Hochzeit?", "1 weißt du, woher die Informationen kommen?",
            "2 ist dein Motorrad?", "3 fährst du in die Berge?",
            "1 kommst du mit dem Schiff?", "2 ist der Hafen in dieser Stadt?", "3 fährst du im Frühling?",
            "1 weißt du, woher die Mode kommt?", "2 ist dein Kleiderschrank?", "3 gehst du zum Einkaufen?",
            "1 kommst du so gut gelaunt?", "2 ist dein Radio?", "3 hörst du Musik?",
            "1 weißt du, woher die Wolken kommen?", "2 ist deine Jacke?", "3 gehst du spazieren?",
            "1 kommst du so nervös?", "2 ist deine Uhr?", "3 gehst du zum Meeting?",
            "1 weißt du, woher die Träume kommen?", "2 ist dein Kissen?", "3 gehst du schlafen?",
            "1 kommst du mit dem Taxi?", "2 ist die Haltestelle hier?", "3 fährst du in den Osterferien?",
            "1 weißt du, woher die Sterne kommen?", "2 ist dein Teleskop?", "3 gehst du zur Sternwarte?",
            "1 kommst du so verwirrt?", "2 ist dein Rucksack?", "3 gehst du wandern?",
            "1 weißt du, woher die Geräusche kommen?", "2 ist dein Mikrofon?",
            "3 gehst du zum Konzert?", "1 kommst du so ruhig?",
            "2 ist dein Fernglas?", "3 gehst du zur Vogelbeobachtung?", "1 weißt du, woher die Geschichten kommen?"};

    Spinner spinner;
    TextView frage;
    RelativeLayout mainLayout;
    Button button;

    String correctAnswer;
    String selectedAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frageworter);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        spinner = findViewById(R.id.fragewort);
        frage = findViewById(R.id.frage);
        button = findViewById(R.id.check);
        mainLayout = findViewById(R.id.layout);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.Frageworter,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Установите слушатель событий для Spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                selectedAnswer = parentView.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                selectedAnswer = null;
            }
        });
       //frage.setText("Ваше значение");
         quastiongeneration();
    }

    public void quastiongeneration() {
        int t = (int) (Math.random() * quastion.length);
        String sentenceNow = quastion[t].substring(1);
        char questionType = quastion[t].charAt(0);

        if (questionType == '1') {
            correctAnswer = "Woher";
        } else if (questionType == '2') {
            correctAnswer = "Wo";
        } else if (questionType == '3') {
            correctAnswer = "Wohin";
        }

       // Toast.makeText(Frageworter.this, "" + sentenceNow, Toast.LENGTH_SHORT).show();
        frage.setText(sentenceNow);
    }

    public void checkanswer(View view) {
        if (button.getText().equals("Check")) {
            if (selectedAnswer != null) {
                if (selectedAnswer.equals(correctAnswer)) {
                    mainLayout.setBackgroundColor(ContextCompat.getColor(Frageworter.this, R.color.lightGreen));
                    button.setText("Next");
                } else {
                    mainLayout.setBackgroundColor(ContextCompat.getColor(Frageworter.this, R.color.lightRed));
                }
            } else {
                Toast.makeText(Frageworter.this, "Wähl etwas", Toast.LENGTH_SHORT).show();
            }
        } else {
            spinner.setSelection(0);
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.litePurple));
            button.setText("Check");
            quastiongeneration();
        }
    }

}
