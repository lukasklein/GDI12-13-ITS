/**
* Programm zur rekursiven Berechnung einer Summe
*
* @author Lukas Klein <lukas.klein-q1j@rub.de>
* @version 15.01.13
*/

public class Summe {
    public static void main(String args[]) {
        System.out.println("Die Summe aus 2 und 3 betraegt " + summe(2, 3));
    }

    private static int summe(int x, int y) {
        if(x == 0) {
            return y;
        } else {
            return summe(x - 1, y + 1);
        }
    }
}

/* Ausgabe auf der Konsole:
noname:Abschlussklausur lukas$ java Summe
Die Summe aus 2 und 3 betraegt 5
*/