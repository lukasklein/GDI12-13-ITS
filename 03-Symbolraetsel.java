/************************************************
Programm zum Loesen von Symbolraetseln
Leider nicht allgemein gehalten, das wurde zu
komplex. Aber fuer diese Aufgabe funktioniert es.

Author: Lukas Klein <lukas.klein-q1j@rub.de>
Date: 25/11/12
*************************************************/

public class Symbolraetsel {
    public static void main(String args[]) {
        int resultCount = 0;
        for(int h=1; h<10; h++) { // Einer der Anfangsbuchstaben => != 0
            for(int e=0; e<10; e++) {
                for(int s=0; s<10; s++) {
                    for(int t=1; t<10; t++) { // Einer der Anfangsbuchstaben => != 0
                        for(int b=1; b<10; b++) { // Einer der Anfangsbuchstaben => != 0
                            if(isValid(h, e, s, t, b)) {
                                System.out.println("Ergebnis " + resultCount + " gefunden!");
                                System.out.println(" "+h+e+s);
                                System.out.println("+"+t+h+e);
                                System.out.println("----");
                                System.out.println(""+b+e+s+t);
                                System.out.println("=> h = "+h+", e = "+e+", s = "+s+", t = "+t+", b="+b+"\n");
                                resultCount++;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean isValid(int h, int e, int s, int t, int b) {
        if(h == 0 || t == 0 || b == 0) { // Erste Ziffer muss != 0 sein
            return false;
        }
        if(h == e || h == s || h == t || h == b || e == s || e == t || e == b || s == t || s == b || t == b) { // Keine Doppelbelegungen
            return false;
        }
        return (s+11*e+110*h+100*t == t+10*s+100*e+1000*b); // Die Bedingung
    }
}

/* Ausgabe:

lukas@ubuntu:~/Uni/1$ java Symbolraetsel 
Ergebnis 0 gefunden!
 426
+842
----
1268
=> h = 4, e = 2, s = 6, t = 8, b=1

*/