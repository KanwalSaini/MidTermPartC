/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author kanwalsaini
 */
    import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Display list of possible genres
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Comedy");
        System.out.println("2. Drama");
        System.out.println("3. Action");
        System.out.println("4. Mystery");
     

        // Prompt user to choose genre
        int choice = scanner.nextInt();
        String genre = "";

        switch (choice) {
            case 1:
                genre = "Comedy";
                break;
            case 2:
                genre = "Drama";
                break;
            case 3:
                genre = "Action";
                break;
            case 4:
                genre = "Mystery";
                break;
            
            default:
                System.out.println("Invalid choice. Defaulting to Action.");
                genre = "Action";
        }

        // Display message
        System.out.println("User profile for " + name + " with favorite genre " + genre + " created.");
    }
}

    
