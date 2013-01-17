/************************************************
Programm zur Umrechnung von Kilometern in Meilen
und umgekehrt
Eingabewerte werden über die Konsole eingelesen

Author: Lukas Klein <lukas.klein-q1j@rub.de>
Based on the awesome unit-conversion tool by
Junior-Programmiererin Susanne Jung
Date: 11/11/12
*************************************************/

import inout.Console; //Importieren des Pakets inout

public class MeilenKm
{
 public static void main (String args[])
 {
  double kilometer;
  double meilen;
  System.out.println("Geben Sie bitte die Kilometeranzahl ein:");
  //Aufruf der Methode readDoubleComma()
  kilometer = Console.readDoubleComma();
  meilen = 1.0/1.609344 * kilometer;
  System.out.println
    (kilometer + " Kilometer ergeben " + meilen + " Meilen");
  System.out.println("Geben Sie bitte die Meilenanzahl ein:");
    
  meilen = Console.readDoubleComma(); 
  kilometer = 1.609344  * meilen;
  System.out.println
   (meilen + " Meilen ergeben " + kilometer + " Kilometer");
 }
}

/*
Ausgabe in der Konsole:

lukas@ubuntu:~/Uni/1$ java MeilenKm 
Geben Sie bitte die Kilometeranzahl ein:
12
12.0 Kilometer ergeben 7.456454306848007 Meilen
Geben Sie bitte die Meilenanzahl ein:
11
11.0 Meilen ergeben 17.702784 Kilometer
*/