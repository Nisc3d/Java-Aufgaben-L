public class Start {
    public static void main(String[] args) {

//      Feld objekte in dem die Autos gespeichert werden, Typ Auto
        Auto[] objekte;

        Fabrik f = new Fabrik();

//      Produziere 30 Autos der Marke VW mit eindeutiger Seriennummer und zufälligen PS und Sitzplätzen
        objekte = f.ProduziereAuto(30);


//      Gebe Info über 1. Auto der Produktion aus
        objekte[0].printAutoInfo();

        Parkplatz p = new Parkplatz();

//      Parke 1. und 2. Auto der Produktion
        p.parkeAuto(objekte[0]);
        p.parkeAuto(objekte[1]);


//      Gebe Info über den Parkplatz aus
        p.printParkplatzInfo();

//      Gebe Info über Stellplatz 0 und 1 aus
        p.printStellpatzInfo(0);
        p.printStellpatzInfo(1);


    }
}