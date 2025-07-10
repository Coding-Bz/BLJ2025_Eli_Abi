package com.zork;

public class Story {

public void Kapitel1(){
    System.out.printf("\uD83D\uDCD6 Kapitel 1 – Der Lüftungsschatten von Karaköy\n" +
            "Im Istanbul, in dem Schweigen als „passiver Widerstand“ gilt, lebt Jace – registrierter Bürger #78923-V, kategorisiert als „suboptimal belüftet“.\n" +
            "Doch Jace liebt Wind.\n" +
            "Nicht irgendeinen – sondern den eines 90er-Jahre-Ventilators, Marke Arçelik, den er heimlich im Basar von Üsküdar gegen einen USB-Stick mit dem osmanischen Gesetzbuch im MIDI-Format eingetauscht hat.\n" +
            "Leider darf in Istanbul niemand eigenständig Luftbewegung erzeugen, ohne zentralstaatliche Genehmigung.\n" +
            "\uD83E\uDDE0 Fun Fact (echt!): Gaziantep hat über 180 offiziell registrierte Baklava-Bäckereien und war die erste türkische Stadt mit UNESCO-Gastronomiestatus.\n"
    +"\n");
}

public void Kapitel2(){

    System.out.println("\uD83D\uDCD6 Kapitel 2 – Das Algorithmus-KI" +
            "Über Fatih thront der Algorithmus-KI: ein 12-stöckiger Turm aus Beton, betrieben von ChatGPT 1.0. Seine Stimme klingt wie eine kaputte Kassenansage." +
            "Jace wird vorgeladen – wegen unsachgemäßer Ventilator-Entstaubung.\n" +
            "\n" +
            "Im Verhörraum dreht sich ein Plakat:\n" +
            "\n" +
            "„Wind ist Widerstand. Schwitzen ist Gehorsam.“\n" +
            "\n");
    System.out.println("\uD83E\uDDED Was sagst du?");

}
public void Kapitel3(){
    System.out.println("\uD83D\uDCD6 Kapitel 3 – Trabzon-Express & die rebellischen Teetrinker\n" +
            "Mit Hilfe einer Aerodynamik-Studentin aus Rize flieht Jace nach Nordosten.\n" +
            "Sie erreichen den Trabzon-Express – eine nie gebaute U-Bahn, die dennoch fährt.\n" +
            "\n" +
            "Gesteuert wird sie von einer KI, die nur auf Schwarztee-Befehle reagiert:\n" +
            "\n" +
            "\uD83E\uDDE0 Echter Fun Fact: Rize produziert über 65 % des türkischen Tees. Der Nebel, der zwischen den Teefeldern liegt, ist legendär – und wird oft als „Zutat“ betrachtet.");
}


public void Kapitel4(){

    System.out.println("\uD83D\uDCD6 Kapitel 4 – Der Baklava-Kodex von Gaziantep\n" +
            "In Gaziantep – wo selbst das WLAN nach Sirup riecht – entdeckt Jace den Baklava-Kodex, ein uraltes Dokument, eingehüllt in Pistazienpaste, versteckt in der Zincirli Bedesten.\n" +
            "\n" +
            "Darin steht:\n" +
            "\n" +
            "„Wer Wind sucht, muss zuerst Hitze verstehen.“\n" +
            "\n" +
            "Er meditiert im Hammam Naib, visualisiert 47 Teigschichten, und versteht plötzlich:\n" +
            "Die letzte freie Luft ist unter dem Galataturm versteckt.\n" +
            "\n");


    System.out.println("WERBUNG: \uD83E\uDDE0 Gaziantep-Tourismus-Werbung (eingebaut):\n" +
            "\uD83D\uDCCD Top-Sehenswürdigkeiten in Gaziantep:\n" +
            "\n" +
            "\uD83C\uDFDB\uFE0F Zeugma-Mosaikmuseum – größtes Mosaikmuseum der Welt\n" +
            "\n" +
            "\uD83C\uDFF0 Gaziantep Festung – uralt, heute ein Museum für Widerstand\n" +
            "\n" +
            "\uD83E\uDDC1 Baklava-Straße (Elmacı Pazarı) – süßer als deine Träume\n" +
            "\n" +
            "\uD83D\uDEE0\uFE0F Kupfermarkt (Bakırcılar Çarşısı) – hör zu, wie Geschichte gehämmert wird\n"
            );
}

public void Kapitel5(){
    System.out.println("\uD83D\uDCD6 Kapitel 5 – Der Sturm von Kadıköy\n" +
            "Zurück in Istanbul.\n" +
            "\n" +
            "Jace bringt Mini-Ventilatoren, versteckt in Simit-Kisten.\n" +
            "\n" +
            "In Kadıköy, bekannt für rebellische Musik, Graffiti und furchtbare Parkmöglichkeiten, versammeln sich die Luftbrüder.\n" +
            "Angeführt von Vivienne, einer Fenster-Tänzerin und illegalen Luftakrobatin.\n" +
            "\n" +
            "Sie rufen:\n" +
            "\n" +
            "„Luft gehört dem Volk!“\n" +
            "\n" +
            "\uD83E\uDDE0 Kadıköy-Fakt: Seit 2022 gibt es dort ein Festival, bei dem Mülltonnen in Lautsprecher verwandelt werden – echtes Street-Art-Kunstwerk.");
}


public void  Kapitel6(){
    System.out.println("\uD83D\uDCD6 Finale – Die Brise der Befreiung\n" +
            "Der Galataturm beginnt zu rotieren.\n" +
            "Er war nie ein Aussichtspunkt.\n" +
            "Er war ein getarnter Windgenerator.\n" +
            "\n" +
            "Zum ersten Mal seit 2063 fließt freie Luft durch Istanbul.\n" +
            "Baklava-Krümel wehen wie Konfetti.\n" +
            "Kinder lachen. Tauben geraten in Panik.\n" +
            "\n" +
            "Jace steht – wie immer – vor seinem Ventilator.\n" +
            "\n" +
            "“Obwohl er an hat…\n" +
            "steht er einfach nur da.\n" +
            "Und genießt die Luft.”\n" +
            "\n" +
            "\uD83D\uDCDC Epilog – Verfassungszusatz Artikel 7a:\n" +
            "„Jeder Mensch hat das Recht auf Wind, Witz und mindestens 42 Schichten Baklava.“");
}


public void Hilfe(Player p){

    if (p.getInput().equals("Hilfe")){
        System.out.println("Hilfe:\n" +
                "\n" +
                "Ventilator\n" +
                "Verstecken\n" +
                "Durchsuchen\n" +
                "Salz hinzufügen\n" +
                "Gaziantep\n" +
                "Tee machen\n" +
                "Höre den Kodex\n" +
                "Reise nach Istanbul\n" +
                "Aktiviere den Generator\n" +
                "Eine Rede halten\n" +
                "Tanzen\n" +
                "Anschalten\n" +
                "nur putzen\n" +
                "Daten einsehen\n" +
                "nur schwitzen\n" +
                "fliehe\n" +
                "brühen\n" +
                "\n" +
                "\n");

    }



}

}

