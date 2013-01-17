/*********************************************
Programm zur Ausgabe von Mahntexten

Author: Lukas Klein <lukas.klein-q1j@rub.de>
Date: 04/12/12
*********************************************/

import inout.Console;

public class Mahntext {
    public static void main(String args[]) {
        String choices[] = new String[3];
        choices[0] = "Du sollst nicht vom W3L kopieren.";
        choices[1] = "Du sollst die Tan vom W3L nicht im Internet verbreiten.";
        choices[2] = "Du sollst Java verehren.";

        System.out.println("Auswahl von Mahntexten");
        printLine(22);
        for(int i = 0; i < choices.length; i++) {
            System.out.println("Mahntext: " + i);
        }
        System.out.println("Bitte waehlen Sie: ");
        printLine(22);

        int choice = 0;
        while(choice > -1) {
            System.out.print("Mahntext (-1 zum Beenden): ");
            choice = Console.readInt();

            if(choice >= 0 && choice < choices.length) {
                System.out.println(choices[choice]);
            } else {
                System.out.println("Diesen Mahntext gibt es nicht.");
            }
        }
    }

    private static void printLine(int length) {
        for(int i = 0; i < length; i++) {
            System.out.print('-');
        }
        System.out.println();
    }
}


/* Ausgabe auf der Konsole:

lukas@ubuntu:~/Uni/1$ java Mahntext 
Auswahl von Mahntexten
----------------------
Mahntext: 0
Mahntext: 1
Mahntext: 2
Bitte waehlen Sie: 
----------------------
Mahntext (-1 zum Beenden): 0
Du sollst nicht vom W3L kopieren.
Mahntext (-1 zum Beenden): 1
Du sollst die Tan vom W3L nicht im Internet verbreiten.
Mahntext (-1 zum Beenden): 2
Du sollst Java verehren.
Mahntext (-1 zum Beenden): 3
Diesen Mahntext gibt es nicht.
Mahntext (-1 zum Beenden): -1
Diesen Mahntext gibt es nicht.
*/