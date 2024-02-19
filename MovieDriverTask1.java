
//Class: CMSC203 CRN XXXX 

// Program: Lab 1 

//Instructor: Professor Eivazi 

//Summary of Description: (@ program that will tell you a movie its rating and tickets sold)  

// Due Date: -2/18/2024 

// Integrity Pledge: I pledge that I have completed the programming assignment independently. 

//I have not copied the code from a student or any source. 
package Movie.java;

import java.util.Scanner;

public class MovieDriverTask1 {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       Movie movie = new Movie();

       System.out.print("Enter the name of the movie: ");
       String title = scanner.nextLine();
       movie.setTitle(title);

       System.out.print("Enter the rating of the movie: ");
       String rating = scanner.nextLine();
       movie.setRating(rating);

       System.out.print("Enter the number of tickets sold for this movie: ");
       int ticketsSold = scanner.nextInt();
       scanner.nextLine();
       movie.setSoldTickets(ticketsSold);

       System.out.println(movie.toString());
       System.out.println("Goodbye");
       scanner.close();
   }
}