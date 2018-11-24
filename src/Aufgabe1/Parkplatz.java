package Aufgabe1;

public class Parkplatz {

//  Erstelle Array für Autostellplätze vom Typ Auto mit Platz für 20 Autos
    Auto[] stellplatz = new Auto[20];

    void parkeAuto(Auto auto) {
        int i = 0;
        while (i < 20) {
            //wenn aktueller Stellplatz leer, dann schiebe Auto in Array Stellplatz an der Stelle und dann Schluss
            if (stellplatz[i] == null) {
                stellplatz[i] = auto;
                break;
            }
            //wenn nicht leer, nächster Stellplatz
            else {
                i += 1;
            }
        }
    }

    public void printParkplatzInfo() {
        int i = 0;
        while (i < 20) {
            if (stellplatz[i] == null) {
                System.out.println("Es stehen " + i + " Autos auf dem Aufgabe1.Parkplatz.");
                break;
            }
            System.out.println(stellplatz[i] + " steht auf Stellplatz Nummer " + i);
            i += 1;
        }
    }
    public void printStellpatzInfo(int stellplatz){
        System.out.println("Auf Stellplatz " + stellplatz + " steht " + this.stellplatz[stellplatz]);
    }
}

