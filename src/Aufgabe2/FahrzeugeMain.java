package Aufgabe2;

public class FahrzeugeMain {
    public static void main(String[] args) {
        int i = 0;
        Kraftfahrzeug[] kraftfahrzeuge_feld = new Kraftfahrzeug[4];

        kraftfahrzeuge_feld[0] = new Kraftfahrzeug(100, "VW");
        kraftfahrzeuge_feld[1] = new LKW(200, "Porsche", 10);
        kraftfahrzeuge_feld[2] = new PKW(150, "Mercedes", 4);
        kraftfahrzeuge_feld[3] = new Motorrad(50, "Testmarke");


        while (i < 4){
            kraftfahrzeuge_feld[i].ausgeben();
            i+=1;
        }
    }
}
