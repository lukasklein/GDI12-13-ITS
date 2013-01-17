/*
    @author Lukas Klein <lukas.klein-q1j@rub.de>
    @date 09.01.13
*/

import inout.*;

public class Verwaltung {
    static Student students[] = new Student[20];
    static int counter = 0;
    public static void main(String args[]) {
        int action = 0;
        while(action != -1) {
            System.out.print("Student erfassen (0), Student ausgeben (1), Abbrechen (-1): ");
            action = Console.readInt();
            switch(action) {
                case 0:
                    System.out.print("Name: ");
                    String name = Console.readString();
                    System.out.print("Geburtsjahr: ");
                    int year = Console.readInt();
                    students[counter] = new Student(name, year);
                    System.out.println("Student erstellt. Matrikelnummer: " + students[counter].getId());
                    counter++;
                    break;
                case 1:
                    System.out.print("Matrikelnummer: ");
                    int id = Console.readInt();
                    System.out.println(getStudentById(id).toString());
                    break;
            }
        }
    }

    private static Student getStudentById(int id) {
        for(int i = 0; i < counter; i++) {
            if(students[i].getId() == id) {
                return students[i];
            }
        }
        return new Student("I don't exist!", 1970);
    }
}


class Student {
    public static int counter = 0;
    private int matrikel_nr = 0;
    private String name = "";
    private int geburtsjahr = 1970;


    public Student(String name_, int geburtsjahr_) {
        matrikel_nr = counter;
        counter++;
        name = name_;
        geburtsjahr = geburtsjahr_;
    }

    public int getId() {
        return matrikel_nr;
    }

    public String toString() {
        return matrikel_nr + " - " + name + " (" + geburtsjahr + ")";
    }
}