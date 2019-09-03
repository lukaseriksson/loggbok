import java.util.ArrayList
import java.util.Scanner

public class menu {
    public menu() {
    }

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList();
        Scanner in = new Scanner(System.in);
        boolean running = true;

        while (running)

            if (input.equals("quit")) {
            running = false;
        } else{
            test.add(input);
        }

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
        }
        }
    }
}