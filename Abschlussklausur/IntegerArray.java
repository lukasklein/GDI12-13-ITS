import inout.Console;

public class IntegerArray {
    static int array[] = new int[0];
    private static void push(int element) {
        // Create a new temporary array with old_length + 1 fields
        int array_[] = new int[array.length + 1];
        // Copy the old data over
        for(int i = 0; i < array.length; i++) {
            array_[i] = array[i];
        }
        // Append the new element
        array_[array.length] = element;
        // Reassign it to array
        array = array_;
    }

    private static int pop() {
        int to_pop = array[array.length - 1];
        // Create a new array with old_length - 1 fields
        int array_[] = new int[array.length - 1];
        // Copy the data over
        for(int i = 0; i < array.length - 1; i++) {
            array_[i] = array[i];
        }
        // Reassign
        array = array_;
        // Return the popped element
        return to_pop;
    }

    public static void main(String args[]) {
        int el = 0;
        while(el != -1) { // Repeat unless user inputs -1
            el = Console.readInt();
            if(el != -1) {
                push(el);
            }
        }
        // Output the elements in reverse order

        // Save the array length to another variable since the array will change during the output
        int count = array.length;
        for(int i = 0; i < count; i++) {
            System.out.print(pop());
            if (i < count -1) { // For all iterations except the last, output a comma
                System.out.print(", ");
            }
        }
        // Output a newline to avoid a messup in the terminal
        System.out.println();
    }
}

/* Ausgabe auf der Konsole:
noname:Abschlussklausur lukas$ java IntegerArray
1 
2
3
4
5
6
7
8
9
10
-1
10, 9, 8, 7, 6, 5, 4, 3, 2, 1
*/