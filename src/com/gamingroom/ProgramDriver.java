package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {

    /**
     * The one-and-only main() method
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // FIXME: Obtain reference to the singleton instance of the GameService class
        GameService service = GameService.getInstance();

        System.out.println("\nAbout to test initializing game data...");

        // FIXME: Create several Games, Teams and Players using the GameService
        Game game1 = service.addGame("Game #1");
        System.out.println(game1);
        Game game2 = service.addGame("Game #2");
        System.out.println(game2);

        // Use this method to run your application and test your code
        // You can add more test cases here if you want to verify functionality

        System.out.println("\nDone!");
    }
}
