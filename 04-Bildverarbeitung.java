/************************************************
Programm zur Ausgabe eines Histogramms fuer eine
Bildstruktur (oh, und zur Ausgabe des Bildes)

Author: Lukas Klein <lukas.klein-q1j@rub.de>
Date: 25/11/12
*************************************************/

import java.util.*;

public class Bildverarbeitung {
    public static void main(String args[]) {
        /*
        Erklaerung zu meiner Datenstruktur: in der ersten der beiden Listen sind die Werte an sich gespeichert,
        dahinter die Anzahl der Felder pro Zeile.
        */
        int werte[][] = {{34, 255, 255, 56, 127, 204, 11, 34, 123, 98, 127, 34, 34, 34, 127, 17}, {4}};
        printHistogram(werte);
    }

    private static void printHistogram(int[][] values) {
        // Output the image for reference
        for(int i = 0; i < values[0].length; i++) {
            if(i % values[1][0] == 0) { // Line-break
                System.out.println();
            }
            displayColorBlock(values[0][i]);
        }
        resetColor();
        System.out.println("\nHistogram:");
        int sortedValues[] = values[0];
        Arrays.sort(sortedValues); // Sort everything
        int valueCount[];
        valueCount = new int[sortedValues[sortedValues.length - 1] + 1];
        for(int i = 0; i < sortedValues.length; i++) {
            valueCount[sortedValues[i]]++; // Increase the count for the specific value
        }
        for(int row = 0; row < 2; row++) {
            System.out.print("|");
            List<Integer> alreadyOutput = new ArrayList<Integer>();
            for(int i = 0; i < sortedValues.length; i++) {
                if (!alreadyOutput.contains(sortedValues[i])) {
                    if(row == 0) {
                        System.out.print(valueCount[sortedValues[i]] + "\t|");
                    } else {
                        System.out.print(sortedValues[i] + "\t|");
                    }
                    alreadyOutput.add(sortedValues[i]);
                }
            }
            System.out.println();
        }
    }

    private static void displayColorBlock(int color) {
        // Use some ansi escape codes and a character from the cp437 to display the image
        System.out.print((char)27 + "[38;5;" + color + "m\u258A");
    }

    private static void resetColor() {
        // Reset the color to 255 (white)
        System.out.print((char)27 + "[38;5;255m");
    }
}

/* Ausgabe: (leider gehen hier die ansi-farben kaputt :()

lukas@ubuntu:~/Uni/1$ java Bildverarbeitung 

▊▊▊▊
▊▊▊▊
▊▊▊▊
▊▊▊▊
Histogram:
|1  |1  |5  |1  |1  |1      |3      |1      |2      |
|11 |17 |34 |56 |98 |123    |127    |204    |255    |
*/