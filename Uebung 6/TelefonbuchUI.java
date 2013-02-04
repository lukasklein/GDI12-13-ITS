/**
 * @author      Christoph Penkert <christoph.penkert@rub.de>, Lukas Klein <lukas.klein-q1j@rub.de>
 * @version     21-01-2013
 */

import java.util.ArrayList;
import inout.Console;

import Telefonbuch.TelefonbuchEintrag;
import Telefonbuch.TelefonbuchEintraege;

public class TelefonbuchUI {
    /**
    * Stores our TelefonbuchEintrags
    */
    private static TelefonbuchEintraege eintraege = new TelefonbuchEintraege();

    /**
    * The main program
    *
    * Handles the menu and stuff.
    */
    public static void main(String args[]) {
        int action = 0;
        while(action != -1) {
            printMenu();
            action = Console.readInt();
            switch(action) {
                case 1:
                    eintraege.add(addEntry());
                    output();
                    break;
                case 2:
                    output();
                    break;
                case 3:
                    search();
                    break;
            }
        }
    }

    /**
    * Prints the menu
    */
    private static void printMenu() {
        System.out.print("1: Neuer Eintrag 2: Ausgeben 3: Suchen -1: Beenden : ");
    }

    /**
    * Reads input from console
    *
    * @return A TelefonbuchEintrag object
    */
    private static TelefonbuchEintrag addEntry() {
        TelefonbuchEintrag contact = new TelefonbuchEintrag();
        System.out.print("Tel Nr: ");
        contact.setTelnr(Console.readString());
        System.out.print("Vorname: ");
        contact.setVor(Console.readString());
        System.out.print("Nachname: ");
        contact.setNach(Console.readString());
        System.out.print("Strasse: ");
        contact.setAdresse(Console.readString());
        System.out.print("Stadt: ");
        contact.setStadt(Console.readString());
        System.out.print("Plz: ");
        contact.setPLZ(Console.readString());

        return contact;
    }

    /**
    * Outputs all TelefonbuchEintrags
    */
    private static void output(TelefonbuchEintraege eintraege_) {
        for(int i = 0; i < eintraege_.size(); i++) {
            TelefonbuchEintrag contact = eintraege_.get(i);

            outputContact(contact);
        }
    }

    private static void output() {
        output(eintraege);
    }

    /**
    * Outputs a specific TelefonBucheintrag
    *
    * @param contact The contact you want to output
    */
    private static void outputContact(TelefonbuchEintrag contact) {
        System.out.println("Name: " + contact.getVor() + " " + contact.getNach());
        System.out.println("Telnr: " + contact.getTelnr());
        System.out.println();
    }

    /**
    * Reads query from console, outputs results
    */
    private static void search() {
        System.out.print("Name: ");
        String name = Console.readString();
        output(eintraege.search(name));
    }
}