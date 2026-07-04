import java.io.*;
import java.util.Scanner;

public class NotesApp {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Write Note");
            System.out.println("2. Read Notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    FileWriter fw = new FileWriter("notes.txt", true);

                    System.out.print("Enter your note: ");
                    String note = sc.nextLine();

                    fw.write(note + "\n");
                    fw.close();

                    System.out.println("Note Saved Successfully!");
                    break;

                case 2:
                    FileReader fr = new FileReader("notes.txt");
                    BufferedReader br = new BufferedReader(fr);

                    String line;

                    System.out.println("\nYour Notes:");
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }

                    br.close();
                    fr.close();
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}