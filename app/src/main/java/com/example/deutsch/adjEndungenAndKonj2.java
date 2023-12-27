package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
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


    String sentens_adj_a2[]={       "Das ist ein .großes. (groß) Buch", "Ich trinke .heißen. (heiß) Tee",
            "Der Hund hat einen .braunen. (braun) Fell", "Wir haben .frisches. (frisch) Obst gekauft",
            "Das ist ein .interessantes. (interessant) Experiment", "Mein Bruder spielt ein .schnelles. (schnell) Computerspiel",
            "Sie trägt ein .schönes. (schön) Kleid", "Die Blumen sind .bunte. (bunt) Tulpen",
            "Ich esse ein .leckeres. (lecker) Eis", "Das war eine .aufregende. (aufregend) Erfahrung",
            "Die Katze hat einen .kleinen. (klein) Schwanz", "Wir haben .neue. (neu) Möbel gekauft",
            "Das ist ein .teures. (teur) Restaurant", "Ich höre .laute. (laut) Musik",
            "Wir haben .sauberes. (sauber) Wasser", "Das Haus hat ein .hohes. (hoh) Dach",
            "Sie trägt einen .modernen. (modern) Hut", "Ich lese ein .spannendes. (spannend) Buch",
            "Wir essen .gesunde. (gesund) Lebensmittel", "Die Blumen haben .frische. (frisch) Blüten",
            "Der Lehrer gibt eine .interessante. (interessant) Lektion", "Das ist ein .schickes. (schick) Auto",
            "Ich trage .gemütliche. (gemütlich) Schuhe", "Wir haben .gute. (gut) Freunde",
            "Das Konzert war .fantastisch. (fantastisch)", "Der Park hat .grüne. (grün) Bäume",
            "Ich habe ein .weiches. (weich) Kissen", "Die Sonne gibt .warmes. (warm) Licht",
            "Das ist ein .modernes. (modern) Smartphone", "Wir haben .gesunde. (gesund) Lebensmittel gekauft",
            "Ich trinke .fruchtigen. (fruchtig) Saft", "Das Gemälde hat .bunte. (bunt) Farben",
            "Ich höre .ruhige. (ruhie) Musik", "Der Wald hat .hohe. (hoh) Bäume",
            "Das Buch hat eine .spannende. (spannend) Handlung", "Ich trinke .kalten. (kalt) Kaffee",
            "Der See hat .klare. (klar) Wasser", "Die Stadt hat .historische. (historisch) Gebäude",
            "Wir haben .frische. (frisch) Luft", "Das ist ein .gemütliches. (gemütlich) Sofa",
            "Die Blumen sind .duftende. (duftend) Rosen", "Ich esse .knuspriges. (knusprig) Brot",
            "Das ist ein .helles. (hell) Zimmer", "Wir haben .buntes. (bunt) Papier",
            "Ich trage .moderne. (modern) Kleidung"};
    String sentens_adj_b1[]={"Das ist ein .groß. (groß) Buch", "Ich trinke .heißen. (heiß) Tee",
            "Der Hund hat einen .braun. (braun) Fell", "Wir haben .frisch. (frisch) Obst gekauft",
            "Das ist ein .interessant. (interessant) Experiment", "Mein Bruder spielt ein .schnell. (schnell) Computerspiel",
            "Sie trägt ein .schön. (schön) Kleid", "Die Blumen sind .bunt. (bunt) Tulpen",
            "Ich esse ein .lecker. (lecker) Eis", "Das war eine .aufregend. (aufregend) Erfahrung",
            "Die Katze hat einen .klein. (klein) Schwanz", "Wir haben .neu. (neu) Möbel gekauft",
            "Das ist ein .teuer. (teuer) Restaurant", "Ich höre .laut. (laut) Musik",
            "Wir haben .sauber. (sauber) Wasser", "Das Haus hat ein .hoch. (hoch) Dach",
            "Sie trägt einen .modern. (modern) Hut", "Ich lese ein .spannend. (spannend) Buch",
            "Wir essen .gesund. (gesund) Lebensmittel", "Die Blumen haben .frisch. (frisch) Blüten",
            "Der Lehrer gibt eine .interessant. (interessant) Lektion", "Das ist ein .schick. (schick) Auto",
            "Ich trage .gemütlich. (gemütlich) Schuhe", "Wir haben .gut. (gut) Freunde",
            "Das Konzert war .fantastisch. (fantastisch)", "Der Park hat .grün. (grün) Bäume",
            "Ich habe ein .weich. (weich) Kissen", "Die Sonne gibt .warm. (warm) Licht",
            "Das ist ein .modern. (modern) Smartphone", "Wir haben .gesund. (gesund) Lebensmittel gekauft",
            "Ich trinke .fruchtig. (fruchtig) Saft", "Das Gemälde hat .bunt. (bunt) Farben",
            "Ich höre .ruhig. (ruhig) Musik", "Der Wald hat .hoch. (hoch) Bäume",
            "Das Buch hat eine .spannend. (spannend) Handlung", "Ich trinke .kalt. (kalt) Kaffee",
            "Der See hat .klar. (klar) Wasser", "Die Stadt hat .historisch. (historisch) Gebäude",
            "Wir haben .frisch. (frisch) Luft", "Das ist ein .gemütlich. (gemütlich) Sofa",
            "Die Blumen sind .duftend. (duftend) Rosen", "Ich esse .knusprig. (knusprig) Brot",
            "Das ist ein .hell. (hell) Zimmer", "Wir haben .bunt. (bunt) Papier",
            "Ich trage .modern. (modern) Kleidung", "Die Jacke hat .warm. (warm) Stoff",
            "Wir sehen .interessant. (interessant) Film", "Der Lehrer erklärt .kompliziert. (kompliziert) Stoff",
            "Die Blumen bekommen .frisch. (frisch) Wasser", "Das ist ein .gefährlich. (gefährlich) Abenteuer",
            "Ich esse .gesund. (gesund) Salat", "Der Kaffee hat .stark. (stark) Geschmack",
            "Sie trägt .modern. (modern) Brille", "Wir haben .frisch. (frisch) Gemüse",
            "Das ist ein .traditionell. (traditionell) Gericht", "Die Blumen haben .farbenfroh. (farbenfroh) Anblick",
            "Der Tisch hat .sauber. (sauber) Oberfläche", "Wir hören .harmonisch. (harmonisch) Musik",
            "Das Buch hat .interessant. (interessant) Inhalt", "Ich trinke .frisch. (frisch) Saft",
            "Die Stadt hat .historisch. (historisch) Charme", "Der Pullover hat .weich. (weich) Stoff",
            "Wir haben .klein. (klein) Geschenke gekauft", "Das ist ein .hochwertig. (hochwertig) Produkt",
            "Ich lese .fesselnd. (fesselnd) Roman", "Die Kinder spielen .fröhlich. (fröhlich) Spiel",
            "Wir haben .günstig. (günstig) Angebot genutzt", "Das ist ein .ruhig. (ruhig) Ort",
            "Die Blumen haben .duftend. (duftend) Geruch", "Wir essen .lecker. (lecker) Dessert",
            "Das Kleid hat .elegant. (elegant) Schnitt", "Der Film hat .spannend. (spannend) Handlung",
            "Wir haben .lecker. (lecker) Kuchen probiert",
            "Das ist ein .gemütlich. (gemütlich) Abend", "Die Jacke hat .warm. (warm) Fütterung",
            "Ich trinke .aromatisch. (aromatisch) Kaffee", "Der Wald hat .ruhig. (ruhig) Charakter",
            "Wir haben .erfolgreich. (erfolgreich) Tag", "Das ist ein .fruchtbar. (fruchtbar) Land",
            "Die Blumen haben .üppig. (üppig) Blütenstand", "Der Park hat .gepflegt. (gepflegt) Rasen",
            "Wir hören .melodisch. (melodisch) Gesang", "Das ist ein .traditionell. (traditionell) Brauch",
            "Ich trinke .klar. (klar) Wasser", "Die Stadt hat .modern. (modern) Flair",
            "Der Pullover hat .weich. (weich) Wolle", "Wir haben .interessant. (interessant) Entdeckung gemacht",
            "Das Buch hat .lehrreich. (lehrreich) Charakter", "Ich esse .herzhaft. (herzhaft) Frühstück",
            "Die Kinder spielen .lustig. (lustig) Spielzeug", "Wir haben .interessant. (interessant) Artikel gelesen",
            "Das ist ein .aufregend. (aufregend) Moment", "Die Blumen haben .wunderschön. (wunderschön) Duft",
            "Der Film hat .ergreifend. (ergreifend) Schluss", "Wir trinken .würzig. (würzig) Tee",
            "Das ist ein .erfrischend. (erfrischend) Getränk", "Die Stadt hat .aufregend. (aufregend) Atmosphäre",
            "Wir haben .gut. (gut) Rat erhalten", "Das Kleid hat .schön. (schön) Schnitt",
            "Ich trage .festlich. (festlich) Anzug",     "Der Geschmack .würzigen. (würzigen) Essens gefällt mir.",
            "Die Farben .bunten. (bunten) Blumen sind beeindruckend.", "Die Größe .hohen. (hohen) Gebäudes ist beeindruckend.",
            "Die Wärme .sonnigen. (sonnigen) Tages ist angenehm.", "Die Schönheit .malerischen. (malerischen) Landschaft ist atemberaubend.",
            "Die Klänge .melodischen. (melodischen) Musik beruhigen mich.", "Die Form .eleganten. (eleganten) Kleids ist ansprechend.",
            "Die Qualität .teuren. (teuren) Weins ist außergewöhnlich.", "Die Ruhe .abgeschiedenen. (abgeschiedenen) Orts ist erholsam.",
            "Die Geschwindigkeit .schnellen. (schnellen) Autos beeindruckt.", "Die Kälte .eisigen. (eisigen) Winters ist intensiv.",
            "Die Helligkeit .klaren. (klaren) Himmels ist erstaunlich.", "Die Vielfalt .bunten. (bunten) Vogelgezwitschers ist faszinierend.",
            "Die Intensität .starken. (starken) Kaffees weckt mich auf.", "Die Textur .weichen. (weichen) Sandes unter den Füßen ist angenehm.",
            "Die Pracht .prächtigen. (prächtigen) Sonnenuntergangs ist unvergesslich.", "Die Reinheit .klaren. (klaren) Wassers ist beeindruckend.",
            "Die Lebendigkeit .belebten. (belebten) Marktplatzes ist ansteckend.", "Die Tiefe .dunklen. (dunklen) Waldes ist geheimnisvoll.",
            "Die Schärfe .scharfen. (scharfen) Messers erleichtert das Schneiden."};
    String sentens_adj_b2[]={    "Die Nuancen .vielschichtigen. (vielschichtig) Gemäldes sind für den Kunstexperten von großem Interesse.",
            "Die Eleganz .stilvollen. (stilvoll) Banketts beeindruckte alle Gäste während der Gala.",
            "Die Besonderheiten .kulturellen. (kulturell) Erbes dieser Region sind in jedem Detail ihrer Architektur zu erkennen.",
            "Die Komplexität .technologischen. (technologisch) Fortschritts erfordert ständige Anpassungen in der beruflichen Weiterbildung.",
            "Die Kombination .verschiedenen. (verschieden) Einflüsse macht die Musik dieses Künstlers so einzigartig.",
            "Die Dynamik .sich entwickelnden. (sich entwickelnd) Wirtschaftszweiges eröffnet zahlreiche geschäftliche Möglichkeiten.",
            "Die Interpretation .literarischen. (literarisch) Werks erfordert eine tiefgehende Analyse der kulturellen Kontexte seiner Entstehung.",
            "Die Faszination .unbekannten. (unbekannt) Universums regt die Forscher an, immer weiter in die Tiefen des Weltraums vorzudringen.",
            "Die Tiefe .philosophischen. (philosophisch) Denkens des Autors spiegelt sich in den komplexen Schichten seiner Romane wider.",
            "Die Harmonie .künstlerischen. (künstlerisch) Ausdrucks in diesem Gemälde vermittelt ein Gefühl von zeitloser Schönheit.",
            "Die Anziehungskraft .historischen. (historisch) Stadtkerns liegt in der Mischung aus architektonischem Erbe und modernem Lebensstil.",
            "Die Kompliziertheit .zwischenmenschlichen. (zwischenmenschlich) Beziehungen wird in diesem psychologischen Drama intensiv dargestellt.",
            "Die Vielfalt .ökologischen. (ökologisch) Systems dieses Naturschutzgebiets unterstützt eine beeindruckende Artenvielfalt.",
            "Die Exklusivität .luxuriösen. (luxuriös) Resorts zeichnet sich durch erstklassigen Service und anspruchsvolles Design aus.",
            "Die Spannung .wirtschaftlichen. (wirtschaftlich) Wandels eröffnet Chancen für innovative Unternehmensmodelle.",
            "Die Authentizität .traditionellen. (traditionell) Festivals spiegelt die kulturellen Wurzeln der Gemeinschaft wider.",
            "Die Innovation .technischen. (technisch) Fortschritts beeinflusst alle Aspekte des modernen Lebens.",
            "Die Herausforderungen .globalen. (global) Wettbewerbs erfordern eine strategische Herangehensweise in der Unternehmensführung.",
            "Die Raffinesse .kulinarischen. (kulinarisch) Genusses offenbart sich in der sorgfältigen Auswahl der Zutaten und der Kochtechniken.",
            "Die Vielseitigkeit .künstlerischer. (künstlerisch) Ausdrucksformen ermöglicht eine breite Palette kreativer Interpretationen.",
            "Der .verantwortungsbewusste. (verantwortungsbewusst) Manager leitet das Projekt.",
            "Die .innovative. (innovativ) Technologie hat die Industrie revolutioniert.",
            "Die .konfliktfreie. (konfliktfrei) Zusammenarbeit fördert das Teamklima.",
            "Der .anspruchsvolle. (anspruchsvoll) Film erhielt mehrere Auszeichnungen.",
            "Die .facettenreiche. (facettenreich) Persönlichkeit beeindruckt ihr Umfeld.",
            "Seine .kompetente. (kompetent) Beratung hat uns sehr geholfen.",
            "Die .umweltfreundliche. (umweltfreundlich) Initiative setzt sich für Nachhaltigkeit ein.",
            "Der .charismatische. (charismatisch) Redner fesselte das Publikum mit seinen Worten.",
            "Die .anspruchsvolle. (anspruchsvoll) Aufgabe erfordert höchste Präzision.",
            "Die .kulturelle. (kulturell) Vielfalt bereichert unsere Gesellschaft.",
            "Seine .kommunikativen. (kommunikativ) Fähigkeiten tragen zum Teamerfolg bei.",
            "Das .effiziente. (effizient) Management optimiert den Arbeitsablauf.",
            "Die .vielschichtige. (vielschichtig) Handlung des Romans begeisterte die Leser.",
            "Ihre .umfassende. (umfassend) Kenntnis des Themas beeindruckt die Experten.",
            "Der .vielseitige. (vielseitig) Künstler beherrscht verschiedene Kunstformen.",
            "Die .zukunftsorientierte. (zukunftsorientiert) Strategie sichert den Unternehmenserfolg.",
            "Der .anspruchsvolle. (anspruchsvoll) Kurs setzt fortgeschrittene Kenntnisse voraus.",
            "Die .effektive. (effektiv) Werbekampagne steigerte den Umsatz erheblich.",
            "Sein .selbstbewusstes. (selbstbewusst) Auftreten macht einen bleibenden Eindruck.",
            "Die .sorgfältige. (sorgfältig) Planung garantiert einen reibungslosen Ablauf.",
            "Ihre .anspruchsvolle. (anspruchsvoll) Forschungsarbeit wurde in Fachkreisen anerkannt.",
            "Der .visionäre. (visionär) Unternehmer setzt neue Maßstäbe in der Branche.",
            "Die .tiefgründige. (tiefgründig) Diskussion offenbarte verschiedene Perspektiven.",
            "Sein .facettenreiches. (facettenreich) Talent zeigt sich in verschiedenen Kunstformen.",
            "Die .leidenschaftliche. (leidenschaftlich) Rede inspirierte die Zuhörer zutiefst.",
            "Ihre .intensive. (intensiv) Arbeit am Projekt zahlt sich in beeindruckenden Ergebnissen aus.",
            "Der .versierte. (versiert) Experte klärte alle Unklarheiten im Fachgespräch.",
            "Die .innovative. (innovativ) Technologie setzt neue Maßstäbe in der Branche.",
            "Seine .reflektierte. (reflektiert) Sichtweise trägt zur Lösung komplexer Probleme bei.",
            "Die .profunde. (profund) Analyse lieferte tiefe Einblicke in die Materie.",
            "Der .eloquente. (eloquent) Redner überzeugte das Publikum mit seinen Argumenten.",
            "Ihre .anspruchsvollen. (anspruchsvollen) Texte sind für literarische Kenner geschrieben.",
            "Die .systematische. (systematisch) Vorgehensweise ermöglichte einen strukturierten Prozess.",
            "Der .gebildete. (gebildet) Mann spricht mehrere Sprachen fließend.",
            "Die .differenzierte. (differenziert) Betrachtung des Themas berücksichtigt verschiedene Aspekte.",
            "Sein .respektvoller. (respektvoll) Umgang trägt zur positiven Teamdynamik bei.",
            "Die .anspruchsvolle. (anspruchsvolle) Architektur des Gebäudes beeindruckt jeden Besucher.",
            "Ihre .visionäre. (visionäre) Idee revolutioniert die Art und Weise, wie wir denken.",
            "Der .gebildete. (gebildete) Gelehrte hat bedeutende Beiträge zur Forschung geleistet.",
            "Die .präzise. (präzise) Ausführung der Aufgabe zeigt sein handwerkliches Geschick.",
            "Sein .analytischer. (analytisch) Verstand ermöglicht ihm, komplexe Probleme zu lösen.",
            "Die .selbstständige. (selbstständig) Umsetzung des Projekts zeugt von seiner Initiative.",
            "Ihre .innovative. (innovative) Denkweise inspiriert das gesamte Team.",
            "Der .konstruktive. (konstruktiv) Dialog führte zu einer nachhaltigen Lösung.",
            "Die .profunde. (profund) Kenntnis des Themas spiegelt sich in seinen Veröffentlichungen wider.",
            "Sein .analytischer. (analytisch) Blick auf die Situation ermöglichte eine genaue Diagnose.",
            "Die .kreative. (kreativ) Gestaltung des Events beeindruckte die Teilnehmer.",
            "Ihre .gewissenhafte. (gewissenhaft) Arbeit am Projekt zahlt sich in Qualität aus.",
            "Der .anspruchsvolle. (anspruchsvolle) Stil des Künstlers ist für Kenner leicht erkennbar.",
            "Seine .umfangreichen. (umfangreichen) Kenntnisse machen ihn zu einem Experten auf seinem Gebiet."
    };

    String sentens_konj_a2[]={"Wenn ich Zeit .hätte. (haben), würde ich gerne lesen.",
            "Wenn es warm .wäre. (sein), könnte ich im Garten arbeiten.",
            "Wenn du mich besuchen .würdest. (werden), freute ich mich.",
            "Ich .würde. (werden) gerne besser Deutsch sprechen.",
            "Wenn es regnen .würde. (werden), bliebe ich zu Hause.",
            "Sie .hätte. (haben) gerne ein neues Auto.",
            "Wenn er Zeit .hätte. (haben), käme er zum Meeting.",
            "Ich .würde. (werden) gern nach Paris reisen.",
            "Wenn es kalt .wäre. (sein), trügen wir warme Kleidung.",
            "Du .würdest. (werden) dich freuen, sie zu sehen.",
            "Wenn ich reich .wäre. (sein), kaufte ich ein Haus.",
            "Er .hätte. (haben) gern einen Hund.",
            "Ich .würde. (werden) gerne Klavier spielen können.",
            "Wenn es Sommer .wäre. (sein), ginge ich schwimmen.",
            "Sie .hätten. (haben) gern mehr Freizeit.",
            "Wenn du müde .wärst. (sein), könntest du dich ausruhen.",
            "Ich .würde. (werden) gerne besser kochen können.",
            "Wenn es ruhig .wäre. (sein), könnte ich besser schlafen.",
            "Er .hätte. (haben) gerne einen großen Garten.",
            "Wir .würden. (wollen) gerne die Welt bereisen.",
            "Wenn es hell .wäre. (sein), könnte ich besser sehen.",
            "Sie .hätten. (haben) gerne mehr Möglichkeiten.",
            "Wenn ich jung .wäre. (sein), würde ich mehr Abenteuer erleben.",
            "Er .würde. (werden) gerne besser zeichnen können.",
            "Wenn es leise .wäre. (sein), könnte ich mich besser konzentrieren.",
            "Ich .hätte. (haben) gern mehr Bücher.",
            "Wenn du traurig .wärst. (sein), würde ich dich trösten.",
            "Sie .würden. (wollen) gerne öfter ins Kino gehen.",
            "Wenn es schnell .wäre. (sein), käme ich pünktlich an.",
            "Wir .hätten. (haben) gern ein größeres Haus.",
            "Wenn ich stark .wäre. (sein), könnte ich schwere Sachen heben.",
            "Ich .würde. (werden) gerne besser fotografieren können.",
            "Wenn es gesund .wäre. (sein), könnte ich mehr Sport treiben.",
            "Er .hätte. (haben) gerne mehr Freunde.",
            "Wenn du klug .wärst. (sein), könntest du schwierige Aufgaben lösen.",
            "Sie .würden. (wollen) gerne ein neues Auto kaufen.",
            "Wenn es schön .wäre. (sein), könnten wir im Park picknicken.",
            "Ich .hätte. (haben) gern mehr Zeit für meine Hobbys.",
            "Wenn du glücklich .wärst. (sein), würdest du lachen.",
            "Er .würde. (werden) gerne besser tanzen können.",
            "Wenn es ruhig .wäre. (sein), könnte ich besser studieren.",
            "Wir .hätten. (haben) gerne ein Ferienhaus am Strand.",
            "Wenn ich krank .wäre. (sein), müsste ich zum Arzt gehen.",
            "Sie .würden. (wollen) gerne in einem großen Unternehmen arbeiten.",
            "Wenn es dunkel .wäre. (sein), würden die Sterne sichtbar werden.",
            "Ich .hätte. (haben) gern einen besseren Job.",
            "Wenn du müde .wärst. (sein), könntest du dich ausruhen.",
            "Er .würde. (werden) gerne mehr Sprachen sprechen können.",
            "Wenn es heiß .wäre. (sein), könnten wir Eis essen.",
            "Sie .hätten. (haben) gerne ein moderneres Handy.",
            "Wenn ich reich .wäre. (sein), würde ich wohltätige Zwecke unterstützen.",
            "Wir .würden. (wollen) gerne mehr Zeit mit der Familie verbringen.",
            "Wenn es interessant .wäre. (sein), würde ich es lesen.",
            "Er .hätte. (haben) gerne einen besseren Computer.",
            "Wenn du mutig .wärst. (sein), könntest du neue Dinge ausprobieren.",
            "Ich .würde. (werden) gerne besser schwimmen können.",
            "Wenn es still .wäre. (sein), könnte ich mich besser konzentrieren.",
            "Sie .hätten. (haben) gerne mehr Urlaubstage.",
            "Wenn ich fit .wäre. (sein), würde ich mehr Sport treiben.",
            "Er .würde. (werden) gerne besser singen können.",
            "Wenn es sonnig .wäre. (sein), könnten wir spazieren gehen.",
            "Wir .hätten. (haben) gerne einen größeren Fernseher.",
            "Wenn ich talentiert .wäre. (sein), würde ich ein Instrument spielen können.",
            "Sie .würden. (wollen) gerne öfter ins Theater gehen.",
            "Wenn es gemütlich .wäre. (sein), könnte ich besser entspannen.",
            "Ich .hätte. (haben) gerne einen schnelleren Internetanschluss.",
            "Wenn du höflich .wärst. (sein), würden die Leute dich mögen.",
            "Er .würde. (werden) gerne besser kochen können."};
    String sentens_konj_b1[]={"Wenn ich Zeit .hätte. (haben), würde ich gerne ein Buch lesen.",
            "Wenn es warm .wäre. (sein), könnte ich im Garten Gemüse anbauen.",
            "Wenn du mich besuchen .würdest. (werden), würde ich mich sehr freuen.",
            "Ich .würde. (werden) gerne fließend Spanisch sprechen können.",
            "Wenn es regnen .würde. (werden), würde ich einen Regenschirm mitnehmen.",
            "Sie .hätten. (haben) gerne ein umweltfreundliches Auto.",
            "Wenn er Zeit .hätte. (haben), käme er zur Besprechung.",
            "Ich .würde. (werden) gerne eine kulinarische Reise um die Welt machen.",
            "Wenn es kalt .wäre. (sein), würden wir uns warm anziehen.",
            "Du .würdest. (werden) dich freuen, sie wiederzusehen.",
            "Wenn ich reich .wäre. (sein), würde ich in eine Villa ziehen.",
            "Er .hätte. (haben) gern die Möglichkeit, von zu Hause aus zu arbeiten.",
            "Ich .würde. (werden) gerne Klavierspielen lernen.",
            "Wenn es Sommer .wäre. (sein), würde ich gerne am Strand liegen.",
            "Sie .hätten. (haben) gerne ein modernes Smartphone.",
            "Wenn du müde .wärst. (sein), könntest du eine Pause machen.",
            "Ich .würde. (werden) gerne fließend Französisch sprechen können.",
            "Wenn es ruhig .wäre. (sein), könnte ich besser konzentriert arbeiten.",
            "Er .hätte. (haben) gerne eine gut ausgestattete Küche.",
            "Wir .würden. (werden) gerne eine Weltreise unternehmen.",
            "Wenn es hell .wäre. (sein), könnte ich besser lesen.",
            "Sie .hätten. (haben) gerne mehr Freizeitmöglichkeiten.",
            "Wenn ich jung .wäre. (sein), würde ich Abenteuerurlaub machen.",
            "Er .würde. (werden) gerne professionell fotografieren können.",
            "Wenn es leise .wäre. (sein), könnte ich mich besser konzentrieren.",
            "Ich .hätte. (haben) gerne eine beeindruckende Bibliothek.",
            "Wenn du mich traurig .machen würdest. (machen), wäre ich enttäuscht.",
            "Sie .würden. (werden) gerne öfter ins Theater gehen.",
            "Wenn es schnell .gänge. (gehen), käme ich rechtzeitig an.",
            "Wir .hätten. (haben) gerne ein geräumigeres Zuhause.",
            "Wenn ich stark .wäre. (sein), könnte ich schwere Lasten heben.",
            "Ich .würde. (werden) gerne professionelle Fotografie lernen.",
            "Wenn es gesund .wäre. (sein), könnte ich mehr Sport treiben.",
            "Er .hätte. (haben) gerne mehr soziale Kontakte.",
            "Wenn du klug .wärst. (sein), könntest du komplexe Probleme lösen.",
            "Sie .würden. (werden) gerne ein neues Auto anschaffen.",
            "Wenn es schön .wäre. (sein), könnten wir draußen picknicken.",
            "Ich .hätte. (haben) gerne mehr Zeit für meine Hobbys.",
            "Wenn du glücklich .wärst. (sein), würdest du lächeln.",
            "Er .würde. (werden) gerne die Welt bereisen können.",
            "Wenn es ruhig .wäre. (sein), könnte ich besser studieren.",
            "Wir .hätten. (haben) gerne ein Ferienhaus am Meer.",
            "Wenn ich krank .wäre. (sein), müsste ich zum Arzt gehen.",
            "Sie .würden. (werden) gerne in einem großen Unternehmen arbeiten.",
            "Wenn es dunkel .wäre. (sein), würden die Sterne klarer sichtbar sein.",
            "Ich .hätte. (haben) gerne eine anspruchsvollere berufliche Herausforderung.",
            "Wenn du müde .wärst. (sein), könntest du dich ausruhen.",
            "Er .würde. (werden) gerne mehrere Sprachen fließend sprechen können.",
            "Wenn es heiß .wäre. (sein), könnten wir erfrischende Getränke genießen.",
            "Sie .hätten. (haben) gerne ein moderneres Mobiltelefon.",
            "Wenn ich reich .wäre. (sein), würde ich gemeinnützige Projekte unterstützen.",
            "Wir .würden. (werden) gerne mehr Zeit mit unseren Lieben verbringen.",
            "Wenn es interessant .wäre. (sein), würde ich es genauer untersuchen.",
            "Er .hätte. (haben) gerne einen leistungsstärkeren Computer.",
            "Wenn du mutig .wärst. (sein), könntest du neue Herausforderungen annehmen.",
            "Ich .würde. (werden) gerne sicherer schwimmen können.",
            "Wenn es still .wäre. (sein), könnte ich mich besser konzentrieren.",
            "Sie .hätten. (haben) gerne mehr Urlaubstage im Jahr.",
            "Wenn ich fit .wäre. (sein), würde ich regelmäßig Sport treiben.",
            "Er .würde. (werden) gerne besser singen können.",
            "Wenn es sonnig .wäre. (sein), könnten wir einen ausgedehnten Spaziergang machen.",
            "Wir .hätten. (haben) gerne einen größeren Flachbildfernseher.",
            "Wenn ich talentiert .wäre. (sein), würde ich ein Musikinstrument spielen können.",
            "Sie .würden. (werden) gerne öfter kulturelle Veranstaltungen besuchen."};
    String sentens_konj_b2[]={    "Wenn ich genügend Zeit .hätte. (haben), würde ich gerne ein anspruchsvolles Buch lesen.",
            "Wenn es unerwartet warm .würde. (werden), könnte ich im eigenen Gemüsegarten verschiedenes Gemüse anbauen.",
            "Wenn du mich spontan besuchen .würdest. (werden), würde ich mich außerordentlich freuen.",
            "Ich .könnte. (können) mir vorstellen, dass ich fließend Spanisch sprechen könnte.",
            "Wenn es überraschend stark .werden würde. (werden), würde ich sicherheitshalber einen Regenschirm mitnehmen.",
            "Sie .hätten. (haben) gerne ein umweltfreundliches Elektroauto.",
            "Wenn er ausreichend Zeit .hätte. (haben), käme er gewiss zur wichtigsten Besprechung des Jahres.",
            "Ich .würde. (werden) gerne eine kulinarische Weltreise um die kulinarischen Spezialitäten dieser Welt machen.",
            "Wenn es außergewöhnlich kalt .würde. (werden), würden wir uns mit warmen Kleidern schützen.",
            "Du .würdest. (werden) dich sicherlich freuen, sie wiederzusehen.",
            "Wenn ich finanziell erfolgreich .wäre. (sein), würde ich gerne in eine luxuriöse Villa ziehen.",
            "Er .könnte. (können) durchaus Interesse daran, von zu Hause aus arbeiten zu können.",
            "Ich .würde. (werden) gerne Klavierspielen lernen, um meine musikalischen Fähigkeiten zu erweitern.",
            "Wenn es unerwartet Sommer .würde. (werden), würde ich gerne am malerischen Strand liegen.",
            "Sie .könnten. (können) sich vorstellen, ein modernes Smartphone zu besitzen.",
            "Wenn du plötzlich müde .würdest. (werden), könntest du dir eine kurze Pause gönnen.",
            "Ich .könnte. (können) mir vorstellen, fließend Französisch sprechen zu können.",
            "Wenn es überraschend ruhig .würde. (werden), könnte ich besser konzentriert arbeiten.",
            "Er .könnte. (können) durchaus den Wunsch nach einer gut ausgestatteten Küche hegen.",
            "Wir .würden. (werden) gerne eine atemberaubende Weltreise unternehmen.",
            "Wenn es plötzlich hell .würde. (werden), könnte ich besser lesen.",
            "Sie .könnten. (können) gerne mehr Freizeitmöglichkeiten in Betracht ziehen.",
            "Wenn ich plötzlich jung .wäre. (sein), würde ich sicherlich Abenteuerurlaub machen.",
            "Er .könnte. (können) gerne professionell fotografieren lernen, um seine Fähigkeiten zu verbessern.",
            "Wenn es unerwartet leise .würde. (werden), könnte ich mich besser konzentrieren.",
            "Ich .hätte. (haben) gerne eine beeindruckende Bibliothek mit einer breiten Auswahl an Büchern.",
            "Wenn du mich unerwartet traurig .machen würdest. (werden), wäre ich wirklich enttäuscht.",
            "Sie .könnten. (können) gerne öfter ins Theater gehen, um kulturelle Ereignisse zu genießen.",
            "Wenn es unerwartet schnell .gehen würde. (gehen), käme ich rechtzeitig an.",
            "Wir .hätten. (haben) gerne ein geräumigeres Zuhause mit mehr Platz für die Familie.",
            "Wenn ich plötzlich sehr stark .wäre. (sein), könnte ich schwere Lasten mühelos heben.",
            "Ich .könnte. (können) gerne professionelle Fotografie lernen, um ein versierter Fotograf zu werden.",
            "Wenn es überraschend gesund .würde. (werden), könnte ich regelmäßig Sport treiben.",
            "Er .könnte. (können) durchaus Interesse daran, mehr soziale Kontakte zu knüpfen.",
            "Wenn du überraschend klug .wärst. (sein), könntest du komplexe Probleme leichter lösen.",
            "Sie .könnten. (können) gerne ein nagelneues Auto anschaffen, um moderne Technologie zu erleben.",
            "Wenn es unerwartet schön .würde. (werden), könnten wir spontan draußen picknicken.",
            "Ich .hätte. (haben) gerne mehr Zeit für meine vielfältigen Hobbys haben.",
            "Wenn du plötzlich glücklich .wärst. (sein), würdest du sicherlich strahlen.",
            "Er .könnte. (können) gerne die Welt bereisen können, um verschiedene Kulturen zu erleben.",
            "Wenn es überraschend ruhig .würde. (werden), könnte ich besser studieren.",
            "Wir .hätten. (haben) gerne ein Ferienhaus am Meer mit einem atemberaubenden Ausblick haben.",
            "Wenn ich plötzlich krank .wäre. (sein), müsste ich unbedingt einen Arzt aufsuchen.",
            "Sie .könnten. (können) gerne in einem renommierten Unternehmen arbeiten, um ihre Karriere voranzutreiben.",
            "Wenn es plötzlich dunkel .würde. (werden), würden die Sterne am Himmel klarer sichtbar werden.",
            "Ich .hätte. (haben) gerne eine anspruchsvollere berufliche Herausforderung annehmen.",
            "Wenn du überraschend müde .wärst. (sein), könntest du dich einfach ausruhen.",
            "Er .könnte. (können) gerne mehrere Sprachen fließend sprechen können, um interkulturelle Kommunikation zu fördern.",
            "Wenn es plötzlich heiß .würde. (werden), könnten wir uns mit erfrischenden Getränken abkühlen.",
            "Sie .hätten. (haben) gerne ein modernes Mobiltelefon mit den neuesten Funktionen.",
            "Wenn ich finanziell erfolgreich .wäre. (sein), würde ich gerne gemeinnützige Projekte unterstützen.",
            "Wir .würden. (werden) gerne mehr Zeit mit unseren Lieben verbringen und gemeinsame Aktivitäten genießen.",
            "Wenn es plötzlich interessant .würde. (werden), würde ich es genauer untersuchen.",
            "Er .könnte. (können) durchaus den Wunsch nach einem leistungsstärkeren Computer hegen.",
            "Wenn du überraschend mutig .wärst. (sein), könntest du neue Herausforderungen erfolgreich meistern.",
            "Ich .könnte. (können) gerne sicherer schwimmen können, um mehr Freude am Wassersport zu haben.",
            "Wenn es unerwartet still .würde. (werden), könnte ich mich besser auf meine Aufgaben konzentrieren.",
            "Sie .könnten. (können) gerne mehr Urlaubstage im Jahr haben, um längere Reisen unternehmen zu können.",
            "Wenn ich plötzlich fit .wäre. (sein), würde ich regelmäßig Sport treiben, um meine Gesundheit zu verbessern.",
            "Er .könnte. (können) gerne besser singen können, um seine künstlerischen Fähigkeiten zu erweitern.",
            "Wenn es plötzlich sonnig .würde. (werden), könnten wir einen ausgedehnten Spaziergang im Freien machen.",
            "Wir .hätten. (haben) gerne einen größeren Flachbildfernseher für ein besseres Heimkinoerlebnis haben.",
            "Wenn ich überraschend talentiert .wäre. (sein), würde ich ein Musikinstrument virtuos spielen können.",
            "Sie .könnten. (können) gerne öfter kulturelle Veranstaltungen besuchen, um ihre künstlerische Seite zu fördern.",
            "Wenn es plötzlich gemütlich .würde. (werden), könnte ich besser entspannen und die Ruhe genießen."};

    String sentensnow;
    String rightanswer;
    TextView teil1;
    TextView teil2;
    EditText editText;
    Button chek;
    RelativeLayout mainLayout;

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
        mainLayout=findViewById(R.id.layout);

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
       // Toast.makeText(adjEndungenAndKonj2.this, ""+rightanswer, Toast.LENGTH_SHORT).show();

    }

    public void checkAnswer(View view) {
        if(chek.getText().equals("Check")){
            if(editText.getText().toString().equals(rightanswer)){
                mainLayout.setBackgroundColor(ContextCompat.getColor(adjEndungenAndKonj2.this, R.color.lightGreen));
                chek.setText("Next");
            }
            else{
                mainLayout.setBackgroundColor(ContextCompat.getColor(adjEndungenAndKonj2.this, R.color.lightRed));
                System.out.println(rightanswer+" "+editText.getText());
            }
        }
        else{
            mainLayout.setBackgroundColor(ContextCompat.getColor(adjEndungenAndKonj2.this, R.color.litePurple));
            generateSentens();
            editText.setText("");
            chek.setText("Check");
        }
    }

    public void show_write_answer(View view){
        Toast.makeText(adjEndungenAndKonj2.this, "Korrekte Antwort ist:"+rightanswer, Toast.LENGTH_LONG).show();

    }
}