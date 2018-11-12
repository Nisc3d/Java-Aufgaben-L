package Aufgabe2;

public class LKW extends Kraftfahrzeug {
    double max_last_t;

    public LKW(int anzahl_ps, String marke, double max_last_t){
        super(anzahl_ps, marke);
        this.max_last_t = max_last_t;
    }

    public void ausgeben(){
        System.out.println("Art: LKW");
        super.ausgeben();
        System.out.println("Maximale Last in Tonnen: " + max_last_t);
        System.out.println("");
    }
}
