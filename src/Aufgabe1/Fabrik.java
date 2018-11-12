package Aufgabe1;

public class Fabrik {
    Auto[] ProduziereAuto(int anzahl) {
        int i = 0, seriennummer = 99999, anzahl_ps = 0, anzahl_sitz = 0;

//      Erstelle objekte Array vom Typ Aufgabe1.Auto, hier sind die Autos gespeichert
        Auto[] objekte = new Auto[anzahl];

//      Erstelle die Autos direkt in den Array
        while (i < anzahl) {
            seriennummer += 1;
            anzahl_ps = (int) (Math.random() * 1000);
            anzahl_sitz = (int) (Math.random() * 10);
            objekte[i] = new Auto("VW", seriennummer, anzahl_ps, anzahl_sitz);
            i += 1;
        }

//      Gebe den Array mit den Autos an die Aufrufstelle zurück
        return objekte;
    }
}
