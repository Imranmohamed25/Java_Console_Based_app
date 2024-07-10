import java.util.*;
import java.lang.*;

public class Ticketbooking {

    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO THEATRE MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD THEATRES \t\t\t 2].ADD MOVIES");
        System.out.println();
        System.out.println("3].GET THEATRE DETAILS \t\t\t 4].GET MOVIE DETAILS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Theatredetails[] theatre = new Theatredetails[5];
        Movies[] movie = new Movies[5];

        int theatre_counter = 0;
        int movie_counter = 0;
        int choice = 100;

        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        theatre[theatre_counter] = new Theatredetails();
                        theatre[theatre_counter].set_details();
                        theatre_counter++;
                        System.out.println();
                        System.out.println("PRESS 1 TO ADD NEW THEATRE");
                        System.out.println("PRESS 9 TO GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        movie[movie_counter] = new Movies();
                        movie[movie_counter].set_details();
                        movie_counter++;
                        System.out.println();
                        System.out.println("PRESS 2 TO ADD NEW MOVIE");
                        System.out.println("PRESS 9 TO GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        for (int i = 0; i < theatre_counter; i++) {
                            theatre[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("PRESS 9 TO GO BACK TO MAIN MENU");
                        System.out.println("PRESS 0 TO EXIT");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < movie_counter; i++) {
                            movie[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("PRESS 9 TO GO BACK TO MAIN MENU");
                        System.out.println("PRESS 0 TO EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        choice = sc.nextInt();
                        break;
                }
            }
        }
    }
}

class Theatredetails {
    String theatre_name;
    String theatre_address;
    int numof_movie_running = 0;
    String movie_names;

    public void get_details() {
        System.out.println("Theatre Name: " + theatre_name);
        System.out.println("Theatre Address: " + theatre_address);
        System.out.println("Number of movies running now: " + numof_movie_running);
        System.out.println("Movie(s): " + movie_names);
    }

    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER THEATRE DETAILS *** =======================");
        System.out.println();
        System.out.print("THEATRE NAME: ");
        theatre_name = sc.nextLine();
        System.out.print("THEATRE ADDRESS: ");
        theatre_address = sc.nextLine();
        System.out.print("MOVIE NAME(S): ");
        movie_names = sc.nextLine();
        System.out.print("NUMBER OF MOVIES RUNNING: ");
        numof_movie_running = sc.nextInt();
    }
}

class Movies {
    String movie_name;
    String actor_name;
    String actress_name;
    String director_name;
    String production;
    String genre;

    public void get_details() {
        System.out.println("Movie Name: " + movie_name);
        System.out.println("Actor Name: " + actor_name);
        System.out.println("Actress Name: " + actress_name);
        System.out.println("Director Name: " + director_name);
        System.out.println("Production: " + production);
        System.out.println("Genre: " + genre);
    }

    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER MOVIE DETAILS *** =======================");
        System.out.println();
        System.out.print("MOVIE NAME: ");
        movie_name = sc.nextLine();
        System.out.print("ACTOR NAME: ");
        actor_name = sc.nextLine();
        System.out.print("ACTRESS NAME: ");
        actress_name = sc.nextLine();
        System.out.print("DIRECTOR NAME: ");
        director_name = sc.nextLine();
        System.out.print("PRODUCTION: ");
        production = sc.nextLine();
        System.out.print("GENRE: ");
        genre = sc.nextLine();
    }
}
