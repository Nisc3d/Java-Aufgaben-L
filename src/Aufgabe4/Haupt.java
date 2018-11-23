package Aufgabe4;

public class Haupt {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
//        Aufgabe 1:
//        try {
//            a = a / c;
//        } catch (ArithmeticException e){
//            System.out.println("Division durch 0!");
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//            e.printStackTrace();
//
//        }

//        Aufgabe3:
//        Divider d = new Divider();
//        d.dividiere(a, c);

        Sparbuch s = new Sparbuch("Herr Müller");
        try {
            s.einzahlen(100);
            s.setZinssatzProzent(15);
            s.verzinsen();
        }
        catch (KontoExistiertNichtException e){
            System.out.println("Konto existiert nicht!");
        }

        try {
            s.abheben(50);
        }
        catch (KontostandException f, KontoExistiertNichtException g){
            System.out.println("Zu wenig Geld auf Konto");
        }







    }
}
