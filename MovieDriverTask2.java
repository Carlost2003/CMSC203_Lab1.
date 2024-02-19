
//Class: CMSC203 CRN XXXX 

// Program: Lab 1 

//Instructor: Professor Eivazi 

//Summary of Description: (@ program that will tell you a movie its rating and tickets sold)  

// Due Date: -2/18/2024 

// Integrity Pledge: I pledge that I have completed the programming assignment independently. 

//I have not copied the code from a student or any source. 
package Movie.java;
import java.util.Scanner;

public class MovieDriverTask2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();
        char cont = 'y';

        do {
            System.out.print("Enter the title of the movie: ");
            String title = scanner.nextLine();
            movie.setTitle(title);
           
            System.out.print("Enter the movie's rating: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);
           
            System.out.print("Enter the number of tickets sold at the theater: ");
            int soldTickets = scanner.nextInt();
            movie.setSoldTickets(soldTickets);
           
            System.out.println(movie);

            System.out.print("\nDo you want to continue (y/n)? ");
            cont = scanner.next().charAt(0);
            scanner.nextLine();
        } while (cont == 'y' || cont == 'Y');
        	
        	if(cont=='n'||cont=='N') {
        		 System.out.print("Goodbye");
        	}
        scanner.close();
    }
}