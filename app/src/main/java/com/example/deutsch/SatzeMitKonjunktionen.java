package com.example.deutsch;

import static java.lang.Math.min;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

    String sentencesA2[]=new String[]{//ob weil dass wenn als deshalb
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
            "Ich bin überzeugt, dass", "du das schaffst", "Er ist dankbar, weil", "sie ihm geholfen hat",
            "Es ist kalt draußen, deshalb", "trage ich einen warmen Pullover.",
            "Die Sonne scheint, deshalb", "nehme ich meine Sonnenbrille.",
            "Ich habe viel Arbeit, deshalb", "mache ich Überstunden.",
            "Der Kaffee ist heiß, deshalb", "warte ich einen Moment.",
            "Es ist Wochenende, deshalb", "treffe ich meine Freunde.",
            "Der Film ist langweilig, deshalb", "wechsle ich den Kanal.",
            "Ich habe Kopfschmerzen, deshalb", "nehme ich eine Aspirin.",
            "Die Blumen sind schön, deshalb", "kaufe ich einen Strauß.",
            "Der Zug ist verspätet, deshalb", "verpasse ich meinen Anschluss.",
            "Das Essen ist lecker, deshalb", "bestelle ich noch einen Nachtisch.",
            "Es gibt Stau auf der Autobahn, deshalb", "komme ich zu spät.",
            "Es ist heiß heute, deshalb", "trinke ich viel Wasser.",
            "Die Musik ist laut, deshalb", "ziehe ich meine Kopfhörer auf.",
            "Der Zugang ist gesperrt, deshalb", "muss ich einen Umweg machen.",
            "Es gibt Rabatt, deshalb", "kaufe ich ein neues Handy.",
            "Es regnet stark, deshalb", "nehme ich meinen Regenschirm.",
            "Der Computer funktioniert nicht, deshalb", "rufe ich den Support.",
            "Der Chef ist nicht da, deshalb", "gehe ich früher nach Hause.",
            "Es gibt ein Angebot, deshalb", "kaufe ich zwei zum Preis von einem.",
            "Es ist still im Büro, deshalb", "kann ich mich gut konzentrieren.",
            "Die Straßen sind glatt, deshalb", "fahre ich besonders vorsichtig.",
            "Es ist spät, deshalb", "gehe ich ins Bett.",
            "Die Blumen brauchen Wasser, deshalb", "gieße ich sie täglich.",
            "Die Batterie ist leer, deshalb", "lade ich mein Handy auf.",
            "Der Kühlschrank ist leer, deshalb", "gehe ich einkaufen.",
            "Es gibt ein Problem, deshalb", "rufe ich den Kundenservice an.",
            "Es ist laut, deshalb", "schließe ich die Fenster.",
            "Die Blumen sind verwelkt, deshalb", "werfe ich sie weg.",
            "Es ist dunkel, deshalb", "mache ich das Licht an.",
            "Die Straßen sind voll, deshalb", "benutze ich den öffentlichen Verkehr.",
            "Es ist sonnig, deshalb", "nehme ich meine Sonnenbrille mit.",
            "Die Tasche ist klein, deshalb", "nehme ich nur das Nötigste mit.",
            "Es ist neblig, deshalb", "fahre ich besonders vorsichtig.",
            "Die Kinder sind müde, deshalb", "bringe ich sie ins Bett.",
            "Es gibt eine Baustelle, deshalb", "muss ich einen Umweg nehmen.",
            "Der Wecker klingelt früh, deshalb", "stehe ich sofort auf.",
            "Es ist voll im Restaurant, deshalb", "bestelle ich zum Mitnehmen.",
            "Der Kaffee ist aus, deshalb", "muss ich neuen kaufen.",
            "Es ist Wochenende, deshalb", "plane ich einen Ausflug.",
            "Die Straßen sind leer, deshalb", "komme ich schnell voran.",
            "Es ist kalt im Büro, deshalb", "ziehe ich eine Jacke an.",
            "Die Pizza ist heiß, deshalb", "warte ich, bevor ich sie esse.",
            "Es ist laut in der Stadt, deshalb", "ziehe ich mich zurück.",
            "Die Nachrichten sind traurig, deshalb", "schalte ich den Fernseher aus.",
            "Es ist hell, deshalb", "mache ich die Vorhänge zu.",
            "Die Treppe ist steil, deshalb", "gehe ich langsam.",
            "Es ist ruhig im Wald, deshalb", "genieße ich die Stille.",
            "Der Zug fährt ab, deshalb", "renne ich zum Bahnsteig.",
            "Es gibt einen Stau, deshalb", "verwende ich eine alternative Route.",
            "Die Jacke ist kaputt, deshalb", "kaufe ich eine neue.",
            "Es ist voll im Bus, deshalb", "stehe ich die ganze Fahrt.",
            "Die Blumen sind bunt, deshalb", "freue ich mich darüber."
    };

    String sentencesB2[]=new String[]{//dadurch, dass und indem
            "Sie lernt Spanisch, indem", "sie täglich Vokabeln übt.",
            "Er stärkt seine Ausdauer, indem", "er regelmäßig joggt.",
            "Wir fördern die Zusammenarbeit, indem", "wir Teamwork trainieren.",
            "Ich koche gesünder, indem", "ich frische Zutaten wähle.",
            "Er baut Muskeln auf, indem", "er Gewichte hebt.",
            "Sie entwickelt neue Fähigkeiten, indem", "sie Kurse besucht.",
            "Wir sparen Energie, indem", "wir das Licht ausschalten.",
            "Ich steigere die Produktivität, indem", "ich Prioritäten setze.",
            "Er fördert seine Kreativität, indem", "er Kunstwerke schafft.",
            "Sie schützt die Umwelt, indem", "sie recycelt.",
            "Wir verbessern die Kommunikation, indem", "wir Meetings planen.",
            "Ich optimiere meine Finanzen, indem", "ich Budgets erstelle.",
            "Er steigert die Effizienz, indem", "er neue Technologien nutzt.",
            "Sie baut Selbstvertrauen auf, indem", "sie Herausforderungen annimmt.",
            "Wir unterstützen die lokale Wirtschaft, indem", "wir lokal einkaufen.",
            "Ich fördere meine mentale Gesundheit, indem", "ich meditiere.",
            "Er verbessert seine Flexibilität, indem", "er Yoga praktiziert.",
            "Sie stärkt ihre sozialen Beziehungen, indem", "sie Freunde einlädt.",
            "Wir steigern die Effektivität, indem", "wir klare Ziele setzen.",
            "Ich steigere meine Leseleistung, indem", "ich regelmäßig lese.",
            "Er erhöht die Konzentration, indem", "er Pausen einlegt.",
            "Sie pflegt ihre Beziehungen, indem", "sie regelmäßig anruft.",
            "Wir verbessern die Sicherheit, indem", "wir Vorsichtsmaßnahmen treffen.",
            "Ich steigere meine Laufleistung, indem", "ich Intervalltraining mache.",
            "Er fördert seine Sprachkenntnisse, indem", "er Filme auf Englisch schaut.",
            "Sie spart Zeit, indem", "sie effiziente Arbeitsmethoden verwendet.",
            "Wir stärken die Innovationskraft, indem", "wir kreative Ideen fördern.",
            "Ich reduziere den Stress, indem", "ich bewusst entspanne.",
            "Er steigert seine Effektivität, indem", "er To-Do-Listen erstellt.",
            "Sie verbessert ihre Kochkünste, indem", "sie neue Rezepte ausprobiert.",
            "Wir fördern die Fitness, indem", "wir gemeinsam Sport treiben.",
            "Ich steigere die Effizienz, indem", "ich Ablenkungen minimiere.",
            "Er verbessert seine Haltung, indem", "er Rückenübungen macht.",
            "Sie fördert ihre Karriere, indem", "sie sich weiterbildet.",
            "Wir sparen Geld, indem", "wir Budgets einhalten.",
            "Ich optimiere meine Zeit, indem", "ich Prioritäten setze.",
            "Er fördert seine Teamarbeit, indem", "er offen kommuniziert.",
            "Sie steigert ihre Kreativität, indem", "sie neue Inspiration sucht.",
            "Wir verbessern unsere Beziehungen, indem", "wir aufeinander zugehen.",
            "Ich reduziere den Papierverbrauch, indem", "ich digital arbeite.",
            "Er steigert seine Ausdauer, indem", "er Schwimmen trainiert.",
            "Sie fördert ihre Ausdrucksfähigkeit, indem", "sie Gedichte schreibt.",
            "Wir verbessern unsere Zusammenarbeit, indem", "wir konstruktives Feedback geben.",
            "Ich stärke meine Resilienz, indem", "ich mit Herausforderungen umgehe.",
            "Er fördert seine Intelligenz, indem", "er Rätsel löst.",
            "Sie verbessert ihre Aufmerksamkeit, indem", "sie Meditation praktiziert.",
            "Wir fördern unsere Kreativität, indem", "wir Brainstorming-Sitzungen durchführen.",
            "Ich steigere meine Flexibilität, indem", "ich Stretching-Übungen mache.",
            "Er stärkt seine Selbstbeherrschung, indem", "er aufmerksam handelt.",
            "Sie verbessert ihre Schreibfähigkeiten, indem", "sie regelmäßig schreibt.",
            "Wir optimieren unsere Prozesse, indem", "wir Effizienzanalysen durchführen.",
            "Ich stärke meine emotionale Intelligenz, indem", "ich empathisch bin.",
            "Er verbessert seine Arbeitsmoral, indem", "er sich klare Ziele setzt.",
            "Sie fördert ihre Selbstreflexion, indem", "sie Tagebuch führt.",
            "Wir steigern unsere Produktivität, indem", "wir Zeitmanagement praktizieren.",
            "Ich verbessere meine Beziehungen, indem", "ich aktiv zuhöre.",
            "Er fördert seine Kommunikationsfähigkeiten, indem", "er Rhetorik studiert.",
            "Sie stärkt ihre Führungskompetenzen, indem", "sie Teamprojekte leitet.",
            "Wir optimieren unsere Gesundheit, indem", "wir auf ausgewogene Ernährung achten.",
            "Ich stärke meinen Selbstwert, indem", "ich positive Affirmationen wiederhole.",
            "Er verbessert seine Entscheidungsfähigkeiten, indem", "er rationale Überlegungen anstellt.",
            "Sie fördert ihre Musikalität, indem", "sie ein Instrument lernt.",
            "Wir steigern unsere Effektivität, indem", "wir technologische Lösungen nutzen.",
            "Ich verbessere meine Aufmerksamkeit, indem", "ich Meditation praktiziere.",
            "Er stärkt seine Teambindung, indem", "er Teambuilding-Aktivitäten organisiert.",
            "Sie optimiert ihre Lerngewohnheiten, indem", "sie verschiedene Lernmethoden ausprobiert.",
            "Wir fördern unsere Kreativität, indem", "wir uns in inspirierender Umgebung aufhalten.",
            "Ich steigere meine Motivation, indem", "ich klare Ziele setze.",
            "Er verbessert seine Konzentrationsfähigkeiten, indem", "er Ablenkungen minimiert.",
            "Sie fördert ihre Fitness, indem", "sie Outdoor-Aktivitäten genießt."
    };

    String sentencesC11[]=new String[]{    //Konnektoren andernfalls, folglich, außer wenn
            "Ich trainiere regelmäßig, andernfalls", "sinkt meine Fitness.",
            "Sie achtet auf gesunde Ernährung, folglich", "führt sie ein energiereiches Leben.",
            "Er delegiert Aufgaben geschickt, außer wenn", "es um persönliche Aufgaben geht.",
            "Wir setzen klare Ziele, andernfalls", "schweifen wir ab.",
            "Sie hält sich an den Zeitplan, außer wenn", "es unvorhersehbare Ereignisse gibt.",
            "Er analysiert kritisch, andernfalls", "fehlen uns fundierte Entscheidungen.",
            "Wir kommunizieren offen, folglich", "vermeiden wir Missverständnisse.",
            "Ich setze klare Prioritäten, außer wenn", "es spontane Dringlichkeiten gibt.",
            "Er überprüft Ergebnisse genau, folglich", "entdecken wir mögliche Verbesserungen.",
            "Ich nehme konstruktives Feedback an, andernfalls", "ist persönliche Entwicklung ausgeschlossen.",
            "Sie setzt kluge Entscheidungen um, folglich", "profitiert das gesamte Projekt.",
            "Er steuert Projekte erfolgreich, außer wenn", "unerwartete Hindernisse auftreten.",
            "Wir halten uns an Vorsichtsmaßnahmen, andernfalls", "riskieren wir die Sicherheit.",
            "Ich halte mich an ethische Standards, folglich", "gewinne ich Vertrauen.",
            "Sie überdenkt ihre Strategien regelmäßig, außer wenn", "sie auf bewährte Methoden schwört.",
            "Er schult seine Führungskompetenzen, andernfalls", "leidet die Effektivität des Teams.",
            "Wir setzen klare Erwartungen, folglich", "verhindern wir Enttäuschungen.",
            "Ich halte mich an bewährte Methoden, außer wenn", "innovative Ansätze notwendig sind.",
            "Sie achtet auf Umweltverträglichkeit, andernfalls", "schadet sie der Nachhaltigkeit.",
            "Er fördert Vielfalt im Team, folglich", "profitieren wir von unterschiedlichen Perspektiven.",
            "Wir verbessern unsere Qualitätsstandards, außer wenn", "es keinen Einfluss hat.",
            "Ich schaffe klare Regelungen, andernfalls", "entstehen Konflikte im Team.",
            "Er setzt auf kluge Technologien, außer wenn", "sie nicht den Anforderungen entsprechen.",
            "Wir fördern ein positives Arbeitsklima, andernfalls", "sinkt die Produktivität.",
            "Ich kommuniziere transparent, folglich", "gewinne ich Vertrauen.",
            "Sie vermeidet unnötige Meetings, außer wenn", "es dringende Abstimmungen erfordern.",
            "Er fördert die Selbstverantwortung, andernfalls", "verliert das Team Eigeninitiative.",
            "Wir überdenken unsere Strategien, folglich", "passen wir uns dem Markt an.",
            "Sie fördert eine offene Kommunikation, andernfalls", "entstehen Missverständnisse.",
            "Wir steigern die Kundenbindung, außer wenn", "Kundenservice vernachlässigt wird.",
            "Ich fördere das Teamengagement, andernfalls", "sinkt die Arbeitsmoral.",
            "Sie setzt auf kluge Technologien, folglich", "optimiert sie ihre Arbeitsabläufe.",
            "Er optimiert seinen Workflow, außer wenn", "alte Gewohnheiten schwer aufzugeben sind.",
            "Ich setze klare Grenzen, folglich", "erhalte ich meine Work-Life-Balance.",
            "Sie achtet auf ihre Gesundheit, außer wenn", "stressige Zeiten ihre Routinen unterbrechen.",
            "Er fördert die Teambildung, andernfalls", "leiden die Teambeziehungen.",
            "Wir setzen klare Maßnahmen, folglich", "erreichen wir unsere Ziele effizient.",
            "Ich halte mich an vereinbarte Regeln, außer wenn", "Flexibilität erforderlich ist.",
            "Sie fördert die Mitarbeiterentwicklung, andernfalls", "bleibt das Team ungeschult.",
            "Er steuert Projekte erfolgreich, folglich", "bleiben wir im Zeitrahmen.",
            "Wir setzen klare Erwartungen, außer wenn", "es unerwartete Umstände gibt.",
            "Ich halte mich an bewährte Methoden, andernfalls", "riskiere ich ineffizientes Arbeiten.",
            "Sie fördert eine positive Arbeitsatmosphäre, folglich", "steigt die Mitarbeiterzufriedenheit.",
            "Er übt regelmäßig, andernfalls,", "verliert er an Fitness.",
            "Wir planen sorgfältig, folglich,", "erreichen wir unsere Ziele.",
            "Sie achtet auf die Ernährung, außer wenn,", "sie Ausnahmetage hat.",
            "Ich spare monatlich Geld, andernfalls,", "habe ich keine Ersparnisse.",
            "Er plant Pausen ein, folglich,", "ist er produktiver.",
            "Wir kommunizieren klar, außer wenn,", "es Missverständnisse gibt.",
            "Ich trinke viel Wasser, andernfalls,", "fühle ich mich dehydriert.",
            "Sie passt auf ihre Gesundheit auf, folglich,", "bleibt sie fit.",
            "Er überprüft die Ausrüstung, außer wenn,", "es nicht notwendig ist.",
            "Wir treffen uns regelmäßig, andernfalls,", "verlieren wir den Kontakt.",
            "Ich organisiere meinen Arbeitsplatz, folglich,", "arbeite ich effizienter.",
            "Sie informiert rechtzeitig, außer wenn,", "es unvorhergesehene Probleme gibt.",
            "Er setzt klare Ziele, andernfalls,", "verliert er die Orientierung.",
            "Wir halten uns an den Zeitplan, folglich,", "erledigen wir Aufgaben pünktlich.",
            "Ich achte auf meine Ernährung, außer wenn,", "ich einen Cheat Day habe.",
            "Sie dokumentiert den Fortschritt, andernfalls,", "kann sie ihn nicht nachverfolgen.",
            "Er trainiert regelmäßig, folglich,", "steigert er seine Fitness.",
            "Wir nehmen Feedback ernst, außer wenn,", "es nicht konstruktiv ist.",
            "Ich arbeite fokussiert, andernfalls,", "verliere ich Zeit.",
            "Sie vermeidet Stressquellen, folglich,", "bleibt sie entspannt."
    };

    String sentencesC12[]=new String[]{// Konnektoren allerdings, mittlerweile, vielmehr
            "Er liebt klassische Musik, allerdings", "hört er auch gerne Jazz.",
            "Sie plant eine Reise, mittlerweile", "überlegt sie es sich anders.",
            "Wir mögen Wandern, vielmehr", "ziehen wir Radfahren vor.",
            "Ich liebe Schokolade, allerdings", "esse ich sie nur selten.",
            "Er arbeitet hart, mittlerweile", "sucht er nach mehr Ausgleich.",
            "Sie träumt von Abenteuern, vielmehr", "genießt sie die Ruhe.",
            "Wir bevorzugen Tee, allerdings", "trinken wir auch Kaffee.",
            "Ich mag Actionfilme, mittlerweile", "schaue ich lieber Dramen.",
            "Er plant einen Urlaub, vielmehr", "entscheidet er sich für Balkonien.",
            "Sie studiert Jura, allerdings", "interessiert sie sich für Kunst.",
            "Wir essen gesund, mittlerweile", "gönnen wir uns auch Süßigkeiten.",
            "Ich trainiere im Fitnessstudio, vielmehr", "mache ich Yoga zu Hause.",
            "Er arbeitet im Büro, allerdings", "träumt er von der Natur.",
            "Sie mag Hunde, mittlerweile", "überlegt sie sich eine Katze.",
            "Er liebt den Sommer, mittlerweile", "genießt er auch den Winter.",
            "Sie bevorzugt Stadtleben, vielmehr", "träumt sie von einem Bauernhof.",
            "Wir mögen Rockmusik, allerdings", "hören wir auch gerne Pop.",
            "Ich arbeite viel, mittlerweile", "plane ich mehr Freizeit ein.",
            "Er trinkt Kaffee, vielmehr", "genießt er eine Tasse Tee.",
            "Wir mögen Sport, mittlerweile", "entdecken wir die Meditation.",
            "Ich esse gerne Pizza, vielmehr", "koche ich auch gerne selbst.",
            "Er plant einen Städtetrip, allerdings", "träumt er von einem Strandurlaub.",
            "Sie mag moderne Kunst, mittlerweile", "entdeckt sie die Klassik.",
            "Wir bevorzugen Sommerurlaub, vielmehr", "genießen wir auch den Herbst.",
            "Ich trage gerne Jeans, allerdings", "schätze ich auch Anzüge.",
            "Er hört gerne Rockmusik, mittlerweile", "entdeckt er die Klassik.",
            "Sie isst gerne Schokolade, vielmehr", "achtet sie auf ihre Ernährung.",
            "Wir planen eine Weltreise, allerdings", "sparen wir noch dafür.",
            "Ich arbeite im Büro, mittlerweile", "träume ich von der Selbstständigkeit.",
            "Er mag Actionfilme, vielmehr", "schaut er auch gerne Komödien.",
            "Sie studiert Medizin, allerdings", "interessiert sie sich für Kunstgeschichte.",
            "Wir essen gerne asiatisch, mittlerweile", "entdecken wir die mediterrane Küche.",
            "Ich reise gerne, vielmehr", "erkunde ich auch meine Heimat.",
            "Er arbeitet im Verkauf, allerdings", "träumt er von einer Weltreise.",
            "Sie bevorzugt den Sommer, mittlerweile", "genießt sie auch den Frühling.",
            "Wir mögen Science-Fiction-Filme, vielmehr", "schauen wir auch gerne Dokumentationen.",
            "Ich trinke gerne Kaffee, allerdings", "genieße ich auch Tee.",
            "Er plant einen Outdoor-Urlaub, mittlerweile", "überlegt er sich eine Städtereise.",
            "Wir mögen klassische Musik, allerdings", "hören wir auch gerne Elektro.",
            "Ich arbeite im Marketing, mittlerweile", "interessiere ich mich für Fotografie.",
            "Er mag laute Konzerte, vielmehr", "geht er gerne ins Theater.",
            "Sie isst gerne Pizza, allerdings", "kocht sie auch gerne gesund.",
            "Wir planen eine Fahrradtour, mittlerweile", "überlegen wir eine Wandertour.",
            "Ich bevorzuge Stille, vielmehr", "schätze ich auch lebendige Gespräche.",
            "Er liebt Actionfilme, allerdings", "schaut er auch gerne Dramen.",
            "Sie trinkt gerne Wein, mittlerweile", "genießt sie auch Cocktails.",
            "Ich arbeite im Büro, allerdings", "träume ich von einem Homeoffice.",
            "Er plant eine Bergtour, mittlerweile", "überlegt er sich eine Städtereise.",
            "Sie bevorzugt den Winter, vielmehr", "genießt sie auch den Sommer.",
            "Wir mögen historische Romane, allerdings", "lesen wir auch gerne Krimis.",
            "Ich trinke gerne Tee, mittlerweile", "gönne ich mir auch Kaffee.",
            "Er hört gerne Popmusik, vielmehr", "entdeckt er die Weltmusik.",
            "Sie isst gerne scharf, allerdings", "schätzt sie auch süße Speisen.",
            "Wir planen eine Weltreise, mittlerweile", "überlegen wir eine Kreuzfahrt.",
            "Ich arbeite viel, vielmehr", "plane ich mehr Pausen ein.",
            "Er liebt den Sommer, allerdings", "genießt er auch den Winter.",
            "Sie bevorzugt den Tag, mittlerweile", "genießt sie auch die Nacht.",
            "Wir mögen Krimiserien, vielmehr", "schauen wir auch gerne Dramen.",
            "Ich trinke gerne Rotwein, allerdings", "genieße ich auch Weißwein.",
            "Er plant einen Strandurlaub, mittlerweile", "überlegt er sich einen Bergurlaub.",
            "Sie mag laute Musik, vielmehr", "genießt sie auch die Stille.",
            "Wir bevorzugen den Frühling, allerdings", "genießen wir auch den Herbst.",
            "Ich arbeite im Garten, mittlerweile", "träume ich von einer Stadtwohnung.",
            "Sie isst gerne scharf, allerdings", "schätzt sie auch milde Aromen."

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

        /* final AlertDialog aboutDialog = new AlertDialog.Builder(
                SatzeMitKonjunktionen.this).setMeunssage("fgh")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                    }
                }).create();

        aboutDialog.show();*/

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
        else if(m.in_b2){
            currentSentenceIndex = new Random().nextInt(sentencesB2.length/2);
            currentSentenceIndex*=2;
            sentence = sentencesB2[currentSentenceIndex-1];
            begginSentens.setText(sentencesB2[currentSentenceIndex-2]);
            System.out.println("b2");
        }
        else if(m.in_c1){
            if(m.in_konjk1){
                currentSentenceIndex = new Random().nextInt(sentencesC11.length/2);
                currentSentenceIndex*=2;
                sentence = sentencesC11[currentSentenceIndex-1];
                begginSentens.setText(sentencesC11[currentSentenceIndex-2]);
                System.out.println("C11");
            }
            else if(m.in_konjk2){
                currentSentenceIndex = new Random().nextInt(sentencesC12.length/2);
                currentSentenceIndex*=2;
                sentence = sentencesC12[currentSentenceIndex-1];
                begginSentens.setText(sentencesC12[currentSentenceIndex-2]);
                System.out.println("C12");
            }
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
            else if(m.in_b2){
                originalSentence = sentencesB2[currentSentenceIndex-1];
            }
            else if(m.in_c1){
                if(m.in_konjk1){
                    originalSentence = sentencesC11[currentSentenceIndex-1];
                }
                else if(m.in_konjk2){
                    originalSentence = sentencesC12[currentSentenceIndex-1];
                }
            }

            System.out.println(userSentence+" " + originalSentence);

            if (userSentence.equals(originalSentence)) {
                checkButton.setText("Weiter");
                mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.liteliteGreen));
            } else {
               // Toast.makeText(this, ""+, Toast.LENGTH_LONG).show();
                mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred));

            }
        }
        else{
            checkButton.setText("Überprüfen");
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.perpulBack));
            shuffleSentence();
        }
    }
}