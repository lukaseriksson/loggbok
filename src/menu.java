import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class menu {
    public menu() {
    }

    public static void main(String[] args) {
        System.out.println("loggbok");
        System.out.println("vad vill du göra i loggboken");
        System.out.println("Menu Options:");
        System.out.println("1. visa");
        System.out.println("2. skriv ny");
        System.out.println("3. redigera");
        System.out.println("4. spara");
        System.out.println("5. läsa in gammal");
        System.out.println("6. Exit");
        System.out.print("Please select an option from 1-6\r\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int input = Integer.parseInt(br.readLine());

            if(input < 0 || input > 6) {
                System.out.println("That's the wrong number\r\n");
            } else if(input == 6) {
                System.out.println("You have quit the program\r\n");
                System.exit(1);
            } else {
                System.out.println("You have entered " + input + "\r\n");
            }
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your input!\r\n");
            System.exit(1);
        }
    }
}