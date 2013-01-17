/************************************************
Programm zur Berechnung des Medians einer Liste

Author: Lukas Klein <lukas.klein-q1j@rub.de>
Date: 28/11/12
*************************************************/

import java.lang.Math;

public class Bildverarbeitung2 {
    public static void main(String args[]) {
        int Werte[] = {22,0,4,2,62,262,25,2,86,7,21,6,9,2,1,5,11,45};
        System.out.println("Median 1: " + median(Werte));

        // Lukas Klein, LK = 7,6
        int Werte2[] = {33,9,2,6,5,8,2,4,8,43,58,34,2,5,2, 7, 6 };
        System.out.println("Median 2: " + median(Werte2));
    }

    private static double median(int[] values) {
        if(values.length % 2 == 0) { // Gerade, Mittelwert aus Ober-/Untermedian bilden
            return (values[values.length/2 - 1] + values[values.length/2]) / 2.0;
        } else { // Ungerade, all good :)
            return values[(int)Math.floor(values.length/2.0)];
        }
    }
}

/* Ausgabe:

lukas@ubuntu:~/Uni/1$ java Bildverarbeitung2
Median 1: 46.5
Median 2: 8.0

*/