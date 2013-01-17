/*********************************************
Programm zum Umrechnen von
einer Tagesanzahl in Jahre,
Monate und Tage.

Author: Lukas Klein <lukas.klein-q1j@rub.de>
Date: 18/11/12
*********************************************/

import inout.Console;

public class DateMadness {
    public static void main(String args[]) {
        int days_input, years, months, days;
        System.out.print("Geben Sie die Tagesanzahl ein (maximal 2.147.483.647): ");
        days_input = Console.readInt();

        years = days_input / 365;
        months = days_input % 365 / 30;
        days = days_input % 365 % 30;

        System.out.println(days_input + " Tage sind: " + years + " Jahre, " + months + " Monate und " + days + " Tage.");
    }
}

/* Ausgabe auf der Konsole:

lukas@ubuntu:~/Uni/1$ java DateMadness 
Geben Sie die Tagesanzahl ein (maximal 2.147.483.647): 1200
1200 Tage sind: 3 Jahre, 3 Monate und 15 Tage.
lukas@ubuntu:~/Uni/1$ java DateMadness 
Geben Sie die Tagesanzahl ein (maximal 2.147.483.647): 1337
1337 Tage sind: 3 Jahre, 8 Monate und 2 Tage.
*/