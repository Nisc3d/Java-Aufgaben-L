package Aufgabe2;

public class PKW extends Kraftfahrzeug {
    int anzahl_sitz;

    public PKW(int anzahl_ps, String marke, int anzahl_sitz){
        super(anzahl_ps, marke);
        this.anzahl_sitz = anzahl_sitz;
    }

    public void ausgeben(){
        System.out.println("Art: PKW");
        super.ausgeben();
        System.out.println("Anzahl Sitzplätze: " + anzahl_sitz);
        System.out.println("");
    }
}
